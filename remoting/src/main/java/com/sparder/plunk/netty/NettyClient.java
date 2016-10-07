package com.sparder.plunk.netty;

import com.sparder.plunk.Application;
import com.sparder.plunk.Client;
import com.sparder.plunk.Handler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.compression.JdkZlibDecoder;
import io.netty.handler.codec.compression.JdkZlibEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;

/**
 * Created by ruxing.bao on 2016/10/3.
 */
public class NettyClient implements Client {

    private ChannelFuture channelFuture;


    public NettyClient() {

    }

    @Override
    public void start(Application app, Handler handler) {
        String host  = "";//app.getHost();l
        int port = 0; //app.getPort();

        EventLoopGroup group = new NioEventLoopGroup(2 * 8);
        Bootstrap client = new Bootstrap();
        client.group(group).channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .handler(new LoggingHandler((LogLevel.INFO)))
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel channel) throws Exception {
                        channel.pipeline()
                                //.addLast(new IdleStateHandler())

                                .addLast(new JdkZlibDecoder())
                                .addLast(new JdkZlibEncoder())
                                .addLast(new WriteTimeoutHandler(1000))
                                .addLast(new ReadTimeoutHandler(1000))
                                .addLast(new NettyClientHandler(handler));
                    }
                });
        try {
            channelFuture = client.connect(host,port).sync();
        } catch (InterruptedException e) {
            //
        }
    }

    @Override
    public void syncSend(Object content) {
        channelFuture.channel().writeAndFlush(content);
    }

    @Override
    public void asyncSend(Object content) {

    }
}
