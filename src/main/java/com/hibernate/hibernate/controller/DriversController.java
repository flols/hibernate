package com.hibernate.hibernate.controller;

import com.hibernate.hibernate.dto.model.DriversDto;
import com.hibernate.hibernate.dto.model.TeamsDto;
import com.hibernate.hibernate.model.Drivers;
import com.hibernate.hibernate.model.Teams;
import com.hibernate.hibernate.service.DriversService;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/drivers")
public class DriversController {

    @Resource(name = "driversService")
    private DriversService driversService;

    @GetMapping("/{id}")
    public Drivers get(@PathVariable long id) {
        return driversService.get(id).orElseThrow(()-> new RuntimeException("Drivers not found: " + id));
    }

    @GetMapping
    public List<Drivers> getAll() {return driversService.getAll();}

    @PostMapping()
    public Drivers create(final @RequestBody DriversDto drivers) {
        return driversService.create(drivers).orElseThrow(() -> new RuntimeException("Something wrong"));
    }

    @PutMapping("/{id}")
    public Drivers update(@PathVariable long id, final @RequestBody DriversDto driversDtoWithUpdate) {
        Optional<Drivers> existingDriversToUpdate = Optional.ofNullable(driversService.get(id).orElseThrow(() -> new RuntimeException("Drivers not found : " + id)));

        return driversService.update(existingDriversToUpdate.get(), driversDtoWithUpdate)
                .orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id) {
        return driversService.delete(id);
    }

}
