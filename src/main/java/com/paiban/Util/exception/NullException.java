package com.paiban.Util.exception;

import com.paiban.entity.ErrorEntity;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Destiny_hao on 2017/10/9.
 */

@Controller
public class NullException implements ErrorController {

    private static final String ERROR_PATH = "/error";
    private ErrorEntity errorEntity = new ErrorEntity();

    @RequestMapping(value=ERROR_PATH)
    @ResponseBody
    public ErrorEntity handleError(){
        errorEntity.setTime(System.currentTimeMillis());
        errorEntity.setStatus("ERROR");
        errorEntity.setRet("FAIL");
        return errorEntity;
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
