package com.blusynergy.invoiceservice.repository

import com.blusynergy.invoiceservice.model.Invoice
import org.springframework.stereotype.Repository

@Repository
class InvoiceRepository {

    private List<Invoice> invoices = new ArrayList<Invoice>();

    public Invoice addInvoice(Invoice invoice){
        invoices.add(invoice)
        return invoice
    }

    public Invoice findById(Long id){
        return invoices.find{it.id == id}
    }

    public List<Invoice> findAllByCustomer(Long id){
        return invoices.findAll{it.customerId == id}
    }

    public List<Invoice> findAll(){
        return invoices
    }
}
