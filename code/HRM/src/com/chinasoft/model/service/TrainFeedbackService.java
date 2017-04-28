package com.chinasoft.model.service;

import java.util.List;

import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.entity.TrainFeedback;

public interface TrainFeedbackService {

	List< TrainFeedback> findbyemployee(Employee employee);
	
}
