package io.malick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.malick.filter.AddRequestHeaderFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Configuration //Filter code
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	
	//Filter code
	@Bean
	public AddRequestHeaderFilter addRequestHeaderFilter(){
		return new AddRequestHeaderFilter();
	}
}

