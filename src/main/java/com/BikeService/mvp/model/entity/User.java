package com.BikeService.mvp.model.entity;

import com.BikeService.mvp.model.base.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TEL_NUMBER", nullable = false, length = 20, unique = true)
    private Long telNumber;

    @Column(name = "EMAIL", length = 50, unique = true)
    private String email;
}
