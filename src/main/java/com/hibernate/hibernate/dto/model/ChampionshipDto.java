package com.hibernate.hibernate.dto.model;

public class ChampionshipDto {

    String name;
    static long championshipOwnerId;

    public ChampionshipDto(String name, long championshipOwnerId) {
        this.name = name;
        this.championshipOwnerId = championshipOwnerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static long getChampionshipOwnerId() {
        return championshipOwnerId;
    }

    public void setChampionshipOwnerId(long championshipOwnerId) {
        this.championshipOwnerId = championshipOwnerId;
    }


}
