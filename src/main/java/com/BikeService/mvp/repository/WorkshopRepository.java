package com.BikeService.mvp.repository;

import com.BikeService.mvp.model.entity.Workshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkshopRepository extends JpaRepository<Workshop, Long> {
    @Query(value = "SELECT w FROM Workshop w WHERE w.address.plz = :plz")
    List<Workshop> findAllByPlz(@Param("plz") Integer plz);
}
