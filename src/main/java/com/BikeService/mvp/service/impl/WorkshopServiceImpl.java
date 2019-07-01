package com.BikeService.mvp.service.impl;

import com.BikeService.mvp.model.entity.Workshop;
import com.BikeService.mvp.model.web.WorkshopWeb;
import com.BikeService.mvp.repository.WorkshopRepository;
import com.BikeService.mvp.service.AddressService;
import com.BikeService.mvp.service.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkshopServiceImpl implements WorkshopService {

    @Autowired
    WorkshopRepository workshopRepository;

    @Autowired
    AddressService addressService;

    @Override
    public void createWorkshop(WorkshopWeb workshopWeb) {
        Workshop workshop = new Workshop();
        workshop.setEmail(workshopWeb.getEmail());
        workshop.setTelNumber(workshopWeb.getTelNumber());
        workshop.setPassword(workshopWeb.getPassword());
        workshop.setAddress(addressService.getAddressByPlz(workshopWeb.getPlz()));
        workshop.setServices(workshopWeb.getServices());
        workshopRepository.save(workshop);
    }
}
