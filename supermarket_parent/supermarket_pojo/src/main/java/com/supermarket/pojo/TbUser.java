package com.supermarket.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(TbUser)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbUser implements Serializable {
    private static final long serialVersionUID = -68781275412969636L;
    
    private Long id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码加密存储
    */
    private String password;
    /**
    * 注册手机号
    */
    private String phone;
    /**
    * 注册邮箱
    */
    private String email;
    /**
    * 创建时间
    */
    private String created;
    
    private Date updated;
    /**
    * 会员来源 pc h5 android ios wechat
    */
    private String sourceType;
    /**
    * 昵称
    */
    private String nickName;
    /**
    * 真实姓名
    */
    private String name;
    /**
    * 使用状态 y正常 n非正常
    */
    private String status;
    /**
    * 头像地址
    */
    private String headPic;
    /**
    * qq号码
    */
    private String qq;
    /**
    * 账户余额
    */
    private Double accountBalance;
    /**
    * 手机是否验证
    */
    private String isMobileCheck;
    /**
    * 邮箱是否验证
    */
    private String isEmailCheck;
    /**
    * 相别 1男 2女
    */
    private String sex;
    /**
    * 会员等级
    */
    private Integer userLevel;
    /**
    * 积分(点数)
    */
    private Integer points;
    /**
    * 经验值
    */
    private Integer experienceValue;
    /**
    * 生日
    */
    private Date birthday;
    /**
    * 最后登录时间
    */
    private Date lastLoginTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getIsMobileCheck() {
        return isMobileCheck;
    }

    public void setIsMobileCheck(String isMobileCheck) {
        this.isMobileCheck = isMobileCheck;
    }

    public String getIsEmailCheck() {
        return isEmailCheck;
    }

    public void setIsEmailCheck(String isEmailCheck) {
        this.isEmailCheck = isEmailCheck;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getExperienceValue() {
        return experienceValue;
    }

    public void setExperienceValue(Integer experienceValue) {
        this.experienceValue = experienceValue;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

}