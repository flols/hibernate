package com.hibernate.hibernate.service;

import com.hibernate.hibernate.model.Championship;
import com.hibernate.hibernate.model.Drivers;
import com.hibernate.hibernate.model.Teams;
import com.hibernate.hibernate.repository.ChampionshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("championshipService")
public class ChampionshipServiceImpl implements ChampionshipService {
    @Autowired
    ChampionshipRepository championshipRepository;

    @Override
    public Optional<Championship> get(long championshipId) {
        return championshipRepository.findById(championshipId);
    }

    @Override
    public List<Championship> getAll() {
        return championshipRepository.findAll();
    }

    @Override
    public Optional<Championship> create(String name, Teams championshipOwner) {

        Optional<Championship> championshipExistWithOwnerId = getByOwnerId(championshipOwner.getId());

        if (championshipExistWithOwnerId.isPresent()){
            championshipExistWithOwnerId.get().setName(name);

            return Optional.of(championshipRepository.save(championshipExistWithOwnerId.get()));
        }

        Championship championship = new Championship();
        championship.setName(name);
        championship.setTeams(championshipOwner);

        return Optional.of(championshipRepository.save(championship));
    }

    @Override
    public Optional<Championship> getByOwnerId(long championshipOwnerId) {
        return championshipRepository.findByTeamsId(championshipOwnerId);
    }

}
