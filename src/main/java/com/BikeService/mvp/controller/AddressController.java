package com.BikeService.mvp.controller;

import com.BikeService.mvp.exception.exceptions.InputValidationException;
import com.BikeService.mvp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/address/create")
    public void createUser(@RequestBody @Valid Integer plz, BindingResult result) {
        if (result.hasErrors()) {
            throw new InputValidationException(result);
        }
        addressService.createAddress(plz);
    }
}
