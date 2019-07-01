package com.BikeService.mvp.exception;

import com.BikeService.mvp.error.ErrorResponse;
import com.BikeService.mvp.error.ErrorType;

public abstract class AbstractAPIException extends RuntimeException {

    private String errorMessage = "Message not provided";

    public AbstractAPIException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public AbstractAPIException() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ErrorResponse getErrorResponse() {
        return new ErrorResponse(getErrorMessage(), getErrorType());
    }

    public abstract ErrorType getErrorType();
}

