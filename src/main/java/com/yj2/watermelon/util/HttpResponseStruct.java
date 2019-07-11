package com.yj2.watermelon.util;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Objects;

public class HttpResponseStruct {
    @JSONField
    private int status;
    @JSONField
    private String message;
    @JSONField
    private Object data;

    public HttpResponseStruct() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HttpResponseStruct that = (HttpResponseStruct) o;
        return status == that.status &&
                Objects.equals(message, that.message) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {

        return Objects.hash(status, message, data);
    }
}
