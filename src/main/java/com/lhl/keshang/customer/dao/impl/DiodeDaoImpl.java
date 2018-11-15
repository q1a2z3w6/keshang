package com.lhl.keshang.customer.dao.impl;

import com.lhl.keshang.customer.dao.DiodeDao;
import com.lhl.keshang.customer.mapper.DiodeMapper;
import com.lhl.keshang.customer.pojo.Diode;
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
 * @since 2018/11/14 11:47
 */
@Repository
public class DiodeDaoImpl implements DiodeDao {

    @Autowired
    private DiodeMapper diodeMapper;

    @Override
    public List<Diode> diodeList() {

        List<Diode> diodes = diodeMapper.diodeList();

        return diodes;
    }
}
