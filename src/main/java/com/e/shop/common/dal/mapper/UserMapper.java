package com.e.shop.common.dal.mapper;

import com.e.shop.common.dal.persistant.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}