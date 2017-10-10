package com.paiban.Util.exception;

/**
 * Created by Destiny_hao on 2017/10/9.
 */
public class MyException extends Exception {
    private String msg;
    private String api;

    public MyException(String message, String api) {
        this.msg = message;
        this.api = api;
    }

    public String getMsg() {
        return msg;
    }

    public String getApi() {
        return api;
    }
}
