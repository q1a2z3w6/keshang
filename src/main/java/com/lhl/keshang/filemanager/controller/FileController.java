package com.lhl.keshang.filemanager.controller;

import com.lhl.keshang.filemanager.pojo.FileVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/13 17:16
 */
@RestController
public class FileController {

    @PostMapping("uploadHome")
    public String uploadHome(HttpServletRequest req){



        return null;

    }

}
