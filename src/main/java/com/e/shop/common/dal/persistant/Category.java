package com.e.shop.common.dal.persistant;

/**
 * 商品类别数据模型
 * Created by zjm on 19/11/2017.
 */
public class Category extends BaseEntity {

    /**
     * 主键id
     */
    private int id;

    /**
     * 父类别id，当id为0时表示为根节点，一级类别
     */
    private int parentId;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 类别状态，1表示正常，2表示废弃
     */
    private byte status;

    /**
     * 排序编号，同类展示顺序,数值相等则自然排序
     */
    private byte sortOrder;

    //get and set methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(byte sortOrder) {
        this.sortOrder = sortOrder;
    }
}
