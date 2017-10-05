package com.paiban.repository;

import com.paiban.entity.TbUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Destiny_hao on 2017/10/4.
 */

@Repository                                            //实体类名
public interface TbUserRepository extends JpaRepository<TbUserEntity, Integer>{
    TbUserEntity findById(Integer id);
}
