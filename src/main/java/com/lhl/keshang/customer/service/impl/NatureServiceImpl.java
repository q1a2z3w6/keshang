package com.lhl.keshang.customer.service.impl;

import com.lhl.keshang.customer.dao.NatureDao;
import com.lhl.keshang.customer.pojo.Nature;
import com.lhl.keshang.customer.service.NatureService;
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
 * @since 2018/11/14 14:22
 */
@Service
public class NatureServiceImpl implements NatureService {

    @Autowired
    private NatureDao natureDao;

    @Override
    public Result natureList() {

        List<Nature> natures = natureDao.natureList();

        return ResultUtil.success(natures);
    }
}
