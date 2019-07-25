package org.sl.uploadservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
/**
 * 本服务为数据上传服务
 * 支持同步及异步两种模式
 * 同步模式：提供REST API，由其他服务调用
 * 异步模式：从RabbitMQ获取数据
 */
public class UploadService02Application {

    public static void main(String[] args) {
        SpringApplication.run(UploadService02Application.class, args);
    }

}
