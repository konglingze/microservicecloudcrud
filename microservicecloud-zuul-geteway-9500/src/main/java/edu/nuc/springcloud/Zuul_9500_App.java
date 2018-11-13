package edu.nuc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class Zuul_9500_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(Zuul_9500_App.class, args);
	}

}
