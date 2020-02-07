package com.northwind.customerservice.mapper.address;

import com.northwind.customerservice.model.Address;

public class AddressMapper 
{

    public static AddressModel toModel(Address address)
    {
        AddressModel model = new AddressModel();
        model.setAddress(address.getAddress());
        model.setAddressId(address.getAddressId());
        model.setCity(address.getCity());
        model.setCountry(address.getCountry());
        model.setDefaultBilling(address.isDefaultBilling());
        model.setDefaultShipping(address.isDefaultShipping());
        model.setPostalCode(address.getPostalCode());
        model.setRegion(address.getRegion());
        return model;
    }
}
