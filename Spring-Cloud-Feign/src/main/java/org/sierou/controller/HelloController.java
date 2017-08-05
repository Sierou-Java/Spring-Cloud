package org.sierou.controller;

import org.sierou.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 王洪悦.{javayue@yeah.net}
 * @Create 2017-08-02 下午11:28
 */
@RestController
@RequestMapping(value = "/feign")
public class HelloController {

    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/hi")
    public String referenceEureka(@RequestParam (value = "name") String name){
        return feignService.referenceEureka(name);
    }
}
