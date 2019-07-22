package com.example.springcloudweb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudWeb1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudWeb1Application.class, args);
    }

}
