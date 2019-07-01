package com.BikeService.mvp.service;

import com.BikeService.mvp.model.entity.Bike;

public interface BikeService {

    Bike getBikeById(Long id);

    Bike getBikeByModelAndNumber(String model, String number);
}
