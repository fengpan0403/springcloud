package com.example.springcloudweb1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Feng Pan
 * @create: 2019/7/22 14:44
 **/
@RestController
public class ControllerWeb1 {

    @RequestMapping("/who")
    public String who(){
        return "Im ControllerWeb1";
    }
}
