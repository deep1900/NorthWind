package com.northwind.customerservice.controller;

import com.northwind.customerservice.mapper.address.AddressMapper;
import com.northwind.customerservice.mapper.address.AddressModel;
import com.northwind.customerservice.model.Address;
import com.northwind.customerservice.model.Customer;
import com.northwind.customerservice.repository.AddressRepository;
import com.northwind.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController
{
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/test")
    public String test(){
        return "Hello Address";
    }
    @GetMapping("/getAll")
public List<Address> getAllAddress(){
    return addressRepository.findAll();
}
    @GetMapping("/getAddress/{id}")
    public ResponseEntity<AddressModel> findById(@PathVariable long id){
        Optional<Address> address = addressRepository.findById(id);
        if(!address.isPresent()) ResponseEntity.notFound().build();
        return ResponseEntity.ok(AddressMapper.toModel(address.get()));
    }

}
