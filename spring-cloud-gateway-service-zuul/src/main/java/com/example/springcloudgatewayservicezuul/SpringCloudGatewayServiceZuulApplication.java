package com.example.springcloudgatewayservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpringCloudGatewayServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayServiceZuulApplication.class, args);
    }

}
