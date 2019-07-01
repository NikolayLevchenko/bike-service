package com.BikeService.mvp.repository;

import com.BikeService.mvp.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByTelNumber(Long telNumber);
}
