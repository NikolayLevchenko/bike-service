package com.BikeService.mvp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @Column(name = "PLZ", nullable = false, length = 5, unique = true)
    private Integer plz;

    @Column(name = "LATITUDE")
    private Double lat;

    @Column(name = "LONGITUDE")
    private Double lon;
}
