package com.lhl.keshang.customer.service.impl;

import com.lhl.keshang.customer.pojo.Ywyj;
import com.lhl.keshang.customer.service.*;
import com.lhl.keshang.pub.pojo.Result;
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
public class CustomerFacadeServiceImpl implements CustomerFacadeService {

    @Autowired
    private CityService cityService;
    @Autowired
    private ProvinceService provinceService;
    @Autowired
    private CurrencyService currencyService;
    @Autowired
    private NatureService natureService;
    @Autowired
    private DiodeService diodeService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private SalesService salesService;

    @Override
    public Result cityList(String pid) {
        return cityService.cityList(pid);
    }

    @Override
    public Result currencyList() {
        return currencyService.currencyList();
    }

    @Override
    public Result provinceList() {
        return provinceService.provinceList();
    }

    @Override
    public Result natureList() {
        return natureService.natureList();
    }

    @Override
    public Result diodeList() {
        return diodeService.diodeList();
    }

    @Override
    public Result typeList() {
        return typeService.typeList();
    }

    @Override
    public Result salesList(){

        return salesService.salesList();

    }


}
