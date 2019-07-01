package com.BikeService.mvp.model.entity;

import com.BikeService.mvp.model.base.AbstractBaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIKE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bike extends AbstractBaseEntity {

    @Column(name = "MODEL", length = 20)
    private String tsn;

    @Column(name = "NUMBER", length = 20)
    private String hsn;

}
