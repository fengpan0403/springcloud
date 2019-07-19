package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: Test
 * @author: Feng Pan
 * @create: 2019/7/17 16:10
 **/
@RestController
@RefreshScope
public class TestController {

    @Value("${neo.hello}")
    private String value;

    @RequestMapping("/test")
    public String test(){
        return this.value;
    }
}
