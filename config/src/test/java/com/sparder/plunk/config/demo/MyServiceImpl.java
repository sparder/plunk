package com.sparder.plunk.config.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wsun3 on 10/18/2016.
 */
public class MyServiceImpl implements MyService {

    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + "Demo");
        return "Hello " + name + ", response form provider: " + "Local Demo";
    }
}
