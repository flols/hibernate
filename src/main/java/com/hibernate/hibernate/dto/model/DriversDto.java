package com.hibernate.hibernate.dto.model;

public class DriversDto {

    private String name;
    private String firstname;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public DriversDto(String name, String firstname, String country) {
        this.name = name;
        this.firstname = firstname;
        this.country = country;
    }

}
