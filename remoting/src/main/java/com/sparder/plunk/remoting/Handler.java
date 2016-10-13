package com.sparder.plunk.remoting;

import io.netty.buffer.ByteBuf;

/**
 * Created by ruxing.bao on 2016/10/6.
 */
public interface Handler {

    ByteBuf process(ByteBuf buf);
}
