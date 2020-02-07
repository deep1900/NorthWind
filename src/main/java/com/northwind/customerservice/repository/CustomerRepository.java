package com.northwind.customerservice.repository;

import com.northwind.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

@org.springframework.stereotype.Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}
