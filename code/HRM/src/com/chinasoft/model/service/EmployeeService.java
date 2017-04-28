package com.chinasoft.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.entity.Employee;

public interface EmployeeService {
	
		boolean addEmployee(Employee employee);
		boolean updateEmployee(Employee employee);
		Employee getSingleEmployee(String eId);
		List<Employee> getAllEmployee();
		boolean deleteEmployee(Employee employee);
		List<Employee> serchEmployees(String userName, String department, String position, Integer age, String  sex );
}
