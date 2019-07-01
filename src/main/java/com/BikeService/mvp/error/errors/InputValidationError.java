package com.BikeService.mvp.error.errors;

import com.BikeService.mvp.error.ErrorResponse;
import com.BikeService.mvp.error.ErrorType;

import java.util.List;

public class InputValidationError extends ErrorResponse {

    private List<String> errors;

    public InputValidationError(String errorMessage, ErrorType errorType, List<String> errors) {
        super(errorMessage, errorType);
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
