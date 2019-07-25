package org.sl.uploadserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UploadServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadServerApplication.class, args);
    }

}
