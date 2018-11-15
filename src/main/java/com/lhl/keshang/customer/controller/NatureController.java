package com.lhl.keshang.customer.controller;

import com.lhl.keshang.customer.service.NatureService;
import com.lhl.keshang.pub.pojo.Result;
import com.lhl.keshang.pub.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/14 14:20
 */
@RestController
public class NatureController {

    @Autowired
    private NatureService natureService;

    @GetMapping("/natureList")
    public String natureList(){

        Result result = natureService.natureList();
        return JsonUtil.objectToJsonString(result);

    }

}
