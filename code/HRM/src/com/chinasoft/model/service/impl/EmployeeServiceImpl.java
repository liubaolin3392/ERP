package com.chinasoft.model.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.dao.EmployeeDAO;
import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

		@Resource
		private EmployeeDAO employeeDAO;
		
	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.save(employee);
	}
	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.attachDirty(employee);
	}
	@Override
	public Employee getSingleEmployee(String eId) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(eId);
	}
	
	
//    获取所有的用户信息
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}
	@Override
	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.delete(employee);
	}
	@Override
	public List<Employee> serchEmployees(String userName, String department,
			String position, Integer age, String sex) {
		// TODO Auto-generated method stub
		return employeeDAO.searchEmployees(userName, department, position, age, sex);
	}

}
