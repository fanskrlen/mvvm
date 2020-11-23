package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbGoodsDesc)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbGoodsDesc implements Serializable {
    private static final long serialVersionUID = 410078809161974105L;
    /**
    * SPU_ID
    */
    private Long goodsId;
    /**
    * 描述
    */
    private String introduction;
    /**
    * 说明书，规格
    */
    private String specificationItems;
    /**
    * 制定某属性
    */
    private String customAttributeItems;
    
    private String itemImage;
    /**
    * 包装列表
    */
    private String packageList;
    /**
    * 售后服务
    */
    private String saleService;


    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getSpecificationItems() {
        return specificationItems;
    }

    public void setSpecificationItems(String specificationItems) {
        this.specificationItems = specificationItems;
    }

    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    public void setCustomAttributeItems(String customAttributeItems) {
        this.customAttributeItems = customAttributeItems;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getPackageList() {
        return packageList;
    }

    public void setPackageList(String packageList) {
        this.packageList = packageList;
    }

    public String getSaleService() {
        return saleService;
    }

    public void setSaleService(String saleService) {
        this.saleService = saleService;
    }

}