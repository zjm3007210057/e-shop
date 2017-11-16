package com.e.shop.common.dal.mapper;

import com.e.shop.common.dal.persistant.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);
}