package com.lhl.keshang.customer.service.impl;

import com.lhl.keshang.customer.dao.CurrencyDao;
import com.lhl.keshang.customer.pojo.City;
import com.lhl.keshang.customer.pojo.Currency;
import com.lhl.keshang.customer.service.CurrencyService;
import com.lhl.keshang.pub.pojo.Result;
import com.lhl.keshang.pub.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/12/4 19:16
 */
@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyDao currencyDao;

    @Override
    public Result currencyList() {

        Result result = null;
        List<Currency> currencies = currencyDao.currencyList();
        if(currencies!=null||currencies.size()==0){

            result = ResultUtil.success(currencies);

        }else{

            result = ResultUtil.error(500,"币种查询结果为空");

        }

        return result;
    }
}
