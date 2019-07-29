package com.example.springcloudgatewayservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class SpringCloudGatewayServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayServiceZuulApplication.class, args);
    }

    //  网关校验TOKEN
    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }
}
