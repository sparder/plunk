package com.sparder.plunk.remoting.netty;

import com.sparder.plunk.config.Application;
import com.sparder.plunk.remoting.Handler;
import com.sparder.plunk.remoting.Server;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.compression.JdkZlibDecoder;
import io.netty.handler.codec.compression.JdkZlibEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;



/**
 * Created by ruxing.bao on 2016/10/6.
 */
public class NettyServer implements Server {
    @Override
    public void start(Application app, Handler handler) {
        EventLoopGroup mainGroup = new NioEventLoopGroup(1);
        EventLoopGroup subGroup = new NioEventLoopGroup(2 * Runtime.getRuntime().availableProcessors());
        ServerBootstrap server = new ServerBootstrap();
        server.group(mainGroup, subGroup).channel(NioServerSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY,true)
                .option(ChannelOption.SO_KEEPALIVE,true)
                .handler(new LoggingHandler(LogLevel.INFO))
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline()

                                .addLast(new JdkZlibDecoder())
                                .addLast(new JdkZlibEncoder())
                                .addLast(new NettyServerHandler(handler));
                    }
                });
    }
}
