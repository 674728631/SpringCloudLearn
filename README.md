# SpringCloudLearn


## 注册和发现
@EnableEurekaClient
@EnableDiscoveryClient
在F版本后可以不使用了，默认会被注册和发现

## Feign
@FeignClient 接口中的方法获取传入参数@RequestParam时,必须指明value对应的参数名（最好统一），不然启动会报错：参数为空
