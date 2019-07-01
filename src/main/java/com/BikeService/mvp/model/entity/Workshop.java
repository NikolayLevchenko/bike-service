package com.BikeService.mvp.model.entity;

import com.BikeService.mvp.model.base.AbstractBaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "WORKSHOP")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workshop extends AbstractBaseEntity {

    @Column(name = "EMAIL", nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "TEL_NUMBER", nullable = false, length = 20, unique = true)
    private Long telNumber;

    @Column(name = "PASSWORD", nullable = false, length = 50)
    private String password;

    @ManyToOne
    @JoinColumn(name = "ADDRESS_PLZ")
    private Address address;

    @Column(name = "SERVICES", nullable = false)
    private String services;
}
