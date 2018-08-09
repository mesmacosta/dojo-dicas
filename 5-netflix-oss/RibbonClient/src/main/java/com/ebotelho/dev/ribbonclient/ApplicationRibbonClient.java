package com.ebotelho.dev.ribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationRibbonClient {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRibbonClient.class, args);
	}
}
