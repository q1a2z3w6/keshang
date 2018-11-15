package com.lhl.keshang.customer.service.impl;

import com.lhl.keshang.customer.dao.DiodeDao;
import com.lhl.keshang.customer.pojo.Diode;
import com.lhl.keshang.customer.service.DiodeService;
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
 * @since 2018/11/14 11:45
 */
@Service
public class DiodeServiceImpl implements DiodeService {

    @Autowired
    private DiodeDao diodeDao;

    @Override
    public Result diodeList() {

        List<Diode> diodes = diodeDao.diodeList();
        Result result = ResultUtil.success(diodes);

        return result;
    }
}
