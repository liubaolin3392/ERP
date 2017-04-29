package com.chinasoft.model.dao;

import com.chinasoft.model.entity.Personnelchange;

public interface PersonnelchangeMapper {
    int deleteByPrimaryKey(Integer pcid);

    int insert(Personnelchange record);

    int insertSelective(Personnelchange record);

    Personnelchange selectByPrimaryKey(Integer pcid);

    int updateByPrimaryKeySelective(Personnelchange record);

    int updateByPrimaryKey(Personnelchange record);
}