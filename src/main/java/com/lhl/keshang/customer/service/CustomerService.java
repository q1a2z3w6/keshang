package com.lhl.keshang.customer.service;

import com.lhl.keshang.customer.pojo.Customer;
import com.lhl.keshang.customer.pojo.vo.CustomerSelectVo;
import com.lhl.keshang.pub.pojo.Result;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/14 16:23
 */
public interface CustomerService {
    Result saveCustomer(Customer customer);

    Result customerCount();

    Result customerPages(CustomerSelectVo customerSelectVo);
}
