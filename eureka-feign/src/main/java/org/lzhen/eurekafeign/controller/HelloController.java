package org.lzhen.eurekafeign.controller;

import org.lzhen.eurekafeign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloFeignService helloFeignService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return helloFeignService.hiService(name);
    }
}
