package com.chinasoft.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.dao.EmployeeMapper;
import com.chinasoft.model.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl
{
	@Autowired
	private EmployeeMapper employeeMapper;

	public int addEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
		return employeeMapper.insert(employee);
	}
}
