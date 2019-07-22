package com.example.springcloudfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Feng Pan
 * @create: 2019/7/22 16:41
 **/
@FeignClient("spring-cloud-web")
public interface TestRemote {

    @RequestMapping("/who")
    public String who();
}
