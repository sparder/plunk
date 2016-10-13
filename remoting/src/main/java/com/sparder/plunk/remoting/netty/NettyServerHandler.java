package com.sparder.plunk.remoting.netty;

import com.sparder.plunk.remoting.Handler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


/**
 * Created by ruxing.bao on 2016/10/3.
 */
public class NettyServerHandler extends SimpleChannelInboundHandler<ByteBuf> {

    private Handler handler;

    public NettyServerHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf byteBuf) throws Exception {
        ByteBuf result = handler.process(byteBuf);
        ctx.writeAndFlush(result);
    }
}
