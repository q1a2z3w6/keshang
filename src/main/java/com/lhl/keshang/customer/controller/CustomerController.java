package com.lhl.keshang.customer.controller;

import com.lhl.keshang.customer.pojo.Customer;
import com.lhl.keshang.customer.pojo.vo.CustomerSelectVo;
import com.lhl.keshang.customer.pojo.vo.CustomerVo;
import com.lhl.keshang.customer.service.CustomerService;
import com.lhl.keshang.pub.pojo.PageBean;
import com.lhl.keshang.pub.pojo.Result;
import com.lhl.keshang.pub.utils.JsonUtil;
import com.lhl.keshang.pub.utils.ResultUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/14 15:35
 */
@RestController
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody @Valid CustomerVo customerVo,BindingResult bindingResult){

        if(bindingResult.hasFieldErrors()){
            return JsonUtil.objectToJsonString(ResultUtil.error(500,bindingResult.getFieldError().getField()+":"+bindingResult.getFieldError().getDefaultMessage()));
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerVo,customer);
        Result result = customerService.saveCustomer(customer);

        return JsonUtil.objectToJsonString(result);

    }
    @GetMapping("/customerCount")
    public String customerCount(){

        Result result = customerService.customerCount();
        return JsonUtil.objectToJsonString(result);

    }

    @GetMapping("/customerPages")
    public String customerPages(@RequestBody @Valid CustomerSelectVo customerSelectVo,BindingResult bindingResult){

        if(bindingResult.hasFieldErrors()){
            return JsonUtil.objectToJsonString(ResultUtil.error(500,bindingResult.getFieldError().getField()+":"+bindingResult.getFieldError().getDefaultMessage()));
        }

        Result result = customerService.customerPages(customerSelectVo);
        return JsonUtil.objectToJsonString(result);


    }

}
