package com.bcp.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BusinessMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessMsApplication.class, args);
	}

}
