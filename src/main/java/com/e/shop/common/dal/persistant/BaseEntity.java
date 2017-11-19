package com.e.shop.common.dal.persistant;

import java.util.Date;

/**
 * 数据模型基类
 * Created by zjm on 19/11/2017.
 */
public class BaseEntity {

    /**
     * 创建时间
     */
    private Date create_time;


    /**
     * 更新时间
     */
    private Date update_time;

    //get and set methods

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
