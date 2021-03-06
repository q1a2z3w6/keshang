package com.lhl.keshang.accountmanager.dao;

import com.lhl.keshang.accountmanager.pojo.Account;

import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/9 15:13
 */
public interface AccountDao {

    void addNewAccount(Account account);
    void deleteAccountByUid(Account account);
    void updateAccountByUid(Account account);
    List<Account> listAll();
    Account findAccountByUid(Account account);
    Account findAccountByNameAndPassword(Account account);
    Account findAccountByName(Account account);

}
