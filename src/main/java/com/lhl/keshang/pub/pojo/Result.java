package com.lhl.keshang.pub.pojo;

import lombok.Data;

import java.util.List;

/**
 * Result实体，所有返回的信息都应该是他的实例，code是结果代码，msg具体信息，data是返回消息中携带的数据（如果有的话）
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
