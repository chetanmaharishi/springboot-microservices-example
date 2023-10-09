package com.blusynergy.blucustomerservices.client.config

import com.blusynergy.blucustomerservices.client.InvoiceClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.support.WebClientAdapter
import org.springframework.web.service.invoker.HttpServiceProxyFactory

@Configuration
class WebClientConfig {

    @Autowired
    private LoadBalancedExchangeFilterFunction filterFunction

    @Bean
    public WebClient invoiceWebClient(){
        return WebClient.builder()
                .baseUrl("http://blu-invoice-service")
                .filter(filterFunction)
                .build()
    }

    @Bean
    public InvoiceClient invoiceClient(){
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(invoiceWebClient())).build()
        httpServiceProxyFactory.createClient(InvoiceClient.class)
    }
}
