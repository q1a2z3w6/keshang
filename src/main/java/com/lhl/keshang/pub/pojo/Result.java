package com.lhl.keshang.pub.pojo;

import lombok.Data;

import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/9 15:28
 */
@Data
public class Result {

    private Integer code;
    private String msg;
    private List data;

}
