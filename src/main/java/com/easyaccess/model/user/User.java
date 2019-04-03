package com.easyaccess.model.user;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;
    private int cardId;
    private String name;
    private String email;
    private String address;
    private String password;
    private String organization;
    private int mobilePhone;
    private int homePhone;
    private String occupation;
    private String city;
    private String state;
    private int postalCode;
    private String country;
    private String rol;



    public User(){}

    public User(int cardId, String name, String email, String address, String password, String organization, int mobilePhone,int homePhone, String occupation, String city, String state, int postalCode, String country){
        this.cardId = cardId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
        this.organization = organization;
        this.mobilePhone = mobilePhone;
        this.homePhone = homePhone;
        this.occupation = occupation;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.rol = "User";
    }

    public String getId() {
        return id;
    }

    public int getCardId(){
        return cardId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public int getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(int homePhone) {
        this.homePhone = homePhone;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRol() {
        return rol;
    }
}
