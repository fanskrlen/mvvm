package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbGoods)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbGoods implements Serializable {
    private static final long serialVersionUID = 429469647728879431L;
    
    private Long id;
    /**
    * 商家ID
    */
    private String sellerId;
    /**
    * SPU名
    */
    private String goodsName;
    /**
    * 默认SKU
    */
    private Long defaultItemId;
    /**
    * 状态
    */
    private String auditStatus;
    /**
    * 是否上架
    */
    private String isMarketable;
    /**
    * 品牌
    */
    private Long brandId;
    /**
    * 副标题
    */
    private String caption;
    /**
    * 一级目录
    */
    private Long category1Id;
    /**
    * 二级目录
    */
    private Long category2Id;
    /**
    * 三级目录
    */
    private Long category3Id;
    /**
    * 小图
    */
    private String smallPic;
    /**
    * 市场价
    */
    private Double price;
    /**
    * 类型模板ID
    */
    private Long typeTemplateId;
    /**
    * 是否启用规格
    */
    private String isEnableSpec;
    /**
    * 是否删除
    */
    private String isDelete;


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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getDefaultItemId() {
        return defaultItemId;
    }

    public void setDefaultItemId(Long defaultItemId) {
        this.defaultItemId = defaultItemId;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getIsMarketable() {
        return isMarketable;
    }

    public void setIsMarketable(String isMarketable) {
        this.isMarketable = isMarketable;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Long getCategory1Id() {
        return category1Id;
    }

    public void setCategory1Id(Long category1Id) {
        this.category1Id = category1Id;
    }

    public Long getCategory2Id() {
        return category2Id;
    }

    public void setCategory2Id(Long category2Id) {
        this.category2Id = category2Id;
    }

    public Long getCategory3Id() {
        return category3Id;
    }

    public void setCategory3Id(Long category3Id) {
        this.category3Id = category3Id;
    }

    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getTypeTemplateId() {
        return typeTemplateId;
    }

    public void setTypeTemplateId(Long typeTemplateId) {
        this.typeTemplateId = typeTemplateId;
    }

    public String getIsEnableSpec() {
        return isEnableSpec;
    }

    public void setIsEnableSpec(String isEnableSpec) {
        this.isEnableSpec = isEnableSpec;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

}