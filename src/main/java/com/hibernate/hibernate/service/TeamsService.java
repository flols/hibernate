package com.hibernate.hibernate.service;

import com.hibernate.hibernate.model.Drivers;
import com.hibernate.hibernate.model.Teams;

import java.util.List;
import java.util.Optional;

public interface TeamsService {
    Optional<Teams> get(long teamsId);
    List<Teams> getAll();
    Optional<Teams> create(String name, Drivers teamsOwner, String car, String country, String technical_director);
    Optional<Teams> getByOwnerId(long teamsOwnerId);
}
