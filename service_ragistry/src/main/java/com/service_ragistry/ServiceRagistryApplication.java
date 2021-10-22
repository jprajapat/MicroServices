package com.service_ragistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRagistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRagistryApplication.class, args);
	}

}
