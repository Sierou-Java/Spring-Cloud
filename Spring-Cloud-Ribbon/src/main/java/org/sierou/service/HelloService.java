package org.sierou.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * HelloService
 *
 * @Author 王洪悦.{javayue@yeah.net}
 * @Create 2017-08-01 下午10:50
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    // 断路器
    @HystrixCommand(fallbackMethod = "fallback")
    // 当服务器宕机，会调用‘fallback方法’
    public String hello(String name){
        return restTemplate.getForObject("http://eureka-service-hello-world/hi?name=" + name, String.class);
    }

    public String fallback(String name){
        return "error, name = " + name;
    }
}
