package com.lhl.keshang.accountmanager.service.impl;

import com.lhl.keshang.accountmanager.dao.AccountDao;
import com.lhl.keshang.accountmanager.pojo.Account;
import com.lhl.keshang.accountmanager.service.AccountService;
import com.lhl.keshang.pub.pojo.Result;
import com.lhl.keshang.pub.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/9 15:37
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Result addNewAccount(Account account) {
        Result result = new Result();
            try{
                accountDao.addNewAccount(account);
                result = ResultUtil.success(account);
            }catch (Exception e){
                result = ResultUtil.error(500,e.getMessage());
                e.printStackTrace();
        }

        return result;
    }

    @Override
    public Result loginValidate(Account account) {

        Result result = null;
        Account a = accountDao.findAccountByNameAndPassword(account);
        if(a!=null&&a.getUserId()!=null&&(!a.getUserId().equals(""))){
            result = ResultUtil.success(a);
        }else{
            result = ResultUtil.error(400,"用户名密码错误");
        }


        return result;
    }

    @Override
    public Result validateUserName(Account account) {

        Account accountByName = accountDao.findAccountByName(account);
        if(accountByName!=null&&accountByName.getUserId()!=null&&(!accountByName.getUserId().equals(""))){
            return ResultUtil.error(400,"用户名已存在");
        }else{
            return ResultUtil.success(account);
        }

    }
}
