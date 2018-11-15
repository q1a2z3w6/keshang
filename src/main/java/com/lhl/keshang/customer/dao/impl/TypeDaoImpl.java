package com.lhl.keshang.customer.dao.impl;

import com.lhl.keshang.customer.dao.TypeDao;
import com.lhl.keshang.customer.mapper.TypeMapper;
import com.lhl.keshang.customer.pojo.Type;
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
 * @since 2018/11/14 10:01
 */
@Repository
public class TypeDaoImpl implements TypeDao {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> typeList() {

        List<Type> types = typeMapper.selectAll();

        return types;
    }
}
