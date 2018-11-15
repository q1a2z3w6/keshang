package com.lhl.keshang.filemanager.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: XXX科技有限公司<p>
 *
 * @author 刘浩磊
 * @since 2018/11/15 17:49
 */

public class CustomerExcelVo {

    public String id;
    public String name;
    public Double money;
    public String legal;
    public String nature;
    public String address;
    public String province;
    public String city;
    public String url;
    public String nstype;
    public String type;
    public Date   zyzdate;
    public String zzh;
    public String diode;
    public String yyzz;
    public String sales;
    public String brand;
    public String range;
    public String general;
    public String branch;
    public String business;
    public String equipment;
    public String apc;
    public String after;
    public String wxie;
    public String ywyj;
    public String linkman;
    public String phone;
    public String tel;
    public String email;
    public Long   version;
    public Date   createDate;
    public Date   updateDate;

    private String ID_ = "主键";
    private String NAME_ = "供方名称";
    private String MONEY_ = "注册资金";
    private String LEGAL_ = "法人";
    private String NATURE_ = "企业性质";
    private String ADDRESS_ = "办公地址";
    private String PROVINCE_ = "区域-省份";
    private String CITY_ = "区域-城市";
    private String URL_ = "官方网站";
    private String NSTYPE_ = "纳税人类型";
    private String TYPE_ = "供方分类";
    private String ZYZDATE_ = "营业执照起始日期";
    private String ZZH_ = "营业执照号";
    private String DIODE_ = "主营资质";
    private String YYZZ_ = "兼营业务资质";
    private String SALES_ = "体系认证";
    private String BRAND_ = "产品许可证";
    private String RANGE_ = "主营业务范围";
    private String GENERAL_ = "总部";
    private String BRANCH_ = "分支机构";
    private String BUSINESS_ = "主营业务区域";
    private String EQUIPMENT_ = "加工生产设备";
    private String APC_ = "年产能力";
    private String AFTER_ = "售后服务能力";
    private String WXIE_ = "外协厂家";
    private String YWYJ_ = "以往业绩";
    private String LINKMAN_ = "联系人";
    private String PHONE_ = "联系固话";
    private String TEL_ = "手机";
    private String EMAIL_ = "邮箱";
    private String VERSION_ = "版本";
    private String CREATEDATE_ = "创建时间";
    private String UPDATEDATE_ = "修改时间";

    public String getID_() {
        return ID_;
    }

    public String getNAME_() {
        return NAME_;
    }

    public String getMONEY_() {
        return MONEY_;
    }

    public String getLEGAL_() {
        return LEGAL_;
    }

    public String getNATURE_() {
        return NATURE_;
    }

    public String getADDRESS_() {
        return ADDRESS_;
    }

    public String getPROVINCE_() {
        return PROVINCE_;
    }

    public String getCITY_() {
        return CITY_;
    }

    public String getURL_() {
        return URL_;
    }

    public String getNSTYPE_() {
        return NSTYPE_;
    }

    public String getTYPE_() {
        return TYPE_;
    }

    public String getZYZDATE_() {
        return ZYZDATE_;
    }

    public String getZZH_() {
        return ZZH_;
    }

    public String getDIODE_() {
        return DIODE_;
    }

    public String getYYZZ_() {
        return YYZZ_;
    }

    public String getSALES_() {
        return SALES_;
    }

    public String getBRAND_() {
        return BRAND_;
    }

    public String getRANGE_() {
        return RANGE_;
    }

    public String getGENERAL_() {
        return GENERAL_;
    }

    public String getBRANCH_() {
        return BRANCH_;
    }

    public String getBUSINESS_() {
        return BUSINESS_;
    }

    public String getEQUIPMENT_() {
        return EQUIPMENT_;
    }

    public String getAPC_() {
        return APC_;
    }

    public String getAFTER_() {
        return AFTER_;
    }

    public String getWXIE_() {
        return WXIE_;
    }

    public String getYWYJ_() {
        return YWYJ_;
    }

    public String getLINKMAN_() {
        return LINKMAN_;
    }

    public String getPHONE_() {
        return PHONE_;
    }

    public String getTEL_() {
        return TEL_;
    }

    public String getEMAIL_() {
        return EMAIL_;
    }

    public String getVERSION_() {
        return VERSION_;
    }

    public String getCREATEDATE_() {
        return CREATEDATE_;
    }

    public String getUPDATEDATE_() {
        return UPDATEDATE_;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNstype() {
        return nstype;
    }

    public void setNstype(String nstype) {
        this.nstype = nstype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getZyzdate() {
        return zyzdate;
    }

    public void setZyzdate(Date zyzdate) {
        this.zyzdate = zyzdate;
    }

    public String getZzh() {
        return zzh;
    }

    public void setZzh(String zzh) {
        this.zzh = zzh;
    }

    public String getDiode() {
        return diode;
    }

    public void setDiode(String diode) {
        this.diode = diode;
    }

    public String getYyzz() {
        return yyzz;
    }

    public void setYyzz(String yyzz) {
        this.yyzz = yyzz;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getApc() {
        return apc;
    }

    public void setApc(String apc) {
        this.apc = apc;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getWxie() {
        return wxie;
    }

    public void setWxie(String wxie) {
        this.wxie = wxie;
    }

    public String getYwyj() {
        return ywyj;
    }

    public void setYwyj(String ywyj) {
        this.ywyj = ywyj;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
