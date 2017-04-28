package com.chinasoft.model.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.entity.Employee;



public interface LoginService {
		
		Employee checkLogin(Employee employee);
}
