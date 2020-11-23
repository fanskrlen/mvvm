package com.supermarket.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbSeckillGoods)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbSeckillGoods implements Serializable {
    private static final long serialVersionUID = -76503511017576949L;
    
    private Long id;
    /**
    * SPU_ID
    */
    private Long goodsId;
    /**
    * sku_id
    */
    private Long itemId;
    /**
    * 标题
    */
    private String title;
    /**
    * 商品小图
    */
    private String smallPic;
    /**
    * 原价格
    */
    private Double price;
    /**
    * 秒杀价格
    */
    private Double costPrice;
    /**
    * 商家id
    */
    private String sellerId;
    /**
    * 添加日期
    */
    private Date createTime;
    /**
    * 审核日期
    */
    private Date checkTime;
    /**
    * 审核状态
    */
    private String status;
    /**
    * 开始时间
    */
    private Date startTime;
    /**
    * 结束时间
    */
    private Date endTime;
    /**
    * 秒杀商品数
    */
    private Integer num;
    /**
    * 剩余库存数
    */
    private Integer stockCount;
    /**
    * 描述
    */
    private String introduction;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}