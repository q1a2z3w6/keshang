package com.lhl.keshang;

import com.lhl.keshang.customer.mapper.CustomerMapper;
import com.lhl.keshang.customer.mapper.TypeMapper;
import com.lhl.keshang.customer.pojo.Customer;
import com.lhl.keshang.pub.utils.JsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KeshangApplicationTests {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void contextLoads() {

        Customer customer = new Customer();
        for(int i=1;i<=100;i++){
            customer.setId(UUID.randomUUID().toString());
            customer.setCreateDate(new Date());
            customer.setName(""+i);
            customerMapper.addNewCustomer(customer);
        }



    }

}
