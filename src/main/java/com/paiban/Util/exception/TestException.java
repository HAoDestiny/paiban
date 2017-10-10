package com.paiban.Util.exception;

/**
 * Created by Destiny_hao on 2017/10/10.
 */
public class TestException extends Exception{
    private String msg;
    private String api;

    public TestException(String message, String api) {
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
