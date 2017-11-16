package com.e.shop.common.dal.mapper;

import com.e.shop.common.dal.persistant.Shipping;

public interface ShippingMapper {
    int insert(Shipping record);

    int insertSelective(Shipping record);
}