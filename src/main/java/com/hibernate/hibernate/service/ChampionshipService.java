package com.hibernate.hibernate.service;

import com.hibernate.hibernate.model.Championship;
import com.hibernate.hibernate.model.Teams;

import java.util.List;
import java.util.Optional;

public interface ChampionshipService {
    Optional<Championship> get(long championshipId);
    List<Championship> getAll();
    Optional<Championship> create(String name, Teams championshipOwner);
    Optional<Championship> getByOwnerId(long championshipOwnerId);
}
