package edu.nuc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpConfig_3344_App {

	public static void main(String[] args) {
		SpringApplication.run(SpConfig_3344_App.class, args);
	}

}
