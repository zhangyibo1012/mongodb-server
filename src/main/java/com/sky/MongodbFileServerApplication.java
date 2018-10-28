package com.sky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 微服务
 * 把原来的一个大的系统，拆分成小的系统
 * 每个小的系统分别开发 测试 维护
 * <p>
 * 常见的注册中心：zookeeper、 consul、etcd、redis
 * <p>
 * 服务提供方需要在容器启动的时候，把服务信息注册到注册中心
 * <p>
 * 插件打包命令
 * mvn clean package appassembler:assemble
 */
@SpringBootApplication
public class MongodbFileServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbFileServerApplication.class, args);
    }
}
