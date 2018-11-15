package com.lhl.keshang.customer.service.impl;

import com.lhl.keshang.customer.dao.CustomerDao;
import com.lhl.keshang.customer.pojo.Customer;
import com.lhl.keshang.customer.pojo.vo.CustomerSelectVo;
import com.lhl.keshang.customer.service.CustomerService;
import com.lhl.keshang.filemanager.pojo.CustomerExcelVo;
import com.lhl.keshang.pub.pojo.Result;
import com.lhl.keshang.pub.utils.FileUtils;
import com.lhl.keshang.pub.utils.ResultUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/14 16:23
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Result downExcelByVo(CustomerSelectVo customerSelectVo, HttpServletRequest req, HttpServletResponse resp) {

        Customer customer = new Customer();
        BeanUtils.copyProperties(customerSelectVo,customer);
        List<CustomerExcelVo> excelVos = customerDao.findCustomerByVoNoPage(customer);
        String path = req.getServletContext().getRealPath("");
        System.out.println(path);
        File file = new File(path, UUID.randomUUID().toString()+".xls");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            FileUtils.downLoadToExcel(bufferedOutputStream,excelVos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        resp.setHeader("Content-Disposition", "attachment;fileName=记录.xls");
        try {
            BufferedOutputStream  outputStream = new BufferedOutputStream(resp.getOutputStream());
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] b = new byte[1024*8];
            int l = 0;
            while ((l=inputStream.read(b))!=-1){
                outputStream.write(b,0,l);
                outputStream.flush();
            }
            outputStream.close();
            inputStream.close();
//            file.delete();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private Result validateCustomer(Customer customer){

        customer = customerDao.findCustomerByIdAndVersion(customer);
        if(customer==null){
            return ResultUtil.error(500,"信息已经改变，请刷新后再试");
        }else{
            return ResultUtil.success(customer);
        }

    }

    @Override
    public Result updateCustomer(Customer customer) {
        Result result = validateCustomer(customer);
        if(result.getCode()!=200){
            return result;
        }
        customer.setVersion(customer.getVersion()+1);
        customer.setUpdateDate(new Date());
        customerDao.updateCustomerById(customer);
        return ResultUtil.success(customer);
    }

    @Override
    public Result customerPages(CustomerSelectVo customerSelectVo) {

        customerSelectVo.initParam();

        List<Customer> customers = customerDao.findCustomerByVo(customerSelectVo);

        return ResultUtil.success(customers);
    }

    @Override
    public Result customerCount(CustomerSelectVo customerSelectVo) {

        Customer customer = new Customer();
        BeanUtils.copyProperties(customerSelectVo,customer);

        Integer i = customerDao.customerCount(customer);

        return ResultUtil.success(i);
    }

    @Override
    public Result saveCustomer(Customer customer) {
        customer.setId(UUID.randomUUID().toString());
        Date date = new Date();
        customer.setCreateDate(date);
        customer.setUpdateDate(date);
        customerDao.saveCustomer(customer);
        return ResultUtil.success(customer);
    }
}
