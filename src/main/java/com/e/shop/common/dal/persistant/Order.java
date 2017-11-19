package com.e.shop.common.dal.persistant;

import java.util.Date;

/**
 * 订单数据模型
 * Created by zjm on 19/11/2017.
 */
public class Order extends BaseEntity {

    /**
     * 主键id
     */
    private int id;

    /**
     * 用户id
     */
    private int userId;

    /**
     * 订单号
     */
    private long orderNo;

    /**
     * 实际付款金额
     */
    private float payment;

    /**
     * 付款类型
     */
    private byte paymentType;

    /**
     * 邮费
     */
    private byte postage;

    /**
     * 订单状态，0表示已付款，1表示未付款，2表示已取消，3表示已发货，4表示交易成功，5表示交易关闭
     */
    private byte status;

    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date sendTime;

    /**
     * 订单关闭时间
     */
    private Date closeTime;

    /**
     * 订单完成时间
     */
    private Date endTime;

    //get and set methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(long orderNo) {
        this.orderNo = orderNo;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public byte getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(byte paymentType) {
        this.paymentType = paymentType;
    }

    public byte getPostage() {
        return postage;
    }

    public void setPostage(byte postage) {
        this.postage = postage;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
