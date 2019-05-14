package com.easyaccess.model.user;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;

    private String name;
    private String email;
    private String password;
    private int mobilePhone;
    private String occupation;
    private String city;
    private String rol;


    public User() {
    }

    public User(String name, String email, String password, int mobilePhone, String occupation, String city) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobilePhone = mobilePhone;
        this.occupation = occupation;
        this.city = city;
        this.rol = "User";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRol() {
        return rol;
    }
}
