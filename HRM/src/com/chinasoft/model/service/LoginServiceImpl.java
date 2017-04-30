package com.chinasoft.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.dao.EmployeeMapper;
import com.chinasoft.model.entity.Employee;

@Service
@Transactional
public class LoginServiceImpl
{

	@Autowired
	private EmployeeMapper employeeMapper;
	
	public Employee checkLoginData(Employee employee)
	{
		Employee resultEmployee = employeeMapper.selectByEmployee(employee);
		return resultEmployee;
	}
}
