package com.northwind.customerservice.model;

import javax.persistence.*;

@Entity
@Table(name = "Addresses")
public class Address
{
    @Column(name = "AddressID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;
//    @OneToOne(cascade = CascadeType.REFRESH)
//    @Column(name = "CustomerID")
//    private long customerId;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Region")
    private String region;
    @Column(name = "PostalCode")
    private String postalCode;
    @Column(name = "Country")
    private String country;
    @Column(name = "IsDefaultBilling")
    private boolean isDefaultBilling;
    @Column(name = "IsDefaultShipping")
    private boolean isDefaultShipping;
    @ManyToOne
    @JoinColumn(name = "CustomerID", updatable = false, insertable = false)
    private Customer customer;


    public Address() {
    }

    public Address(long addressId, long customerId, String address, String city, String region, String postalCode, String country, boolean isDefaultBilling, boolean isDefaultShipping) {
        this.addressId = addressId;
//        this.customerId = customerId;
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

//    public long getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(long customerId) {
//        this.customerId = customerId;
//    }

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
        return "Address{" +
                "addressId=" + addressId +
//                ", customerId=" + customerId +
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
