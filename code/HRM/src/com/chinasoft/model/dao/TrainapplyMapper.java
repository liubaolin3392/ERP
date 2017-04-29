package com.chinasoft.model.dao;

import com.chinasoft.model.entity.Trainapply;

public interface TrainapplyMapper {
    int deleteByPrimaryKey(Integer trainapplyid);

    int insert(Trainapply record);

    int insertSelective(Trainapply record);

    Trainapply selectByPrimaryKey(Integer trainapplyid);

    int updateByPrimaryKeySelective(Trainapply record);

    int updateByPrimaryKey(Trainapply record);
}