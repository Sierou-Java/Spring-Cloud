package org.sierou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Feign是一个声明式的web服务客户端，它使得写web服务变得更简单。
 * 使用Feign,只需要创建一个接口并注解。它具有可插拔的注解特性，包括Feign 注解和JAX-RS注解。
 * Feign同时支持可插拔的编码器和解码器。
 * spring cloud对Spring mvc添加了支持，同时在spring web中次用相同的HttpMessageConverter。
 * 当我们使用feign的时候，spring cloud 整和了Ribbon和eureka去提供负载均衡。
 */
@SpringBootApplication
// 服务消费者
@EnableDiscoveryClient
// 开启feign
@EnableFeignClients
// hystrix 仪表盘
@EnableHystrixDashboard
public class SpringCloudFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}
}
