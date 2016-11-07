/*
 * Copyright 2016-2026 Sparder Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sparder.plunk.config;


/**
 * AbstractConsumerConfig
 *
 * @author weimin.sun
 * @
 */
public abstract class AbstractReferenceConfig extends AbstractConfig{

    private static final long serialVersionUID = -2786526984373031126L;


    // ======== 引用缺省值，当引用属性未设置时使用该缺省值替代  ========

    // 检查服务提供者是否存在
    //protected Boolean             check;

    // 是否加载时即刻初始化
    //protected Boolean             init;

    // 是否使用泛接口
    //protected String             generic;

    // 优先从JVM内获取引用实例
    //protected Boolean             injvm;

    // lazy create connection
    //protected Boolean             lazy;

    protected String reconnect;

    //protected Boolean             sticky;

    //stub是否支持event事件. //TODO slove merge problem
    //protected Boolean             stubevent ;//= Constants.DEFAULT_STUB_EVENT;

    // 版本
    protected String version;

    // 服务分组
    protected String group;


    public String getReconnect() {
        return reconnect;
    }

    public void setReconnect(String reconnect) {
        this.reconnect = reconnect;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

}