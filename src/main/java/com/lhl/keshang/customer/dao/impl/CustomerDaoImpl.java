package com.lhl.keshang.customer.dao.impl;

import com.lhl.keshang.customer.dao.CustomerDao;
import com.lhl.keshang.customer.mapper.CustomerMapper;
import com.lhl.keshang.customer.pojo.Customer;
import com.lhl.keshang.customer.pojo.vo.CustomerSelectVo;
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
 * @since 2018/11/14 17:23
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> findCustomerByVo(CustomerSelectVo customerSelectVo) {

        List<Customer> customers = customerMapper.findCustomerByVo(customerSelectVo);

        return customers;
    }

    @Override
    public Integer customerCount() {

        Integer i = customerMapper.customerCount();

        return i;
    }

    @Override
    public void saveCustomer(Customer customer) {

        customerMapper.addNewCustomer(customer);

    }
}
