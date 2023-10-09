package com.blusynergy.blucustomerservices.controller

import com.blusynergy.blucustomerservices.client.InvoiceClient
import com.blusynergy.blucustomerservices.model.Customer
import com.blusynergy.blucustomerservices.repository.CustomerRepository
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
@RequestMapping("/customers")
class CustomerController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class)


    @Autowired
    CustomerRepository customerRepository

    @Autowired
    InvoiceClient invoiceClient

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        LOG.info("Customer add: {}", customer)
        return customerRepository.addCustomer(customer)
    }

    @GetMapping
    public List<Customer> findAll(){
        LOG.info("Customer findAll{}")
        return customerRepository.findAll()
    }

    @GetMapping("/{id}")
    public Customer find(@PathVariable("id") Long id){
        LOG.info("Customer find by id={}", id)
        return customerRepository.findById(id)
    }

    @GetMapping("/{id}/invoices")
    public Customer findWithInvoice(@PathVariable("id") Long id){
        LOG.info("Customer with invoices", id)
        Customer customer = customerRepository.findById(id)
        customer.setInvoices(invoiceClient.findByCustomer(customer.id))
        return customer
    }

}
