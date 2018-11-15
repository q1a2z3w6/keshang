package com.lhl.keshang.customer.dao.impl;

import com.lhl.keshang.customer.dao.NatureDao;
import com.lhl.keshang.customer.mapper.NatureMapper;
import com.lhl.keshang.customer.pojo.Nature;
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
 * @since 2018/11/14 14:25
 */
@Repository
public class NatureDaoImpl implements NatureDao {

    @Autowired
    private NatureMapper natureMapper;

    @Override
    public List<Nature> natureList() {

        List<Nature> natures = natureMapper.natureList();
        return natures;

    }
}


