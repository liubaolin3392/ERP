package com.chinasoft.model.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.dao.TrainFeedbackDAO;
import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.entity.TrainFeedback;
import com.chinasoft.model.service.TrainFeedbackService;
@Service
@Transactional
public class TrainFeedbackServiceImpl implements TrainFeedbackService {

	@Resource
	private TrainFeedbackDAO feedbackDAO;
	
	@Override
	public List<TrainFeedback> findbyemployee(Employee employee) {
		// TODO Auto-generated method stub
		return feedbackDAO.findByProperty("employee.eid", employee.getEid());
	}

}
