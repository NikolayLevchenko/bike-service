package com.BikeService.mvp.service.impl;

import com.BikeService.mvp.model.entity.Address;
import com.BikeService.mvp.repository.AddressRepository;
import com.BikeService.mvp.service.AddressService;
import com.BikeService.mvp.service.GeoLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    GeoLocationService geoLocationService;

    @Override
    public Address createAddress(Integer plz) {
       Address address = geoLocationService.getAddressByPlz(plz);
       addressRepository.save(address);
       return address;
    }

    @Override
    public Address getAddressByPlz(Integer plz) {
        Optional<Address> address = Optional.ofNullable(addressRepository.getAddressByPlz(plz));
        return address.orElseGet(() -> createAddress(plz));
    }
}
