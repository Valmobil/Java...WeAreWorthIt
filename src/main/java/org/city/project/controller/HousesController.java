package org.city.project.controller;

import org.city.project.entity.Houses;
import org.city.project.service.HousesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("houses")
public class HousesController {

    private HousesService housesService;

    @Autowired
    public HousesController(HousesService housesService) {
        this.housesService = housesService;
    }

    @GetMapping("current")
    public Houses getCurrentHouses() {
        return housesService.getHousesById(1L);
    }

    @PostMapping("new")
    public Houses createNewHouses(@RequestBody Houses houses) {
        return housesService.createNewHouses(houses);
    }

    @GetMapping("{houses_id}")
    public Houses getHousesById(@PathVariable("houses_id") Long housesId) {
        return housesService.getHousesById(housesId);
    }
}