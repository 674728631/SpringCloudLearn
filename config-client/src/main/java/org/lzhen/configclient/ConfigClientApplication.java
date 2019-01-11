package org.lzhen.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${info.profile}")
	String foo;
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo;
	}

//	@Value("${eureka.client.serviceUrl.defaultZone}")
//	String foo2;
//	@RequestMapping(value = "/hi1")
//	public String hi2(){
//		return foo2;
//	}
//
//	@Value("${eureka}")
//	String foo3;
//	@RequestMapping(value = "/hi2")
//	public String hi3(){
//		return foo3;
//	}
}

