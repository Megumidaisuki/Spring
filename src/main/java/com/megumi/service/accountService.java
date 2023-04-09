package com.megumi.service;

import org.apache.ibatis.annotations.Param;

public interface accountService {

//    "takeUserId"：转走的用户id
//    "getUserId"：转入的用户id
//    "givenMoney"：转入的钱

    public void transfer(Integer takeUserId, Integer getUserId, Double givenMoney);


}
