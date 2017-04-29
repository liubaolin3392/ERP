package com.chinasoft.model.dao;

import com.chinasoft.model.entity.Attendance;

public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    Attendance selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);
}