package com.lhl.keshang.customer.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class CustomerUpdateVo {


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
    @NotBlank(message = "{customer.field.null}")
    private String name;
    @NotNull(message = "{customer.field.null}")
    private Double money;
    @NotBlank(message = "{customer.field.null}")
    private String legal;
    @NotBlank(message = "{customer.field.null}")
    private String nature;
    @NotBlank(message = "{customer.field.null}")
    private String address;
    @NotBlank(message = "{customer.field.null}")
    private String province;
    @NotBlank(message = "{customer.field.null}")
    private String city;
    @NotBlank(message = "{customer.field.null}")
    private String url;
    @NotBlank(message = "{customer.field.null}")
    private String nstype;
    @NotBlank(message = "{customer.field.null}")
    private String type;
    @NotNull(message = "{customer.field.null}")
    @JsonFormat(pattern = "yyyy-MM-dd",locale = "zh",timezone = "GMT+8")
    private Date zyzdate;
    @NotBlank(message = "{customer.field.null}")
    private String zzh;
    @NotBlank(message = "{customer.field.null}")
    private String diode;
    @NotBlank(message = "{customer.field.null}")
    private String yyzz;
    @NotBlank(message = "{customer.field.null}")
    private String sales;
    @NotBlank(message = "{customer.field.null}")
    private String brand;
    @NotBlank(message = "{customer.field.null}")
    private String range;
    @NotBlank(message = "{customer.field.null}")
    private String general;
    @NotBlank(message = "{customer.field.null}")
    private String branch;
    @NotBlank(message = "{customer.field.null}")
    private String business;
    @NotBlank(message = "{customer.field.null}")
    private String equipment;
    @NotBlank(message = "{customer.field.null}")
    private String apc;
    @NotBlank(message = "{customer.field.null}")
    private String after;
    @NotBlank(message = "{customer.field.null}")
    private String wxie;
    @NotBlank(message = "{customer.field.null}")
    private String ywyj;
    @NotBlank(message = "{customer.field.null}")
    private String linkman;
    @NotBlank(message = "{customer.field.null}")
    private String phone;
    @NotBlank(message = "{customer.field.null}")
    private String tel;
    @NotBlank(message = "{customer.field.null}")
    private String email;
    private Long version;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date createDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date updateDate;


}
