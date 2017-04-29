package com.chinasoft.model.dao;

import com.chinasoft.model.entity.Salary;

public interface SalaryMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);
}