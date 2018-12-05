package com.lhl.keshang.customer.dao.impl;

import com.lhl.keshang.customer.dao.ProvinceDao;
import com.lhl.keshang.customer.mapper.ProvinceMapper;
import com.lhl.keshang.customer.pojo.Province;
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
 * @since 2018/12/4 20:04
 */
@Service
public class ProvinceDaoImpl implements ProvinceDao {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<Province> provinceList() {

        List<Province> provinces = provinceMapper.provinceList();

        return provinces;
    }
}

