package com.paiban.service;

import com.paiban.Util.exception.MyException;
import com.paiban.entity.TbUserEntity;
import com.paiban.repository.TbUserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Destiny_hao on 2017/10/9.
 */

@Service
public class UserService {

    @Resource
    private TbUserRepository tbUserRepository;

    public TbUserEntity findOne(Long id) throws MyException {
       return tbUserRepository.findOne(id);
    }
}
