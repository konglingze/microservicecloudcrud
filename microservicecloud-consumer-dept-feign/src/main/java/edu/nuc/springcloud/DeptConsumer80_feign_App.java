package edu.nuc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

import edu.nuc.MyRule.KlZRule;

@SpringBootApplication
@EnableEurekaClient
// @RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = KlZRule.class)
// feign集成ribbon,开启500会报错
@EnableFeignClients(basePackages = { "edu.nuc.springcloud" })
@ComponentScan("edu.nuc.springcloud")
public class DeptConsumer80_feign_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_feign_App.class, args);

	}

}
