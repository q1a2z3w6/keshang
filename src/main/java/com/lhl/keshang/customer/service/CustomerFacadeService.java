package com.lhl.keshang.customer.service;

import com.lhl.keshang.pub.pojo.Result;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/12/4 17:58
 */
public interface CustomerFacadeService {

    Result cityList(String pid);
    Result currencyList();
    Result provinceList();
    Result natureList();

    Result diodeList();

    Result typeList();

    Result salesList();
}
