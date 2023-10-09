package com.blusynergy.blucustomerservices.repository

import com.blusynergy.blucustomerservices.model.Customer
import org.springframework.stereotype.Repository


@Repository
class CustomerRepository {

    private List<Customer> customers = new ArrayList<Customer>();

    public Customer addCustomer(Customer customer){
        customers.add(customer)
        return customer
    }

    public Customer findById(Long id){
        return customers.find{it.id == id}
    }

    public List<Customer> findAll(){
        return customers
    }
}
