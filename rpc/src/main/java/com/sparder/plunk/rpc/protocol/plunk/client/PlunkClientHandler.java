package com.sparder.plunk.rpc.protocol.plunk.client;

import com.sparder.plunk.remoting.Handler;
import com.sparder.plunk.rpc.protocol.Caller;
import io.netty.buffer.ByteBuf;

/**
 * Created by ruxing.bao on 2016/10/20.
 */
public class PlunkClientHandler implements Handler {

    private Caller caller;
    public  PlunkClientHandler(Caller caller) {
        this.caller = caller;
    }
    @Override
    public ByteBuf process(ByteBuf buf) {
        caller.processResponse(buf);
        return null;
    }
}
