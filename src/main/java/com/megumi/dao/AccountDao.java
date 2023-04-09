package com.megumi.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountDao {

    void updateMoney(@Param("id") Integer id, @Param("money") Double money);



}
