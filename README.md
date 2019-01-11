# SpringCloudLearn


## 注册和发现
@EnableEurekaClient
@EnableDiscoveryClient
在F版本后可以不使用了，默认会被注册和发现

## Feign
@FeignClient 接口中的方法获取传入参数@RequestParam时,必须指明value对应的参数名（最好统一），不然启动会报错：参数为空
Feign使用Hystic时，@FeignClient(name = "service-hi",fallback = HelloFeignServiceHystric.class)指定的回调方法必须和主方法拥有相同的参数结构
Feign集成Hystic，可直接使用

## Ribbon 
Ribbon使用Hystric时，使用注解@HystrixCommand(fallbackMethod="hiError")的方法和注解指向的回调方法必须拥有相同的参数结构
Ribbon使用Hystic必须单独导入包依赖，并指明@EnableHystrix

## Zuul
zuul的过滤功能，继承ZuulFilter即可。
    filterType 返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
        pre： 路由前
        routing：路由时
        post：路由后
        error：发送错误调用
    filterOrder 过滤顺序，数值越小优先级越高
    shouldFilter 逻辑判断是否需要过滤
    run 过滤业务

## config
http请求config-server 时，格式为 /name/profiles 例如：spring-dev.yml 其中name= spring ，profiles=dev ,返回格式：propertySources中source为读取到的内容；
也可以直接访问文件名 ，例如/spring-dev.yml ，直接返回文件中的内容 



### 坑
同一个服务工程想用不同的端口想eureka注册，不能引用spring-boot-devtools工具包。因为修改端口后他就会重启啊~