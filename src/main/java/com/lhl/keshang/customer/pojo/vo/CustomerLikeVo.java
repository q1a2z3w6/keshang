package com.lhl.keshang.customer.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lhl.keshang.pub.pojo.PageBean;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/12 17:45
 */
@Data
public class CustomerLikeVo extends PageBean {

    private String name;
    private String address;
    private String type;
    private String diode;
    private String business;

}
