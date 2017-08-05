package org.sierou.controller;

import org.sierou.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @Author 王洪悦.{javayue@yeah.net}
 * @Create 2017-08-01 下午10:55
 */
@RestController
@RequestMapping(value = "/ribbon")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/reference")
    public String hello(@RequestParam (value = "name") String name){
        return helloService.hello(name);
    }
}
