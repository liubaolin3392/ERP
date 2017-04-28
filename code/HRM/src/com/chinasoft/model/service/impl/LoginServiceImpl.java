package com.chinasoft.model.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.dao.EmployeeDAO;
import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Resource
	private EmployeeDAO employeeDAO;
	


	@Override
	public Employee checkLogin(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.checkLogin(employee);
	}

}
