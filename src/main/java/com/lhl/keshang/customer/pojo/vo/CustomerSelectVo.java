package com.lhl.keshang.customer.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lhl.keshang.pub.pojo.PageBean;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/12 17:45
 */
@Data
public class CustomerSelectVo extends PageBean {


    /**
     * name : 1212
     * money : 3123
     * legal : 123
     * nature : 1
     * address : 123
     * province : 0
     * city : 1
     * url : 2312
     * nstype : 3123
     * type : 总承包
     * zyzdate : 2018-11-14
     * zzh : 123
     * diode : 施工承包>建筑工程施工总承包>特级
     * yyzz : 123
     * sales : 14000
     * brand : 213
     * range : 123
     * general : 123
     * branch : 123
     * business : 123
     * equipment : 123
     * apc : 123
     * after : 123
     * wxie : 123
     * ywyj : 123
     * linkman : 123
     * phone : 12312
     * tel : 213
     * email : 123
     */

    private String id;
    private String name;
    private Double money;
    private String legal;
    private String nature;
    private String address;
    private String province;
    private String city;
    private String url;
    private String nstype;
    private String type;
    @JsonFormat(pattern = "yyyy-MM-dd",locale = "zh",timezone = "GMT+8")
    private Date zyzdate;
    private String zzh;
    private String diode;
    private String yyzz;
    private String sales;
    private String brand;
    private String range;
    private String general;
    private String branch;
    private String business;
    private String equipment;
    private String apc;
    private String after;
    private String wxie;
    private String ywyj;
    private String linkman;
    private String phone;
    private String tel;
    private String email;
    private Long version;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date createDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date updateDate;


}
