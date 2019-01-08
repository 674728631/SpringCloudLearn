package org.lzhen.eurekafeign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloFeignServiceHystric implements HelloFeignService {
    @Override
    public String hiService() {
        return "sorry!";
    }
}
