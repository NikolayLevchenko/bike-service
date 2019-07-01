package com.BikeService.mvp.exception.exceptions;


import com.BikeService.mvp.error.ErrorType;
import com.BikeService.mvp.exception.AbstractAPIException;

public class SystemException extends AbstractAPIException {

    public SystemException(String errorMessage) {
        super(errorMessage);
    }

    public SystemException() {
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.SYSTEM;
    }

}
