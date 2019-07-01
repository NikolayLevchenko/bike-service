package com.BikeService.mvp.exception;


import com.BikeService.mvp.error.ErrorType;
import com.BikeService.mvp.error.errors.InputValidationError;

import java.util.List;

public abstract class ValidationException extends AbstractAPIException {

    public ValidationException(String errorMessage) {
        super(errorMessage);
    }

    public ValidationException() {
    }

    public abstract ErrorType getErrorType();

    @Override
    public InputValidationError getErrorResponse() {
        return new InputValidationError(getErrorMessage(), getErrorType(), getErrors());
    }

    protected abstract List<String> getErrors();
}
