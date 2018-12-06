package com.lhl.keshang.customer.dao.impl;

import com.lhl.keshang.customer.dao.CustomerDao;
import com.lhl.keshang.customer.mapper.CustomerMapper;
import com.lhl.keshang.customer.mapper.YwyjMapper;
import com.lhl.keshang.customer.pojo.Customer;
import com.lhl.keshang.customer.pojo.Ywyj;
import com.lhl.keshang.customer.pojo.vo.CustomerLikeVo;
import com.lhl.keshang.customer.pojo.vo.CustomerSelectVo;
import com.lhl.keshang.customer.pojo.vo.YwyjVo;
import com.lhl.keshang.filemanager.pojo.CustomerExcelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private YwyjMapper ywyjMapper;

    @Override
    public List<CustomerExcelVo> findCustomerByVoNoPage(Customer customer) {

        List<CustomerExcelVo> customers = customerMapper.findCustomerByVoNoPage(customer);

        return customers;

    }

    @Override
    public Customer findCustomerByIdAndVersion(Customer customer) {

        customer = customerMapper.findCustomerByIdAndVersion(customer);

        return customer;
    }

    @Override
    public void updateCustomerById(Customer customer) {

        customerMapper.updateCustomerById(customer);

    }

    @Override
    public List<Customer> findCustomerByVo(CustomerSelectVo customerSelectVo) {

        List<Customer> customers = customerMapper.findCustomerByVo(customerSelectVo);

        return customers;
    }

    @Override
    public Integer customerCount(Customer customer) {

        Integer i = customerMapper.customerCount(customer);

        return i;
    }

    @Override
    public void saveCustomer(Customer customer) {

        customerMapper.addNewCustomer(customer);

    }

    @Override
    public void saveYwyj(List<YwyjVo> ywyj) {

        ywyjMapper.saveYwyjList(ywyj);

    }
    @Override
    public void updateYwyj(List<YwyjVo> ywyj) {

        ywyjMapper.updateYwyjList(ywyj);

    }

    @Override
    public List<Ywyj> selectByCustomerId(String customerId) {

        List<Ywyj> ywyjs = ywyjMapper.selectByCustomerId(customerId);
        return ywyjs;

    }
    @Override
    public List<Ywyj> selectByIdAndVersion(String id, Long version){

        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("version",version);

        List<Ywyj> ywyjs = ywyjMapper.selectByIdAndVersion(map);

        return ywyjs;

    }

    @Override
    public List<Customer> findByLikeVo(CustomerLikeVo customerLikeVo) {

        List<Customer> customers = customerMapper.findByLikeVo(customerLikeVo);

        return customers;
    }

    @Override
    public Integer findCustomerLikeCount(CustomerLikeVo customerLikeVo) {

        Integer i = customerMapper.findCustomerLikeCount(customerLikeVo);

        return i;
    }
}
