package com.example.springcloudfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Feng Pan
 * @create: 2019/7/22 16:45
 **/
@RestController
public class TestController {

    @Autowired
    TestRemote testRemote;

    @RequestMapping("/who")
    public String test() {
        return testRemote.who();
    }
}
