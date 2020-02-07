package com.northwind.customerservice.model;

import org.hibernate.annotations.Cascade;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Customers")
public class Customer {
    public Customer() {
    }
    public Customer(int id, String customerNo, String companyName, String contactName, String contactTitle, String phone, String fax, int version) {
        this.id = id;
        this.customerNo = customerNo;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.phone = phone;
        this.fax = fax;
        this.version = version;
    }


    @Column(name = "CustomerID", length = 11)
    @Id
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "CustomerNo", length = 11)
    private String customerNo;
    @Column(name = "CompanyName", length = 40)
    private String companyName;
    @Column(name = "ContactName", length = 30)
    private String contactName;
    @Column(name = "ContactTitle", length = 30)
    private String contactTitle;
    @Column(name = "Phone", length = 24)
    private String phone;
    @Column(name = "Fax", length = 24)
    private String fax;
    @Column(name = "Version", length = 11)
    private int version;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Address> addressList;

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
