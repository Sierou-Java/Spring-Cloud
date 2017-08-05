package org.sierou.service;

import org.sierou.core.HystricFallBackException;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 王洪悦.{javayue@yeah.net}
 * @Create 2017-08-02 下午11:22
 */

// 定义一个feign接口类,通过 @FeignClient（“服务名”），来指定调用哪个服务
@FeignClient(value = FeignService.APPLICATION_NAME, fallback = HystricFallBackException.class)
public interface FeignService {

    String APPLICATION_NAME = "eureka-service-hello-world";

    // 调用 eureka-service-hello-world hi接口  restful
    @GetMapping(value = "/hi")
    String referenceEureka(@RequestParam (value = "name") String name);

}
