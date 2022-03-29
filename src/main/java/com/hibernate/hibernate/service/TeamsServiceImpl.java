package com.hibernate.hibernate.service;

import com.hibernate.hibernate.model.Drivers;
import com.hibernate.hibernate.model.Teams;
import com.hibernate.hibernate.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("teamsService")
public class TeamsServiceImpl implements TeamsService{
    @Autowired
    TeamsRepository teamsRepository;

    @Override
    public Optional<Teams> get(long teamsId) {
        return teamsRepository.findById(teamsId);
    }

    @Override
    public List<Teams> getAll() {
        return teamsRepository.findAll();
    }

    @Override
    public Optional<Teams> create(String name, Drivers teamsOwner, String car, String country, String technical_director) {

        Optional<Teams> teamsExistWithOwnerId = getByOwnerId(teamsOwner.getId());

        if (teamsExistWithOwnerId.isPresent()){
            teamsExistWithOwnerId.get().setName(name);
            teamsExistWithOwnerId.get().setCar(car);
            teamsExistWithOwnerId.get().setCountry(country);
            teamsExistWithOwnerId.get().setTechnical_director(technical_director);

            return Optional.of(teamsRepository.save(teamsExistWithOwnerId.get()));
        }

        Teams teams = new Teams();
        teams.setName(name);
        teams.setName(car);
        teams.setName(country);
        teams.setName(technical_director);
        teams.setDrivers(teamsOwner);

        return Optional.of(teamsRepository.save(teams));
    }

    @Override
    public Optional<Teams> getByOwnerId(long teamsOwnerId) {
        return teamsRepository.findByDriversId(teamsOwnerId);
    }

}
