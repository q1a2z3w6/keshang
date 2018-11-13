package com.lhl.keshang.accountmanager.dao.impl;

import com.lhl.keshang.accountmanager.dao.AccountDao;
import com.lhl.keshang.accountmanager.mapper.AccountMapper;
import com.lhl.keshang.accountmanager.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/9 15:13
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void addNewAccount(Account account) {
        account.setCreateDate(new Date());
        account.setUserId(UUID.randomUUID().toString());
        accountMapper.addNewAccount(account);
    }

    @Override
    public void deleteAccountByUid(Account account) {
        deleteAccountByUid(account);
    }

    @Override
    public void updateAccountByUid(Account account) {
        accountMapper.updateAccountByUid(account);
    }

    @Override
    public List<Account> listAll() {

        List<Account> accounts = null;
        accounts = accountMapper.listAll();

        return accounts;
    }

    @Override
    public Account findAccountByUid(Account account) {

        Account a = null;
        a = accountMapper.findAccountByUid(account);

        return a;
    }

    @Override
    public Account findAccountByNameAndPassword(Account account) {

        Account a = null;
        a = accountMapper.findAccountByNameAndPassword(account);

        return a;
    }

    @Override
    public Account findAccountByName(Account account) {

        Account a = null;
        a = accountMapper.findAccountByName(account);

        return a;
    }
}
