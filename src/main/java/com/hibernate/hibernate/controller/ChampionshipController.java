package com.hibernate.hibernate.controller;

import com.hibernate.hibernate.dto.model.ChampionshipDto;
import com.hibernate.hibernate.dto.model.TeamsDto;
import com.hibernate.hibernate.model.Championship;
import com.hibernate.hibernate.model.Drivers;
import com.hibernate.hibernate.model.Teams;
import com.hibernate.hibernate.service.ChampionshipService;
import com.hibernate.hibernate.service.DriversService;
import com.hibernate.hibernate.service.TeamsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/championship")
public class ChampionshipController {

    @Resource(name = "championshipService")
    private ChampionshipService championshipService;

    @Resource(name = "teamsService")
    private TeamsService teamsService;

    @GetMapping("/{id}")
    public Championship get(@PathVariable long id) {
        return championshipService.get(id).orElseThrow(() -> new RuntimeException("championship not found : " + id));
    }

    @GetMapping
    public List<Championship> getAll() {
        return championshipService.getAll();
    }

    @PostMapping
    public Championship create(final @RequestBody ChampionshipDto championshipDto){
        Teams championshipOwner = teamsService.get(ChampionshipDto.getChampionshipOwnerId()).orElseThrow(() -> new RuntimeException("Teams not found : " + championshipDto.getChampionshipOwnerId()));

        return championshipService.create(championshipDto.getName(), championshipOwner).orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }
}
