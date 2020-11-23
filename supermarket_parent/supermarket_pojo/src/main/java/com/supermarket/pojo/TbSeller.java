package com.supermarket.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbSeller)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbSeller implements Serializable {
    private static final long serialVersionUID = 866329641243570358L;
    /**
    * 用户ID
    */
    private String sellerId;
    /**
    * 公司名
    */
    private String name;
    /**
    * 店铺名称
    */
    private String nickName;
    /**
    * 密码
    */
    private String password;
    /**
    * email
    */
    private String email;
    /**
    * 公司手机
    */
    private String mobile;
    /**
    * 公司座机
    */
    private String telephone;
    /**
    * 状态
    */
    private String status;
    /**
    * 详细地址
    */
    private String addressDetail;
    /**
    * 公司logo图
    */
    private String logoPic;
    /**
    * 简介
    */
    private String brief;
    /**
    * 创建日期
    */
    private Date createTime;
    /**
    * 法定代表人
    */
    private String legalPerson;
    /**
    * 法定代表人身份证
    */
    private String legalPersonCardId;
    /**
    * 开户行账号
    */
    private String bankUser;
    /**
    * 银行名
    */
    private String bankName;


    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getLogoPic() {
        return logoPic;
    }

    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPersonCardId() {
        return legalPersonCardId;
    }

    public void setLegalPersonCardId(String legalPersonCardId) {
        this.legalPersonCardId = legalPersonCardId;
    }

    public String getBankUser() {
        return bankUser;
    }

    public void setBankUser(String bankUser) {
        this.bankUser = bankUser;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}