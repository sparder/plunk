package com.sparder.plunk;

import io.netty.buffer.ByteBuf;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

/**
 * Created by ruxing.bao on 2016/10/6.
 */
public interface Handler {

    ByteBuf process(ByteBuf buf);
}
