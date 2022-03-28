package com.hibernate.hibernate.service;

import com.hibernate.hibernate.dto.mapper.DriversMapper;
import com.hibernate.hibernate.dto.model.DriversDto;
import com.hibernate.hibernate.model.Drivers;
import com.hibernate.hibernate.repository.DriversRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("driversService")
public class DriversServiceImpl implements DriversService {

    @Autowired
    DriversRepository driversRepository;

    @Override
    public Optional<Drivers> get(Long driversId) {
        return driversRepository.findById(driversId);
    }

    @Override
    public List<Drivers> getAll() {
        return driversRepository.findAll();
    }

    @Override
    public Optional<Drivers> create(DriversDto driversDto) {
        return Optional.of(driversRepository.save(DriversMapper.toDrivers(driversDto)));
    }

    @Override
    public String delete(long driversId) {
        driversRepository.deleteById(driversId);
        return "drivers deleted with success";
    }

    @Override
    public Optional<Drivers> update(Drivers existingUserToUpdate, DriversDto driversDtoWithUpdate) {
        // -- Update existing user informations
        existingUserToUpdate.setName(driversDtoWithUpdate.getName());
        existingUserToUpdate.setFirstname(driversDtoWithUpdate.getFirstname());
        existingUserToUpdate.setCountry(driversDtoWithUpdate.getCountry());

        // -- Update existing user in DB with new informations
        Optional<Drivers> updatedDrivers = Optional.of(driversRepository.save(existingUserToUpdate));

        return updatedDrivers;
    }



}
