package com.e.shop.common.dal.mapper;

import com.e.shop.common.dal.persistant.PayInfo;

public interface PayInfoMapper {
    int insert(PayInfo record);

    int insertSelective(PayInfo record);
}