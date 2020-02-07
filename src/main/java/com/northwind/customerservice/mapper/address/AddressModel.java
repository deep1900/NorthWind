package com.northwind.customerservice.mapper.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonSerialize
public class AddressModel 
{
    @JsonProperty
    private long addressId;
    @JsonProperty
    private long customerId;
    @JsonProperty
    private String address;
    @JsonProperty
    private String city;
    @JsonProperty
    private String region;
    @JsonProperty
    private String postalCode;
    @JsonProperty
    private String country;
    @JsonProperty
    private boolean isDefaultBilling;
    @JsonProperty
    private boolean isDefaultShipping;

    public AddressModel() {
    }

    public AddressModel(long addressId, long customerId, String address, String city, String region, String postalCode, String country, boolean isDefaultBilling, boolean isDefaultShipping) {
        this.addressId = addressId;
        this.customerId = customerId;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isDefaultBilling() {
        return isDefaultBilling;
    }

    public void setDefaultBilling(boolean defaultBilling) {
        isDefaultBilling = defaultBilling;
    }

    public boolean isDefaultShipping() {
        return isDefaultShipping;
    }

    public void setDefaultShipping(boolean defaultShipping) {
        isDefaultShipping = defaultShipping;
    }

    @Override
    public String toString() {
        return "AddressModel{" +
                "addressId=" + addressId +
                ", customerId=" + customerId +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", isDefaultBilling=" + isDefaultBilling +
                ", isDefaultShipping=" + isDefaultShipping +
                '}';
    }
}
