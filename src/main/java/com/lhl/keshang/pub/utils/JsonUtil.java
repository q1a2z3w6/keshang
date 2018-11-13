package com.lhl.keshang.pub.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * json工具类
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/10/25 8:18
 */
@Component
public class JsonUtil {

    private static ObjectMapper objectMapper;

    static {

        objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

    }


    /**
     * 将实体类转化为json字符串
     * @param obj 要转换的实例
     * @return
     */
    public static String objectToJsonString(Object obj) {

        String string = null;
        try {
            string = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return string;

    }

    /**
     * 将字符串转换为指定的类的实例
     * @param s  json格式字符串
     * @param cl 类型
     * @return
     */
    public static Object JsonStringToObject(String s,Class<?> cl) {

        Object object = null;
        try {
            object = objectMapper.readValue(s,cl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;

    }

}
