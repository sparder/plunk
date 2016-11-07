package com.sparder.plunk.config;

import java.util.List;

/**
 * Created by ruxing.bao on 2016/10/13.
 */
public class ApplicationConfig extends AbstractConfig{
    private static final long    serialVersionUID = 5508512956753757169L;

    // 应用名称
    private String               name;

    // 模块版本
    private String               version;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getCompiler() {
        return compiler;
    }

    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    public String getLogger() {
        return logger;
    }

    public void setLogger(String logger) {
        this.logger = logger;
    }

    public List<RegistryConfig> getRegistries() {
        return registries;
    }

    public void setRegistries(List<RegistryConfig> registries) {
        this.registries = registries;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    // 应用负责人
    private String               owner;

    // 组织名(BU或部门)
    private String               organization;

    // 分层
    private String               architecture;

    // 环境，如：dev/test/run
    private String               environment;

    // Java代码编译器
    private String               compiler;

    // 日志输出方式
    private String               logger;

    // 注册中心
    private List<RegistryConfig> registries;

    // 服务监控
    //private MonitorConfig        monitor;

    // 是否为缺省
    private Boolean              isDefault;
}
