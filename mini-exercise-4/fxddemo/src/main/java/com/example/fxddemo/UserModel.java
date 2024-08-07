package com.example.fxddemo;

public class UserModel {

    private String name;
    private String contact;
    private String country;
    private String gender;

    public UserModel(String name, String contact, String country, String gender) {
        this.setName(name);
        this.setContact(contact);
        this.setCountry(country);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
