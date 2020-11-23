package com.supermarket.pojo;

import java.io.Serializable;

/**
 * (TbOrderItem)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbOrderItem implements Serializable {
    private static final long serialVersionUID = -98189831634606168L;
    
    private Long id;
    /**
    * 商品ID
    */
    private Long itemId;
    /**
    * SPU_ID
    */
    private Long goodsId;
    /**
    * 订单ID
    */
    private Long orderId;
    /**
    * 商品标题
    */
    private String title;
    /**
    * 商品单价
    */
    private Double price;
    /**
    * 商品购买数量
    */
    private Integer num;
    /**
    * 商品总金额
    */
    private Double totalFee;
    /**
    * 商品图片地址
    */
    private String picPath;
    
    private String sellerId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

}