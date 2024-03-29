package com.example.springcloudweb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudWeb2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudWeb2Application.class, args);
    }

}
