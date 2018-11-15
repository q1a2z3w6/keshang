package com.lhl.keshang;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lhl.keshang.customer.pojo.Type;
import com.lhl.keshang.pub.utils.JsonUtil;
import org.junit.Test;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/14 11:15
 */
public class DemoTest {

    @Test
    public void yu() throws JsonProcessingException {


        Type type = new Type();
        type.setId(1);
        type.setPId(3);
        type.setName("234");

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(type);

        System.out.println(s);

    }

}
