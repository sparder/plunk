package com.sparder.plunk.rpc.protocol.plunk.server;

import com.sparder.plunk.remoting.Handler;
import io.netty.buffer.ByteBuf;

/**
 * Created by ruxing.bao on 2016/10/19.
 */
public class PlunkServerHandler implements   Handler {
    @Override
    public ByteBuf process(ByteBuf buf) {

        //invoke service method
        return null;
    }
}
