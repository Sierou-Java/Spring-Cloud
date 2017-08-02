package org.sierou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 一个服务注册中心，eureka server, 端口为8761
 * eureka-service-hello-world工程跑了两个副本，端口分别为8762,8763，分别向服务注册中心注册 [集群]
 * ribbon-service-hello-world端口为8764,向服务注册中心注册
 * 当ribbon-service-hello-world通过restTemplate调用eureka-service-hello-world的hi接口时，
 * 因为用ribbon进行了负载均衡，会轮流的调用eureka-service-hello-world：8762和8763 两个端口的hi接口；
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonApplication.class, args);
	}

	@Bean(value = "restTemplate")
	// 负载均衡策略
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
