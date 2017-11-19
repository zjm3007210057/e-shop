package com.e.shop.common.dal.persistant;

/**
 * 订单详情数据模型
 * Created by zjm on 19/11/2017.
 */
public class OrderInfo extends BaseEntity {

    /**
     * 主键id
     */
    private int id;

    /**
     * 订单号
     */
    private long orderNo;

    /**
     * 用户id
     */
    private int userId;

    /**
     * 商品id
     */
    private int productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品图片地址url
     */
    private String productImage;

    /**
     * 生成订单时候的价格，单位为元，保留两位小数
     */
    private String currentPrice;

    /**
     * 商品数量
     */
    private short quantity;

    /**
     * 订单总价，单位为元，保留两位小数
     */
    private float totalPrice;

    //get and set methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(long orderNo) {
        this.orderNo = orderNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
