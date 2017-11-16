package com.e.shop.common.dal.mapper;

import com.e.shop.common.dal.persistant.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}