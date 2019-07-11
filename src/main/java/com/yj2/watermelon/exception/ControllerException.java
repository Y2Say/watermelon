package com.yj2.watermelon.exception;

import lombok.Data;

@Data
public class ControllerException extends RuntimeException {

    private static final long serialVersionUID = 694905108298102070L;

    private Integer status;
    private String message;

    public ControllerException(ExceptionEnum exceptionEnum) {
        this.status = exceptionEnum.getStatus();
        this.message = exceptionEnum.getErrorMsg();
    }

    public ControllerException(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}
