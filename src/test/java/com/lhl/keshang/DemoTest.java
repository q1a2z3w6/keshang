package com.lhl.keshang;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lhl.keshang.customer.pojo.Customer;
import com.lhl.keshang.customer.pojo.Type;
import com.lhl.keshang.filemanager.pojo.CustomerExcelVo;
import com.lhl.keshang.pub.utils.FileUtils;
import com.lhl.keshang.pub.utils.JsonUtil;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    public void yu() throws IOException {
        CustomerExcelVo customer = null;
        List<CustomerExcelVo> customers = new ArrayList<>();
        for (int i=0;i<100;i++){

            customer = new CustomerExcelVo();
            customer.setId(UUID.randomUUID().toString());
            customer.setName("名称"+i);
            customers.add(customer);

        }

        File file = new File("D:/123.xls");
        if(!file.exists()){
            file.createNewFile();
        }
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file));
        FileUtils.downLoadToExcel(outputStream,customers);


    }

}
