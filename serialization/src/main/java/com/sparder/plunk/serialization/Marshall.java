package com.sparder.plunk.serialization;

/**
 * Created by ruxing.bao on 2016/10/19.
 */
public interface Marshall {
    byte[] encode(Object obj);

    Object decode (byte[] bytes);
}
