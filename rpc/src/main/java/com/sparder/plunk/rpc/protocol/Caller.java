package com.sparder.plunk.rpc.protocol;

import com.sparder.plunk.core.Request;
import com.sparder.plunk.core.Response;
/**
 * Created by ruxing.bao on 2016/10/20.
 */
public interface Caller {

    Response call(Request request);

    void processResponse(Object result);
}
