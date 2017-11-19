package com.e.shop.common.dal.persistant;

/**
 * 用户数据模型
 * Created by zjm on 19/11/2017.
 */
public class User extends BaseEntity {

    /**
     * 主键id
     */
    private int id;

    /**
     * 用户名，可以为空
     */
    private String name;

    /**
     * 用户密码，可以为空
     */
    private String password;

    /**
     * 手机号，可以用手机号和验证码登录
     */
    private String phone;

    //get and set methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
