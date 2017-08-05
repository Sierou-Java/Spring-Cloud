package org.sierou.core;

import org.sierou.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * HystricFallBackException
 *
 * @Author 王洪悦.{javayue@yeah.net}
 * @Create 2017-08-05 下午10:17
 */
// 服务宕机 自动调用
@Component
public class HystricFallBackException implements FeignService{

    @Override
    public String referenceEureka(String name) {
        return "error, name = :" + name;
    }
}
