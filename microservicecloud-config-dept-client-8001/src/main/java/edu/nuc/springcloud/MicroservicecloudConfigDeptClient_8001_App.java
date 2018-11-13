package edu.nuc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicecloudConfigDeptClient_8001_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(MicroservicecloudConfigDeptClient_8001_App.class, args);

	}

}
