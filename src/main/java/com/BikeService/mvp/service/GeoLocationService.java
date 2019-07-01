package com.BikeService.mvp.service;

import com.BikeService.mvp.model.entity.Address;

public interface GeoLocationService {

    Address getAddressByPlz(Integer plz);
}
