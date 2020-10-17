package com.services.fooddiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FoodDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDiscoveryServerApplication.class, args);
	}

}
