package com.BikeService.mvp.service.impl;

import com.BikeService.mvp.exception.exceptions.ResourceNotFoundException;
import com.BikeService.mvp.model.entity.Bike;
import com.BikeService.mvp.repository.BikeRepository;
import com.BikeService.mvp.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BikeServiceImpl implements BikeService {

    @Autowired
    BikeRepository bikeRepository;

    @Override
    public Bike getBikeById(Long id) {
        Optional<Bike> bike = bikeRepository.findById(id);
        if (bike.isPresent()) {
            return bike.get();
        } else {
            throw new ResourceNotFoundException("Bike was not found");
        }
    }

    @Override
    public Bike getBikeByModelAndNumber(String model, String number) {
        Optional<Bike> bike = Optional.ofNullable(bikeRepository.getBikeByModelAndNumber(model, number));
        if (bike.isPresent()) {
            return bike.get();
        } else {
            throw new ResourceNotFoundException("Bike was not found");
        }
    }
}
