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

import java.util.Map;

/**
 * RegistryConfig
 * 
 * @author weimin.sun
 *
 */
public class RegistryConfig extends AbstractConfig {

	private static final long serialVersionUID = 5508512956753757169L;
	
	public static final String NO_AVAILABLE = "N/A";

    // 注册中心地址
    private String            address;
    
	// 注册中心登录用户名
    private String            username;

    // 注册中心登录密码
    private String            password;

    // 注册中心缺省端口
    private Integer           port;
    
    // 注册中心协议
    private String            protocol;

    // 客户端实现
    private String            transporter;
    
    private String            server;
    
    private String            client;

    private String            cluster;
    
    private String            group;

	private String            version;

    // 注册中心请求超时时间(毫秒)
    private Integer           timeout;

    // 注册中心会话超时时间(毫秒)
    private Integer           session;
    
    // 动态注册中心列表存储文件
    private String            file;
    
    // 停止时等候完成通知时间
    //private Integer           wait;
    
    // 启动时检查注册中心是否存在
    private Boolean           check;

    // 在该注册中心上注册是动态的还是静态的服务
    private Boolean           dynamic;
    
    // 在该注册中心上服务是否暴露
    private Boolean           register;
    
    // 在该注册中心上服务是否引用
    private Boolean           subscribe;

    // 自定义参数
    private Map<String, String> parameters;

    // 是否为缺省
    private Boolean             isDefault;
    
    public RegistryConfig() {
    }
    
    public RegistryConfig(String address) {
        setAddress(address);
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }
    
    public Boolean isCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}

    public String getFile() {
        return file;
    }

    public void setFile(String file) {

        this.file = file;
    }


    
    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {

        /*if(transporter != null && transporter.length() > 0 && ! ExtensionLoader.getExtensionLoader(Transporter.class).hasExtension(transporter)){
            throw new IllegalStateException("No such transporter type : " + transporter);
        }*/
        this.transporter = transporter;
    }
    
    public String getServer() {
        return server;
    }
    
    public void setServer(String server) {

        /*if(server != null && server.length() > 0 && ! ExtensionLoader.getExtensionLoader(Transporter.class).hasExtension(server)){
            throw new IllegalStateException("No such server type : " + server);
        }*/
        this.server = server;
    }
    
    public String getClient() {
        return client;
    }
    
    public void setClient(String client) {

        /*if(client != null && client.length() > 0 && ! ExtensionLoader.getExtensionLoader(Transporter.class).hasExtension(client)){
            throw new IllegalStateException("No such client type : " + client);
        }*/
        this.client = client;
    }

	public Integer getTimeout() {
		return timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

    public Integer getSession() {
        return session;
    }

    public void setSession(Integer session) {
        this.session = session;
    }

    public Boolean isDynamic() {
        return dynamic;
    }

    public void setDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
    }

    public Boolean isRegister() {
        return register;
    }

    public void setRegister(Boolean register) {
        this.register = register;
    }
    
    public Boolean isSubscribe() {
        return subscribe;
    }
    
    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

    public String getCluster() {
		return cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
	}

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {

        this.parameters = parameters;
    }

    public Boolean isDefault() {
        return isDefault;
    }

    public void setDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}