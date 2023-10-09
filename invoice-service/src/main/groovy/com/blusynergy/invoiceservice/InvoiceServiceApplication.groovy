package com.blusynergy.invoiceservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class InvoiceServiceApplication {

	static void main(String[] args) {
		SpringApplication.run(InvoiceServiceApplication, args)
	}

}
