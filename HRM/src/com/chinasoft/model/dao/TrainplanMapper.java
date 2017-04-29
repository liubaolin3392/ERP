package com.chinasoft.model.dao;

import com.chinasoft.model.entity.Trainplan;

public interface TrainplanMapper {
    int deleteByPrimaryKey(Integer trainplanid);

    int insert(Trainplan record);

    int insertSelective(Trainplan record);

    Trainplan selectByPrimaryKey(Integer trainplanid);

    int updateByPrimaryKeySelective(Trainplan record);

    int updateByPrimaryKey(Trainplan record);
}