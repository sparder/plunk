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
 * AbstractServiceConfig
 *
 * @author weimin.sun
 * @
 */
public abstract class AbstractServiceConfig extends AbstractConfig {

    private static final long serialVersionUID = 1L;


    // 服务版本
    private String version;

    // 服务分组
    private String group;

    // 服务是否已经deprecated
    private Boolean deprecated;

    // 延迟暴露
    private Integer delay;

    // 是否暴露
    //protected Boolean              export;

    // 权重
    //protected Integer              weight;

    // 应用文档
    //protected String               document;

    // 在注册中心上注册成动态的还是静态的服务
    //protected Boolean              dynamic;

    // 是否使用令牌
    //protected String               token;

    // 访问日志
    //protected String               accesslog;

    // 允许执行请求数
    private Integer executes;

    //protected List<ProtocolConfig> protocols;

    // 是否注册
    //private Boolean                register;


    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public Integer getExecutes() {
        return executes;
    }

    public void setExecutes(Integer executes) {
        this.executes = executes;
    }

}