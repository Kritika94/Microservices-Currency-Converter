package com.in28Minutes.microservices.netflixzullApigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class NetflixZullApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZullApiGatewayApplication.class, args);
	}
	@Bean
public Sampler defaultSampler() {
	return Sampler.ALWAYS_SAMPLE;
}
}
