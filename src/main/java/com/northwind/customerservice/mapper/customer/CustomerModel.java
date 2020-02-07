package com.northwind.customerservice.mapper.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class CustomerModel
{
    public CustomerModel() {
    }

    public CustomerModel( int id, String customerNo,  String companyName, String contactName, String contactTitle, String phone, String fax, int version) {
        this.id = id;
        this.customerNo = customerNo;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.phone = phone;
        this.fax = fax;
        this.version = version;
    }

    @JsonProperty
    private long id;

    @JsonProperty
    private String customerNo;

    @JsonProperty
    private String companyName;

    @JsonProperty
    private String contactName;

    @JsonProperty
    private String contactTitle;

    @JsonProperty
    private String phone;

    @JsonProperty
    private String fax;


    @JsonProperty
    private int version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerNo=" + customerNo +
                ", companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactTitle='" + contactTitle + '\'' +
                ", phone=" + phone +
                ", fax=" + fax +
                ", version=" + version +
                '}';
    }
}
