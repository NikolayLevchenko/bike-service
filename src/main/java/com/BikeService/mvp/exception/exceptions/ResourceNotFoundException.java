package com.BikeService.mvp.exception.exceptions;

import com.BikeService.mvp.error.ErrorType;
import com.BikeService.mvp.exception.AbstractAPIException;

public class ResourceNotFoundException extends AbstractAPIException {
    @Override
    public ErrorType getErrorType() {
        return ErrorType.RESOURCE_NOT_FOUND_ERROR;
    }

    public ResourceNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    public ResourceNotFoundException() {
    }
}
