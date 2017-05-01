package com.chinasoft.model.dao;

import java.util.List;
import java.util.Map;

import com.chinasoft.model.entity.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer eid);
    
    Employee selectByEmployee(Employee employee);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
    
    List<Employee> getAllEmployee(Map<String, String> filterMap);
}