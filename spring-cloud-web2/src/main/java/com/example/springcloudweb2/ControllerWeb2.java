package com.example.springcloudweb2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Feng Pan
 * @create: 2019/7/22 14:47
 **/
@RestController
public class ControllerWeb2 {

    @RequestMapping("/who")
    public String who(){
        return "Im ControllerWeb2";
    }
}
