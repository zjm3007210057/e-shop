package com.e.shop.common.dal.mapper;

import com.e.shop.common.dal.persistant.Category;

public interface CategoryMapper {
    int insert(Category record);

    int insertSelective(Category record);
}