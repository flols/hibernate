package com.hibernate.hibernate.dto.model;

public class TeamsDto {

    String name;
    static long teamsOwnerId;

    public TeamsDto(String name, long teamsOwnerId) {
        this.name = name;
        this.teamsOwnerId = teamsOwnerId;
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

}
