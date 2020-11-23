package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbTypeTemplate)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbTypeTemplate implements Serializable {
    private static final long serialVersionUID = 471293104600427668L;
    
    private Long id;
    /**
    * 模板名称
    */
    private String name;
    /**
    * 关联规格
    */
    private String specIds;
    /**
    * 关联品牌
    */
    private String brandIds;
    /**
    * 自定义属性
    */
    private String customAttributeItems;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecIds() {
        return specIds;
    }

    public void setSpecIds(String specIds) {
        this.specIds = specIds;
    }

    public String getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(String brandIds) {
        this.brandIds = brandIds;
    }

    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    public void setCustomAttributeItems(String customAttributeItems) {
        this.customAttributeItems = customAttributeItems;
    }

}