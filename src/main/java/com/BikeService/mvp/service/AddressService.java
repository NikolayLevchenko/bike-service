package com.BikeService.mvp.service;

import com.BikeService.mvp.model.entity.Address;

public interface AddressService {

    Address createAddress(Integer plz);

    Address getAddressByPlz(Integer plz);
}
