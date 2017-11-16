package com.e.shop.common.dal.mapper;

import com.e.shop.common.dal.persistant.OrderItem;

public interface OrderItemMapper {
    int insert(OrderItem record);

    int insertSelective(OrderItem record);
}