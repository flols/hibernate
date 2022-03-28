package com.hibernate.hibernate.service;

import com.hibernate.hibernate.dto.model.DriversDto;
import com.hibernate.hibernate.model.Drivers;

import java.util.List;
import java.util.Optional;

public interface DriversService {
    /**
     * Get drivers by id
     *
     * @param driversId drivers identifiant
     * @return Drivers find by id
     */
    Optional<Drivers> get(Long driversId);

    /**
     * Get list of drivers
     *
     * @return list of drivers
     */
    List<Drivers> getAll();


    /**
     * Create a new drivers
     *
     * @param driversDto to create
     * @return a new drivers created
     */
    Optional<Drivers> create(DriversDto driversDto);

    String delete(long driversId);

    Optional<Drivers> update(Drivers existingUserToUpdate, DriversDto driversDtoWithUpdate);
}
