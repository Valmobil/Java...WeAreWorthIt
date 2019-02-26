package org.city.project.service;

import org.city.project.entity.Houses;
import org.city.project.repository.HousesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HousesService {
    private HousesRepository housesRepository;

    @Autowired
    public HousesService(HousesRepository housesRepository) {
        this.housesRepository = housesRepository;
    }

    public Houses createNewHouses(Houses Houses) {
        return housesRepository.save(Houses);
    }

    public Houses getHousesById(Long housesId) {
        return housesRepository.getOne(housesId);
    }

    public List<Houses> findAll() {
        return housesRepository.findAll();
    }
}
