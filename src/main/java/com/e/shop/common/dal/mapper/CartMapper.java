package com.e.shop.common.dal.mapper;

import com.e.shop.common.dal.persistant.Cart;

public interface CartMapper {
    int insert(Cart record);

    int insertSelective(Cart record);
}