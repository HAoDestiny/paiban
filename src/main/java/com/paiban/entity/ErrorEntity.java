package com.paiban.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.annotation.Resource;
import javax.persistence.Entity;

/**
 * Created by Destiny_hao on 2017/10/9.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorEntity {
    private String api;
    private String message;
    private String ret;
    private String status;
    private long time;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
