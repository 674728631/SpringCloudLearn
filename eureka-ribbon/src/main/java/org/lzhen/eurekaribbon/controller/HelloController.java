package org.lzhen.eurekaribbon.controller;

import org.lzhen.eurekaribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hi(){
        return helloService.hiService();
    }

}
