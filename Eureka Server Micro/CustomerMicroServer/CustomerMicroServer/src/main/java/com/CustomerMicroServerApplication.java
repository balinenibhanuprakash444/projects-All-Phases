package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class CustomerMicroServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMicroServerApplication.class, args);
	 System.out.println("Customer micro service running on port number 8181");
	}

}
