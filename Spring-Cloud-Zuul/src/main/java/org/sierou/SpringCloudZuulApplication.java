package org.sierou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
// 启动zuul网关
@EnableZuulProxy
@EnableEurekaClient
public class SpringCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApplication.class, args);
	}
}
