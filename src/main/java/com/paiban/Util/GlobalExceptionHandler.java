package com.paiban.Util;

import com.paiban.Util.exception.MyException;
import com.paiban.Util.exception.TestException;
import com.paiban.entity.ErrorEntity;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/9.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MyException.class) //针对的异常类型
    @ResponseBody
    public ErrorEntity errorHandler(HttpServletRequest request, MyException e) throws Exception {
        ErrorEntity errorEntity = new ErrorEntity();
        errorEntity.setApi(e.getApi());
        errorEntity.setMessage("error");
        errorEntity.setRet("FAILED");
        errorEntity.setStatus("ERROR");
        errorEntity.setTime(System.currentTimeMillis());
        return errorEntity;
    }

//    @ExceptionHandler(value = TestException.class) //针对的异常类型
//    @ResponseBody
//    public ErrorEntity testHandler(HttpServletRequest request, TestException e) throws Exception {
//
//        return setErrorEntity(e);
//    }
}