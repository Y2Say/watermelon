package com.yj2.watermelon.exception;

import lombok.Data;


@Data
public class ServiceException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private Integer status;
    private String message;

    public ServiceException(String message) {
        this.message = message;
    }

    public ServiceException(ExceptionEnum exceptionEnum) {
        this.status = exceptionEnum.getStatus();
        this.message = exceptionEnum.getErrorMsg();
    }

    public ServiceException(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}
