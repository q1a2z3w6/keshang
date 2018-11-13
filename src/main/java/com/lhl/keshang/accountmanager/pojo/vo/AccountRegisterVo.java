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
 * @since 2018/11/9 17:31
 */
@Data
public class AccountRegisterVo {
    @NotBlank(message = "{account.username.null}")
    private String userName;
    @NotBlank(message = "{account.password.null}")
    private String password;
    @NotBlank(message = "{account.password1.null}")
    private String password1;

}
