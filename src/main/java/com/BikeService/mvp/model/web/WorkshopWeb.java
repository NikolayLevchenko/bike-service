package com.BikeService.mvp.model.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkshopWeb {

    @NotBlank
    @Email
    @Length(max = 50)
    private String email;

    @Length(min = 6, max = 12)
    private String telNumber;

    @NotBlank
    @Length(max = 50)
    private String password;

    @Min(1000)
    @Max(99998)
    private Integer plz;

    @NotBlank
    private String services;

    public Long getTelNumber() {
        return Long.parseLong(telNumber);
    }
}
