package com.in28Minutes.microservices.netflixeureksnamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class NetflixEureksNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEureksNamingServerApplication.class, args);
	}

}
