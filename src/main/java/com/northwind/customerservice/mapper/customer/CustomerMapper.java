package com.northwind.customerservice.mapper.customer;

import com.northwind.customerservice.model.Customer;

public class CustomerMapper
{
    public static CustomerModel toModel(Customer customer)
    {
            CustomerModel customerModel = new CustomerModel();
            customerModel.setCompanyName(customer.getCompanyName());
            customerModel.setContactName(customer.getContactName());
            customerModel.setContactTitle(customer.getContactTitle());
            customerModel.setCustomerNo(customer.getCustomerNo());
            customerModel.setFax(customer.getFax());
            customerModel.setId(customer.getId());
            customerModel.setPhone(customer.getPhone());
            customerModel.setVersion(customer.getVersion());
            return customerModel;

    }
}
