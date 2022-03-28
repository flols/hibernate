package com.hibernate.hibernate.model;

import javax.persistence.*;
import javax.persistence.Id;


@Entity
@Table(name="drivers")
public class Drivers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String firstname;
    private String country;



    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "drivers")
    private Teams teams;

    public Drivers() {}

    public Drivers(long id, String name, String firstname, String country) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public Teams getTeams() {return teams;}

    public void setTeams(Teams teams) {this.teams = teams;}

}
