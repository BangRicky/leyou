package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: jinbang
 * @create: 2019/8/8 15:28
 */

@SpringBootApplication
@EnableEurekaServer
public class LeyouRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouRegistryApplication.class, args);
    }
}
