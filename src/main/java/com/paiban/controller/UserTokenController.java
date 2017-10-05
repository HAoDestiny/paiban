package com.paiban.controller;

import com.paiban.repository.TbUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by Destiny_hao on 2017/10/4.
 */

@Controller
@RequestMapping(value = "test")
public class UserTokenController {

    @Autowired
    private TbUserRepository tbUserRepository;

//    private ResultEntity resultEntity = new ResultEntity();

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody //防止返回的是视图
    public String  test() {

//        resultEntity.setApi("test");
//        resultEntity.setRet("error");
//        resultEntity.setMsg("");
//        resultEntity.setData(userTokenRepository.findById(1));
        return "wocao";
    }

    @RequestMapping("/home")
    public String helloHtml(HashMap<String,Object> map){
        map.put("hello","hello");
        return"/home/SegmentFault";
    }

    @RequestMapping("/testReturn")
    public String testReeturn(HashMap<String,Object> map){
        map.put("hello","hello");
        return"/test";
    }
}
