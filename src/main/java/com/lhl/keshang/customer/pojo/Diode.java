package com.lhl.keshang.customer.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

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
public class Diode {

    private Integer id;
    private String name;
    @JsonProperty("pId")
//    @JsonIgnore
    private Integer pId;

}
