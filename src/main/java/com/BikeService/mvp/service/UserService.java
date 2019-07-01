package com.BikeService.mvp.service;

import com.BikeService.mvp.model.entity.User;

public interface UserService {

    User createUser(Long telNumber, String email);

    User getUser(Long id);

    User getUser(Long telNumber, String email);
}
