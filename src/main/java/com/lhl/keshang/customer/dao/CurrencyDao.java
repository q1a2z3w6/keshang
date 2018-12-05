package com.lhl.keshang.customer.dao;

import com.lhl.keshang.customer.pojo.Currency;
import com.lhl.keshang.pub.pojo.Result;

import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/14 14:22
 */
public interface CurrencyDao {
    List<Currency> currencyList();
}
