package com.lhl.keshang.accountmanager.controller;

import com.lhl.keshang.accountmanager.pojo.Account;
import com.lhl.keshang.accountmanager.pojo.vo.AccountLoginVo;
import com.lhl.keshang.accountmanager.service.AccountService;
import com.lhl.keshang.pub.pojo.Result;
import com.lhl.keshang.pub.utils.JsonUtil;
import com.lhl.keshang.pub.utils.ResultUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/9 15:21
 */
@RestController
public class LoginController {

    @Autowired
    private AccountService loginService;

    @PostMapping("/loginValidate")
    public String loginValidate(@RequestBody @Valid AccountLoginVo accountSelectVo, BindingResult bindingResult, HttpServletRequest req){

        if(bindingResult.hasFieldErrors()){
            return JsonUtil.objectToJsonString(ResultUtil.error(500,bindingResult.getFieldError().getField()+":"+bindingResult.getFieldError().getDefaultMessage()));
        }
        Account account = new Account();
        BeanUtils.copyProperties(accountSelectVo,account);
        Result result = loginService.loginValidate(account);
        if(result.getData()!=null&&result.getData().size()!=0){
            req.getSession().setAttribute("account",result.getData().get(0));
        }
        return JsonUtil.objectToJsonString(result);


    }

}
