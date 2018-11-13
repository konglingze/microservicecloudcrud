package edu.nuc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient//服务发现，如果注册中心是Eureka则和@EnableEurekaClient效果相同
@EnableCircuitBreaker
public class DeptProvider8004_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(DeptProvider8004_App.class, args);

	}

}
