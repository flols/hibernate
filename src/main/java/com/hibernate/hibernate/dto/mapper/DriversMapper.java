package com.hibernate.hibernate.dto.mapper;

import com.hibernate.hibernate.dto.model.DriversDto;
import com.hibernate.hibernate.model.Drivers;

import java.util.Date;

public class DriversMapper {

    public static Drivers toDrivers(DriversDto driversDto) {
        Drivers drivers = new Drivers();
        drivers.setName(driversDto.getName());
        drivers.setFirstname(driversDto.getFirstname());
        drivers.setCountry(driversDto.getCountry());
        return drivers;
    }

}
