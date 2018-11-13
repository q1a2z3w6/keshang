package com.lhl.keshang.customer.pojo;

import lombok.Data;

import java.util.List;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/12 17:47
 */
@Data
public class Type {

    private String typeId;
    private String typeName;
    private Integer hierarchy;
    private Integer parentId;
    private List<Type> childrenTypes;
}
