package com.blusynergy.bluapigateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class BluApiGatewayApplication {

	static void main(String[] args) {
		SpringApplication.run(BluApiGatewayApplication, args)
	}

}
