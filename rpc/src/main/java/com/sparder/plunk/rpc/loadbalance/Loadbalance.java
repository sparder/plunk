package com.sparder.plunk.register.loadbalance;

import java.net.InetSocketAddress;
import java.util.List;

/**
 * Created by ruxing.bao on 2016/10/4.
 */
public interface Loadbalance {

    InetSocketAddress select(List<InetSocketAddress> addressList);
}
