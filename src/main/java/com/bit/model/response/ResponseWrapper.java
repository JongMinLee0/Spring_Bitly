package com.bit.model.response;


public class ResponseWrapper {
    private int code;
    private String message;
    private Object param;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getParam() {
        return param;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setParam(Object param) {
        this.param = param;
    }
}
