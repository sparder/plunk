package com.sparder.plunk.rpc.protocol.plunk;

import com.sparder.plunk.config.Application;
import com.sparder.plunk.remoting.Handler;
import com.sparder.plunk.remoting.netty.NettyServer;
import com.sparder.plunk.rpc.protocol.AbstractProtocol;
import com.sparder.plunk.remoting.Server;

/**
 * Created by ruxing.bao on 2016/10/19.
 */
public class PlunkProtocol extends AbstractProtocol {

    private Server server;
    private Application app;

    public  PlunkProtocol(Application app) {
        this.app = app;
    }
    @Override
    public void startup() {
        //get app from spring configuration

        Handler handler = new PlunkHandler();
        server = new NettyServer();
        server.start(app,handler);
    }
}
