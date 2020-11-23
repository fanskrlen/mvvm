package com.supermarket.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbOrder)实体类
 *
 * @author makejava
 * @since 2020-09-26 20:23:19
 */
public class TbOrder implements Serializable {
    private static final long serialVersionUID = 528209393354034513L;
    /**
    * 订单id
    */
    private Long orderId;
    /**
    * 实付金额，精确到2位小数
    */
    private Double payment;
    /**
    * 支付类型，1在线支付，2货到付款
    */
    private String paymentType;
    /**
    * 邮费
    */
    private String postFee;
    /**
    * 状态：1未付款，2已付款，3未发货，4交易成功，5交易关闭，6待评价
    */
    private String status;
    /**
    * 订单创建时间
    */
    private Date createTime;
    /**
    * 订单更新时间
    */
    private Date updateTime;
    /**
    * 付款时间
    */
    private Date paymentTime;
    /**
    * 发货时间
    */
    private Date consignTime;
    /**
    * 交易完成时间
    */
    private Date endTime;
    /**
    * 交易关闭时间
    */
    private Date closeTime;
    /**
    * 物流名称
    */
    private String shippingName;
    /**
    * 物流单号
    */
    private String shippingMessage;
    /**
    * 用户id
    */
    private String userId;
    /**
    * 买家留言
    */
    private String buyerMessage;
    /**
    * 买家昵称
    */
    private String buyerNick;
    /**
    * 买家是否已经评价
    */
    private String buyerRate;
    /**
    * 接收者地区名称
    */
    private String receiverAreaName;
    /**
    * 收货人手机
    */
    private String receiverMobile;
    /**
    * 收货人邮编
    */
    private String receiverZipCode;
    /**
    * 过期时间，定期清理
    */
    private Date expire;
    /**
    * 发票类型 1普通发票，
	2电子发票，3增值税发票
    */
    private String invoiceType;
    /**
    * 订单来源 1app端 2pc端 3m端 4微信端 5qq端
    */
    private String sourceType;
    /**
    * 商家id
    */
    private String sellerId;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingMessage() {
        return shippingMessage;
    }

    public void setShippingMessage(String shippingMessage) {
        this.shippingMessage = shippingMessage;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(String buyerRate) {
        this.buyerRate = buyerRate;
    }

    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    public void setReceiverAreaName(String receiverAreaName) {
        this.receiverAreaName = receiverAreaName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverZipCode() {
        return receiverZipCode;
    }

    public void setReceiverZipCode(String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

}