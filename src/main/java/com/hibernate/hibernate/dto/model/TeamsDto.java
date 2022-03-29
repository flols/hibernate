package com.hibernate.hibernate.dto.model;

public class TeamsDto {

    String name;
    static long teamsOwnerId;
    String car;
    String country;
    String technical_director;

    public TeamsDto(String name, long teamsOwnerId, String car, String country, String technical_director) {
        this.name = name;
        this.teamsOwnerId = teamsOwnerId;
        this.car = car;
        this.country = country;
        this.technical_director = technical_director;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static long getTeamsOwnerId() {
        return teamsOwnerId;
    }

    public void setTeamsOwnerId(long teamsOwnerId) {
        this.teamsOwnerId = teamsOwnerId;
    }

    public String getCar() { return car; }

    public void setCar(String car) { this.car = car; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public String getTechnical_director() { return technical_director; }

    public void setTechnical_director(String technical_director) { this.technical_director = technical_director; }



}
