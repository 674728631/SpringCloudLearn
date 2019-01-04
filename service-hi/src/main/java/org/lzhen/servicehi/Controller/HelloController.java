package org.lzhen.servicehi.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String hi(){
        return "hello world!";
    }

}
