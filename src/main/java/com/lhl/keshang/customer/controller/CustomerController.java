package com.lhl.keshang.customer.controller;

import com.lhl.keshang.customer.pojo.Customer;
import com.lhl.keshang.customer.pojo.vo.CustomerSelectVo;
import com.lhl.keshang.customer.pojo.vo.CustomerUpdateVo;
import com.lhl.keshang.customer.pojo.vo.CustomerVo;
import com.lhl.keshang.customer.service.CustomerFacadeService;
import com.lhl.keshang.customer.service.CustomerService;
import com.lhl.keshang.filemanager.pojo.CustomerExcelVo;
import com.lhl.keshang.pub.pojo.PageBean;
import com.lhl.keshang.pub.pojo.Result;
import com.lhl.keshang.pub.utils.FileUtils;
import com.lhl.keshang.pub.utils.JsonUtil;
import com.lhl.keshang.pub.utils.ResultUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

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
    @Autowired
    private CustomerFacadeService customerFacadeService;

    @PostMapping("/saveCustomer")
    @Transactional
    public String saveCustomer(@RequestBody @Valid CustomerVo customerVo,BindingResult bindingResult){

        if(bindingResult.hasFieldErrors()){
            return JsonUtil.objectToJsonString(ResultUtil.error(500,bindingResult.getFieldError().getField()+":"+bindingResult.getFieldError().getDefaultMessage()));
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerVo,customer);
        Result result = customerService.saveCustomer(customer);

        return JsonUtil.objectToJsonString(result);

    }
    @PostMapping("/customerCount")
    public String customerCount(@RequestBody CustomerSelectVo customerSelectVo){

        Result result = customerService.customerCount(customerSelectVo);
        return JsonUtil.objectToJsonString(result);

    }
    @PostMapping("/downExcel")
    public void downExcel(@RequestBody CustomerSelectVo customerSelectVo, HttpServletRequest req, HttpServletResponse resp){

        Result result = customerService.downExcelByVo(customerSelectVo,req,resp);

    }

    @GetMapping("/moneyTypeList")
    public String moneyTypeList(){

        Result result = customerFacadeService.currencyList();
        return JsonUtil.objectToJsonString(result);

    }

    @GetMapping("/cityUrl/{pid}")
    public String cityUrl(@PathVariable("pid") String pid){

        Result result = customerFacadeService.cityList(pid);
        return JsonUtil.objectToJsonString(result);

    }

    @GetMapping("/salesList")
    public String salesList(){

        Result result = customerFacadeService.salesList();
        return JsonUtil.objectToJsonString(result);
    }

    @GetMapping("/provinceList")
    public String provinceList(){

        Result result = customerFacadeService.provinceList();
        return JsonUtil.objectToJsonString(result);

    }

    @GetMapping("/natureList")
    public String natureList(){

        Result result = customerFacadeService.natureList();
        return JsonUtil.objectToJsonString(result);

    }

    @GetMapping("/diodeList")
    public String diodeList(){

        Result result = customerFacadeService.diodeList();
        return JsonUtil.objectToJsonString(result);

    }

    @GetMapping("/typeList")
    public String typeList(){

        Result result = customerFacadeService.typeList();
        return JsonUtil.objectToJsonString(result);

    }

    @PostMapping("/updateCustomer")
    public String updateCustomer(@RequestBody @Valid CustomerUpdateVo customerUpdateVo,BindingResult bindingResult){

        if(bindingResult.hasFieldErrors()){
            return JsonUtil.objectToJsonString(ResultUtil.error(500,bindingResult.getFieldError().getField()+":"+bindingResult.getFieldError().getDefaultMessage()));
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerUpdateVo,customer);
        Result result = customerService.updateCustomer(customer);

        return JsonUtil.objectToJsonString(result);

    }

    @PostMapping("/customerPages")
    public String customerPages(@RequestBody CustomerSelectVo customerSelectVo){


        Result result = customerService.customerPages(customerSelectVo);
        return JsonUtil.objectToJsonString(result);


    }


    @GetMapping("/selectYwyjByCustomerId/{customerId}")
    public String selectYwyjByCustomerUd(@PathVariable("customerId") String customerId){

        Result result = customerService.selectYwyjByCustomerId(customerId);

        return JsonUtil.objectToJsonString(result);

    }

}
