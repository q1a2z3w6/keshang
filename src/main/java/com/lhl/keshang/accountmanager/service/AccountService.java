package com.lhl.keshang.accountmanager.service;

import com.lhl.keshang.accountmanager.pojo.Account;
import com.lhl.keshang.pub.pojo.Result;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/9 14:50
 */
public interface AccountService {
    Result loginValidate(Account account);

    Result validateUserName(Account account);

    Result addNewAccount(Account account);
}
