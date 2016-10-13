package com.sparder.plunk.register.zookeeper;

import com.sparder.plunk.register.Register;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;

/**
 * Created by ruxing.bao on 2016/10/13.
 */
public class ZookeeperRegister implements Register {

    private CuratorFramework client;

    public ZookeeperRegister(String connectionAddress,int sessionTimeout, int connTimeout, int connWaitTime) {
        if(client != null) {
            RetryPolicy retryPolicy = new RetryNTimes(1000, connWaitTime);
            client = CuratorFrameworkFactory.newClient(connectionAddress,sessionTimeout,connTimeout,retryPolicy);
            client.start();

        }
    }
    @Override
    public void register(String name) {
        //register application
        //register protocol
        //register service
    }

    @Override
    public void unregister(String name) {

    }


    private byte[] get(String key) throws Exception {
        return client.getData().forPath(key);
    }

    private void set(String key, String value) throws Exception{
        client.create().creatingParentsIfNeeded().forPath(key, value.getBytes("utf-8"));
    }

    private void delte(String key) throws Exception {
        client.delete().forPath(key);
    }
}
