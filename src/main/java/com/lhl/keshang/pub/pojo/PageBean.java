package com.lhl.keshang.pub.pojo;

import lombok.Data;

import java.net.Inet4Address;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/14 22:21
 */
@Data
public class PageBean {

    private Integer pageCount;
    private Integer dataCount;
    private Integer size;
    private Integer index;
    private Integer end;
    private Integer pageNum;

    public void initParam(){

        if(size==null||size==0){
            size=20;
        }
        if(pageNum==null||pageNum==0){
            pageNum = 1;
        }
//        pageCount = dataCount%size==0?dataCount/size:dataCount/size+1;
        index = 1+(pageNum-1)*size;
        end = index+size-1;

    }

}
