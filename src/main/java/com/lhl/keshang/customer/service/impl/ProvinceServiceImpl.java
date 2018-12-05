package com.lhl.keshang.customer.service.impl;

import com.lhl.keshang.customer.dao.ProvinceDao;
import com.lhl.keshang.customer.pojo.City;
import com.lhl.keshang.customer.pojo.Province;
import com.lhl.keshang.customer.service.ProvinceService;
import com.lhl.keshang.pub.pojo.Result;
import com.lhl.keshang.pub.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/12/4 19:17
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceDao provinceDao;

    @Override
    public Result provinceList() {

        Result result = null;
        List<Province> provinces = provinceDao.provinceList();
        if(provinces!=null||provinces.size()==0){

            result = ResultUtil.success(provinces);

        }else{

            result = ResultUtil.error(500,"省份查询结果为空");

        }

        return result;
    }

}
