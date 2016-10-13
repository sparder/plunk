package com.sparder.plunk.remoting;


import com.sparder.plunk.config.Application;

/**
 * Created by ruxing.bao on 2016/10/6.
 */
public interface Server {
    void start(Application app, Handler handler);
}
