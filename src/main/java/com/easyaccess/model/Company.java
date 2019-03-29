package com.easyaccess.model;

import org.springframework.data.annotation.Id;

public class Company {

    @Id
    private String id;

    private String name;
    private String ubication;
    private String email;
    private Long phoneNumber;
    private Long nit;
    private String password;

    public Company() {
    }

    public Company(String name, String ubication, String email, Long phoneNumber, Long nit, String password) {
        this.name = name;
        this.ubication = ubication;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nit = nit;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
