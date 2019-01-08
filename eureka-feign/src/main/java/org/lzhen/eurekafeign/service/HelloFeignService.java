package org.lzhen.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-hi",fallback = HelloFeignServiceHystric.class)
public interface HelloFeignService {

    @GetMapping("/hi")
    String hiService();

}
