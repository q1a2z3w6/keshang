package com.lhl.keshang.accountmanager.configuration;

import com.lhl.keshang.accountmanager.handler.LoginHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/12 16:56
 */
@Component
public class HandlerRegister implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandler()).addPathPatterns("/**").excludePathPatterns("/login.html").excludePathPatterns("/agreement.html").excludePathPatterns("/register.html");
    }
}
