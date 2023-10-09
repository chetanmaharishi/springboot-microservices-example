package com.blusynergy.blucustomerservices.client

import com.blusynergy.blucustomerservices.model.Invoice
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.service.annotation.GetExchange
import org.springframework.web.service.annotation.HttpExchange

@HttpExchange
interface InvoiceClient {

    @GetExchange("/invoices/customer/{id}")
    public List<Invoice> findByCustomer(@PathVariable("id") Long id)

}