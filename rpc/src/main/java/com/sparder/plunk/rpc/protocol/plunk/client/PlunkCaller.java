package com.sparder.plunk.rpc.protocol.plunk.client;

import com.sparder.plunk.config.ApplicationConfig;
import com.sparder.plunk.core.Request;
import com.sparder.plunk.core.Response;
import com.sparder.plunk.remoting.Client;
import com.sparder.plunk.remoting.netty.NettyClient;
import com.sparder.plunk.rpc.protocol.Caller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ruxing.bao on 2016/10/20.
 */
public class PlunkCaller implements Caller {

    private ApplicationConfig app;

    private Map<String,Response> result = new HashMap<>();
    public PlunkCaller(ApplicationConfig app) {
        this.app = app;
    }
    @Override
    public Response call(Request request) {

        Client client = new NettyClient();
        client.start(app,new PlunkClientHandler(this));
        client.syncSend(request);
        waitResponse(request);
        return null;
    }


    private Response waitResponse(Request request)  {

        try {
            synchronized (result) {
                if(result.get(request.getCallId()) == null) {
                    result.wait();
                }
                Response response = result.get(request.getCallId());
                // .....
                return response;
            }
        } catch (InterruptedException e) {
             return null;
        }
    }
    @Override
    public void processResponse(Object result) {
        synchronized (result) {
            //unmarshall
           // result.put(callId,response);
            result.notifyAll();
        }
    }
}
