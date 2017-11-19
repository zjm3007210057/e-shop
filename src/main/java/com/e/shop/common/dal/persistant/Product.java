package com.e.shop.common.dal.persistant;

/**
 * 商品数据模型
 * Created by zjm on 19/11/2017.
 */
public class Product extends BaseEntity {

    /**
     * 主键id
     */
    private int id;

    /**
     * 分类id
     */
    private int categoryId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品副标题
     */
    private String subTitle;

    /**
     * 商品主图url地址
     */
    private String mainImages;

    /**
     * 商品副图url地址
     */
    private String subImages;

    /**
     * 商品详情
     */
    private String detail;

    /**
     * 商品单价
     */
    private float price;

    /**
     * 商品库存
     */
    private short stock;

    /**
     * 商品状态，1表示在售，2表示下架，3表示无货
     */
    private byte status;

    //get and set methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getMainImages() {
        return mainImages;
    }

    public void setMainImages(String mainImages) {
        this.mainImages = mainImages;
    }

    public String getSubImages() {
        return subImages;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public short getStock() {
        return stock;
    }

    public void setStock(short stock) {
        this.stock = stock;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}
