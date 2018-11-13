package edu.nuc.springcloud.ctgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate geRestTemplate() {

		return new RestTemplate();

	}
/*    @Bean
	public IRule myRule() {
		return new RetryRule();
	}*/

}
