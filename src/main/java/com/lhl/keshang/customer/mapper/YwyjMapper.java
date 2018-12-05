package com.lhl.keshang.customer.mapper;

import com.lhl.keshang.customer.pojo.Ywyj;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/12/5 14:09
 */
@Mapper
@Repository
public interface YwyjMapper {

    void saveYwyjList(List list);
    void updateYwyjList(List list);
    List<Ywyj> selectByCustomerId(String customerId);

}
