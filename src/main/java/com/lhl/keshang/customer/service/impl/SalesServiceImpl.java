package com.lhl.keshang.customer.service.impl;

import com.lhl.keshang.customer.dao.SalesDao;
import com.lhl.keshang.customer.pojo.Sales;
import com.lhl.keshang.customer.service.SalesService;
import com.lhl.keshang.pub.pojo.Result;
import com.lhl.keshang.pub.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/12/5 8:46
 */
@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    private SalesDao salesDao;

    @Override
    public Result salesList() {

        Result result = null;
        List<Sales> sales = salesDao.salesList();
        if(sales!=null&&sales.size()!=0){
            ArrayList<String> res = new ArrayList<>();
            for(Sales s:sales){

                res.add(s.getName());

            }
            result = ResultUtil.success(res);

        }else{

            result = ResultUtil.error(500,"认证体系为空");

        }

        return result;
    }
}
