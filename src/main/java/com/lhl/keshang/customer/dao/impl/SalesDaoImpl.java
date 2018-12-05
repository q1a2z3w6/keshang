package com.lhl.keshang.customer.dao.impl;

import com.lhl.keshang.customer.dao.SalesDao;
import com.lhl.keshang.customer.mapper.SalesMapper;
import com.lhl.keshang.customer.pojo.Sales;
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
 * @since 2018/12/5 8:45
 */
@Repository
public class SalesDaoImpl implements SalesDao {

    @Autowired
    private SalesMapper salesMapper;

    @Override
    public List<Sales> salesList() {
        return salesMapper.salesList();
    }
}
