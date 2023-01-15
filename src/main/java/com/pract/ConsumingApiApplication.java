package com.pract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.pract.proxy")
public class ConsumingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingApiApplication.class, args);
	}

}
