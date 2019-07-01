package com.BikeService.mvp.service.impl;

import com.BikeService.mvp.exception.exceptions.ResourceNotFoundException;
import com.BikeService.mvp.model.entity.User;
import com.BikeService.mvp.repository.UserRepository;
import com.BikeService.mvp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(Long telNumber, String email) {
        User user = new User();
        user.setTelNumber(telNumber);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }

    @Override
    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new ResourceNotFoundException("User was not found");
        }
    }

    @Override
    public User getUser(Long telNumber, String email) {
        Optional<User> user = Optional.ofNullable(userRepository.findByTelNumber(telNumber));
        return user.orElseGet(() -> createUser(telNumber, email));
    }
}
