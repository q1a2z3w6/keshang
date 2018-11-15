package com.lhl.keshang.customer.service.impl;

import com.lhl.keshang.customer.dao.CustomerDao;
import com.lhl.keshang.customer.pojo.Customer;
import com.lhl.keshang.customer.pojo.vo.CustomerSelectVo;
import com.lhl.keshang.customer.service.CustomerService;
import com.lhl.keshang.pub.pojo.Result;
import com.lhl.keshang.pub.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
 * @since 2018/11/14 16:23
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Result customerPages(CustomerSelectVo customerSelectVo) {

        customerSelectVo.initParam();

        List<Customer> customers = customerDao.findCustomerByVo(customerSelectVo);

        return ResultUtil.success(customers);
    }

    @Override
    public Result customerCount() {

        Integer i = customerDao.customerCount();

        return ResultUtil.success(i);
    }

    @Override
    public Result saveCustomer(Customer customer) {
        customer.setId(UUID.randomUUID().toString());
        Date date = new Date();
        customer.setCreateDate(date);
        customer.setUpdateDate(date);
        customerDao.saveCustomer(customer);
        return ResultUtil.success(customer);
    }
}
