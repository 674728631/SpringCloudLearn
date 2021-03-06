package org.lzhen.servicehi.Controller;


import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

//    @RequestMapping("/hi")
//    public String hi(@RequestParam String name) {
//        return "hello world!" + name + ",i am from port:" + port;
//    }

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    @RequestMapping("/hi")
    public String bye() {
        return restTemplate.getForObject("http://localhost:8773/miya", String.class);
    }

    @RequestMapping("/info")
    public String info() {
        return "i am service-hi";
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
