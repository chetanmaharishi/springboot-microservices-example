package com.blusynergy.blucustomerservices

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class BluCustomerServicesApplication {

	static void main(String[] args) {
		SpringApplication.run(BluCustomerServicesApplication, args)
	}

}
