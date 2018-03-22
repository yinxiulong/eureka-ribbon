package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * EnableDiscoveryClient  注册服务
 * EnableCircuitBreaker   注解开启断路器
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class RibbonApplication {
	/**
	 * 作用开启负载均衡
	 * 	@Bean
	 	@LoadBalanced
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}

}
