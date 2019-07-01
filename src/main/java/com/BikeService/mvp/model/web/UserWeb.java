package com.BikeService.mvp.model.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserWeb {

    @Length(min = 6, max = 12)
    private String telNumber;

    @Email
    @Length(max = 50)
    private String email;

    public Long getTelNumber() {
        return Long.parseLong(telNumber);
    }
}
