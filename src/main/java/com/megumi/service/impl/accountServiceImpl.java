package com.megumi.service.impl;

import com.megumi.dao.AccountDao;
import com.megumi.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class accountServiceImpl implements accountService {
    @Autowired(required = true)
    private AccountDao accountDao;


@Transactional
    public void transfer(Integer takeUserId, Integer getUserId, Double givenMoney) {
//        增加
        accountDao.updateMoney(getUserId,givenMoney);
//        减少
        accountDao.updateMoney(takeUserId,-givenMoney);



    }



}
