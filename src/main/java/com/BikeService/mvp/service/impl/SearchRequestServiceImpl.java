package com.BikeService.mvp.service.impl;

import com.BikeService.mvp.model.entity.SearchRequest;
import com.BikeService.mvp.model.entity.Workshop;
import com.BikeService.mvp.model.web.SearchRequestWeb;
import com.BikeService.mvp.repository.SearchRequestRepository;
import com.BikeService.mvp.repository.WorkshopRepository;
import com.BikeService.mvp.service.AddressService;
import com.BikeService.mvp.service.BikeService;
import com.BikeService.mvp.service.SearchRequestService;
import com.BikeService.mvp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchRequestServiceImpl implements SearchRequestService {

    @Autowired
    SearchRequestRepository searchRequestRepository;

    @Autowired
    BikeService bikeService;

    @Autowired
    UserService userService;

    @Autowired
    AddressService addressService;

    @Autowired
    WorkshopRepository workshopRepository;

    @Override
    public List<Workshop> createSearchRequest(SearchRequestWeb searchRequestWeb) {
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.setUser(userService.getUser(searchRequestWeb.getUser().getTelNumber(), searchRequestWeb.getUser().getEmail()));
        searchRequest.setBike(bikeService.getBikeByModelAndNumber(searchRequestWeb.getBike().getModel(), searchRequestWeb.getBike().getNumber()));
        searchRequest.setAddress(addressService.getAddressByPlz(searchRequestWeb.getPlz()));
        searchRequest.setServices(searchRequestWeb.getServices());
        searchRequestRepository.save(searchRequest);

        return workshopRepository.findAllByPlz(searchRequestWeb.getPlz());
    }

    @Override
    public List<SearchRequest> getSearchRequestListByUserId(Long userId) {
        return searchRequestRepository.getSearchRequestListByUserId(userId);
    }
}
