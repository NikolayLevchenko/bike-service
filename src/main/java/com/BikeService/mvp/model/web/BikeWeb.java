package com.BikeService.mvp.model.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BikeWeb {

    @NotBlank
    @Length(min = 3, max = 3)
    private String model;

    @NotBlank
    @Length(min = 4, max = 4)
    private String number;

}
