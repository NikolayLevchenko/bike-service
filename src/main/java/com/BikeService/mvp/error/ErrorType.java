package com.BikeService.mvp.error;

import com.BikeService.mvp.exception.AbstractAPIException;
import com.BikeService.mvp.exception.exceptions.InputValidationException;
import com.BikeService.mvp.exception.exceptions.ResourceNotFoundException;
import com.BikeService.mvp.exception.exceptions.SystemException;

public enum ErrorType {

    INPUT(400, ErrorCode.INP, InputValidationException.class),
    SYSTEM(500, ErrorCode.SYS, SystemException.class),
    RESOURCE_NOT_FOUND_ERROR(404, ErrorCode.RNF, ResourceNotFoundException.class);

    private Integer httpCode;
    private ErrorCode errorCodeType;
    private Class<? extends AbstractAPIException> errorClass;

    ErrorType(Integer httpCode, ErrorCode errorCodeType, Class<? extends AbstractAPIException> errorClass) {
        this.httpCode = httpCode;
        this.errorCodeType = errorCodeType;
        this.errorClass = errorClass;
    }

    public String getErrorCodeType() {
        return errorCodeType.name();
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public Class<? extends AbstractAPIException> getErrorClass() {
        return errorClass;
    }

    public static ErrorType getById(String errorCodeName) {
        if (errorCodeName == null) {
            throw new IllegalArgumentException("Error code cannot be null");
        }

        for (ErrorType errorType : values()) {
            if (errorType.getErrorCodeType().equals(errorCodeName)) {
                return errorType;
            }
        }

        throw new IllegalArgumentException(String.format("Error type with error code %s does not exist", errorCodeName));
    }
}

enum ErrorCode {
    INP, SYS, RNF
}
