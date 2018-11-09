package com.lhl.keshang.test.mapper;

import com.lhl.keshang.test.pojo.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/9 8:52
 */
@Mapper
@Repository
public interface TestMapper {

    void insert(Test test);

}
