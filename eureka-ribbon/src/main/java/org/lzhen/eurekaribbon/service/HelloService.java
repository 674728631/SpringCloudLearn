package org.lzhen.eurekaribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod="hiError")
    public String hiService(){
        return restTemplate.getForObject("http://service-hi/hi",String.class);
    }

    public String hiError(){
        return "sorry ribbon";
    }
}
