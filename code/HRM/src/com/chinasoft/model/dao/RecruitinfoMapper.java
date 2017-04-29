package com.chinasoft.model.dao;

import com.chinasoft.model.entity.Recruitinfo;

public interface RecruitinfoMapper {
    int deleteByPrimaryKey(Integer recruitid);

    int insert(Recruitinfo record);

    int insertSelective(Recruitinfo record);

    Recruitinfo selectByPrimaryKey(Integer recruitid);

    int updateByPrimaryKeySelective(Recruitinfo record);

    int updateByPrimaryKey(Recruitinfo record);
}