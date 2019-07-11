package com.yj2.watermelon.exception;

import lombok.Data;

@Data
public class ServerResponse<T> {


    /*private Integer status;

    private String message;

    public ServerResponse() {

    }

    public ServerResponse(Integer status, String message) {
        this.status = status;
        this.message = message;

    }

    public static <T> ServerResponse<T> errorMessage(Integer status, String message) {
        ServerResponse<T> res = new ServerResponse<>();
        res.setStatus(status);
        res.setMessage(message);
        return res;
    }*/


}
