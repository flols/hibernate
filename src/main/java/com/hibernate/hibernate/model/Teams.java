package com.hibernate.hibernate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Id;

import javax.persistence.*;

@Entity // To specify our class as table in DB
@Table(name = "teams") // To customize table name
public class Teams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public Drivers getDrivers() {
        return drivers;
    }

    public void setDrivers(Drivers drivers) {
        this.drivers = drivers;
    }

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "drivers_id", nullable = false)
    private Drivers drivers;

    public Teams() {

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

}
