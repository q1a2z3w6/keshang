package com.lhl.keshang.pub.utils;

import com.lhl.keshang.customer.pojo.Customer;
import com.lhl.keshang.filemanager.pojo.CustomerExcelVo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/15 17:15
 */
public class FileUtils {

    public static int downLoadToExcel(OutputStream outputStream, List<CustomerExcelVo> customers) {
        //文档对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Class<?> aClass = null;
        try {
            aClass = Class.forName("com.lhl.keshang.filemanager.pojo.CustomerExcelVo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Field[] fields = aClass.getFields();



        HSSFWorkbook wb = new HSSFWorkbook();
        int rowNum = 0;
        Sheet sheet = wb.createSheet("记录");
        Row row0 = sheet.createRow(rowNum++);
        //因为场景不同，titil不同，可以在外面写成数组当参数传进来
        String method = "";
        for(int i=0;i<fields.length;i++){
            method = "get"+fields[i].getName().toUpperCase()+"_";
            Method m = null;
            try {
                m = aClass.getMethod(method);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            try {
                row0.createCell(i).setCellValue((String) m.invoke(customers.get(0)));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        if (customers != null && customers.size() > 0) {
            for (CustomerExcelVo customer : customers) {
                Row row = sheet.createRow(rowNum++);
                for (int i=0;i<fields.length;i++){

                    char[] c = fields[i].getName().toCharArray();
                    c[0] = (char)(c[0]-32);
                    Method m = null;
                    try {
                        m = aClass.getMethod("get"+new String(c));
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                    try {
                        String s = null;
                        Object o = m.invoke(customer);
                        if(o instanceof Date){
                            s = simpleDateFormat.format(o);
                        }else{
                            s = o+"";
                        }
                        row.createCell(i).setCellValue(s);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        try {
            wb.write(outputStream);
            System.out.println("表数据写入到excel表成功,一共写入了"+(rowNum - 1)+"条数据");
            outputStream.close();
        } catch (IOException e) {
            System.out.println("流关闭异常！");
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println("流关闭异常！");
                }
            }
        }
        return rowNum - 1;
    }


}
