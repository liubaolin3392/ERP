package com.chinasoft.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.entity.mapper.EmployeeMapper;
import com.chinasoft.model.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public boolean addEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
		return employeeMapper.save(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
		return employeeMapper.attachDirty(employee);
	}

	@Override
	public Employee getSingleEmployee(String eId)
	{
		// TODO Auto-generated method stub
		return employeeMapper.findById(eId);
	}

	// 获取所有的用户信息
	@Override
	public List<Employee> getAllEmployee()
	{
		// TODO Auto-generated method stub
		return employeeMapper.findAll();
	}

	@Override
	public boolean deleteEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
		return employeeMapper.delete(employee);
	}

	@Override
	public List<Employee> serchEmployees(String userName, String department, String position, Integer age, String sex)
	{
		// TODO Auto-generated method stub
		return employeeMapper.searchEmployees(userName, department, position, age, sex);
	}

}
