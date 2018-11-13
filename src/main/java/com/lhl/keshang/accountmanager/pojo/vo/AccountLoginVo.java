package com.lhl.keshang.accountmanager.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/9 15:24
 */
@Data
public class AccountLoginVo {
    @NotBlank(message = "{accountmanager.username.null}")
    private String userName;
    @NotBlank(message = "{accountmanager.password.null}")
    private String password;

}
