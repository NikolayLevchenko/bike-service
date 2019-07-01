package com.BikeService.mvp.repository;

import com.BikeService.mvp.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query(value = "SELECT a FROM Address a WHERE a.plz = :plz")
    Address getAddressByPlz(@Param("plz") Integer plz);
}
