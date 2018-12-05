package com.lhl.keshang.customer.dao.impl;

import com.lhl.keshang.customer.dao.CityDao;
import com.lhl.keshang.customer.mapper.CityMapper;
import com.lhl.keshang.customer.pojo.City;
import com.lhl.keshang.pub.pojo.Result;
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
 * @since 2018/12/4 19:20
 */
@Repository
public class CityDaoImpl implements CityDao {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> cityList(String pid) {

        List<City> cities = cityMapper.cityList(pid);

        return cities;
    }

}
