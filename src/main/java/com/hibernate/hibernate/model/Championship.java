package com.hibernate.hibernate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Id;

import javax.persistence.*;

@Entity // To specify our class as table in DB
@Table(name = "championship") // To customize table name
public class Championship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teams_id", nullable = false)
    private Teams teams;

    public Championship() {

    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

}
