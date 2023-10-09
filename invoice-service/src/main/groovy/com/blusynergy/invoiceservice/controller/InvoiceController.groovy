package com.blusynergy.invoiceservice.controller

import com.blusynergy.invoiceservice.model.Invoice
import com.blusynergy.invoiceservice.repository.InvoiceRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/invoices")
class InvoiceController {

    private static final Logger LOG = LoggerFactory.getLogger(InvoiceController.class)

    @Autowired
    private InvoiceRepository invoiceRepository

    @PostMapping
    public Invoice save(@RequestBody Invoice invoice){
        LOG.info("Invoice add: {}", invoice)
        return invoiceRepository.addInvoice(invoice)
    }

    @GetMapping
    public List<Invoice> findAll(){
        LOG.info("Invoice findAll{}")
        return invoiceRepository.findAll()
    }

    @GetMapping("/{id}")
    public Invoice find(@PathVariable("id") Long id){
        LOG.info("Invoice find by id={}", id)
        return invoiceRepository.findById(id)
    }

    @GetMapping("/customer/{id}")
    public List<Invoice> findByCustomer(@PathVariable("id") Long id){
        LOG.info("Invoice find by customer id={}", id)
        return invoiceRepository.findAllByCustomer(id)
    }



}
