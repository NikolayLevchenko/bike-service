package com.BikeService.mvp.service;

import com.BikeService.mvp.model.entity.SearchRequest;
import com.BikeService.mvp.model.entity.Workshop;
import com.BikeService.mvp.model.web.SearchRequestWeb;

import java.util.List;

public interface SearchRequestService {

    List<Workshop> createSearchRequest(SearchRequestWeb searchRequestWeb);

    List<SearchRequest> getSearchRequestListByUserId(Long userId);
}
