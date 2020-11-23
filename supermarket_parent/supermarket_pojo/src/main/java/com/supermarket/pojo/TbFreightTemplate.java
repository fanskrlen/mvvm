package com.supermarket.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbFreightTemplate)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbFreightTemplate implements Serializable {
    private static final long serialVersionUID = -59353560558472057L;
    
    private Long id;
    /**
    * 商家id
    */
    private String sellerId;
    /**
    * 是否默认
    */
    private String isDefault;
    /**
    * 模块名称
    */
    private String name;
    /**
    * 发货时间 1:12h 2:24h 3:48h 4:74h
    */
    private String sendTimeType;
    /**
    * 统一价格
    */
    private Double price;
    /**
    * 创建时间
    */
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSendTimeType() {
        return sendTimeType;
    }

    public void setSendTimeType(String sendTimeType) {
        this.sendTimeType = sendTimeType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}