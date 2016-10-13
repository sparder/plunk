package com.sparder.plunk.remoting;

import com.sparder.plunk.config.Application;

/**
 * Created by ruxing.bao on 2016/10/3.
 */
public interface Client {

    void start(Application app, Handler handler);

    void syncSend(Object content);

    void asyncSend(Object content);

}
