package com.lhl.keshang.accountmanager.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/12 16:50
 */
public class LoginHandler implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getRequestURL().toString());
        if(request.getRequestURL().toString().endsWith(".html")){
            if (request.getSession().getAttribute("account")==null){

                response.sendRedirect("/login.html");

                return false;
            }else{
                return true;
            }
        }else{
            return true;
        }

    }

}
