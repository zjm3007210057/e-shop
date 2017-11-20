package com.e.shop.common.dal.persistant;

/**
 * 购物车数据模型
 * Created by zjm on 19/11/2017.
 */
public class Cart extends BaseEntity {

    /**
     * 主键id
     */
    private int id;

    /**
     * 用户id
     */
    private int userId;

    /**
     * 商品id
     */
    private int productId;

    /**
     * 商品数量
     */
    private short quantity;

    /**
     * 商品是否勾选，1=已勾选,0=未勾选，默认为0
     */
    private int checked;

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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public int getChecked() {
        return checked;
    }

    public void setChecked(int checked) {
        this.checked = checked;
    }
}
