package com.e.shop.common.dal.persistant;

/**
 * 支付数据模型
 * Created by zjm on 19/11/2017.
 */
public class Pay extends BaseEntity {

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
     * 支付流水号
     */
    private long payNo;

    /**
     * 支付状态，0表示成功，1表示失败，2表示正在支付，3表示未支付
     */
    private int status;

    /**
     * 支付平台，0表示支付宝；1表示微信
     */
    private int payPlatform;

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

    public long getPayNo() {
        return payNo;
    }

    public void setPayNo(long payNo) {
        this.payNo = payNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(int payPlatform) {
        this.payPlatform = payPlatform;
    }
}
