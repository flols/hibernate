package com.hibernate.hibernate.controller;

import com.hibernate.hibernate.dto.model.TeamsDto;
import com.hibernate.hibernate.model.Drivers;
import com.hibernate.hibernate.model.Teams;
import com.hibernate.hibernate.service.DriversService;
import com.hibernate.hibernate.service.TeamsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamsController {

    @Resource(name = "teamsService")
    private TeamsService teamsService;

    @Resource(name = "driversService")
    private DriversService driversService;

    @GetMapping("/{id}")
    public Teams get(@PathVariable long id) {
        return teamsService.get(id).orElseThrow(() -> new RuntimeException("teams not found : " + id));
    }

    @GetMapping
    public List<Teams> getAll() {
        return teamsService.getAll();
    }

    @PostMapping
    public Teams create(final @RequestBody TeamsDto teamsDto){
        Drivers teamsOwner = driversService.get(TeamsDto.getTeamsOwnerId()).orElseThrow(() -> new RuntimeException("Student not found : " + teamsDto.getTeamsOwnerId()));

        return teamsService.create(teamsDto.getName(), teamsOwner, teamsDto.getCar(), teamsDto.getCountry(), teamsDto.getTechnical_director()).orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }

}
