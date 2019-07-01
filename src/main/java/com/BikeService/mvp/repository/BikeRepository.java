package com.BikeService.mvp.repository;

import com.BikeService.mvp.model.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {

    @Query("SELECT c FROM Bike c WHERE c.model = :model AND c.number = :number")
    Bike getBikeByModelAndNumber(@Param("model") String model, @Param("number") String number);
}
