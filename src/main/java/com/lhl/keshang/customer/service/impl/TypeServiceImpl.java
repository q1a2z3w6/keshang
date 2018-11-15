package com.lhl.keshang.customer.service.impl;

import com.lhl.keshang.customer.dao.TypeDao;
import com.lhl.keshang.customer.pojo.Type;
import com.lhl.keshang.customer.service.TypeService;
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
 * @since 2018/11/14 9:59
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;

    @Override
    public Result typeList() {

        List<Type> types = typeDao.typeList();
        Result result = ResultUtil.success(types);

        return result;
    }
}
