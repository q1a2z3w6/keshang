package com.lhl.keshang.customer.dao.impl;

import com.lhl.keshang.customer.dao.CurrencyDao;
import com.lhl.keshang.customer.mapper.CurrencyMapper;
import com.lhl.keshang.customer.pojo.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/12/4 19:28
 */
@Repository
public class CurrencyDaoImpl implements CurrencyDao {

    @Autowired
    private CurrencyMapper currencyMapper;

    @Override
    public List<Currency> currencyList() {

        List<Currency> currencies = currencyMapper.currencyList();

        return currencies;
    }
}
