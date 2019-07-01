package com.BikeService.mvp.model.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequestWeb {

    @NotNull
    @Valid
    private UserWeb user;

    @NotNull
    @Valid
    private BikeWeb bike;

    @Min(1000)
    @Max(99998)
    private Integer plz;

    @NotBlank
    private String services;
}
