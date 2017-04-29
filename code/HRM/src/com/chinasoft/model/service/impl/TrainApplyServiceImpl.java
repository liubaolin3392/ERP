package com.chinasoft.model.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.model.entity.TrainApply;
import com.chinasoft.model.entity.mapper.TrainApplyDAO;
import com.chinasoft.model.service.TrainApplyService;
@Service
public class TrainApplyServiceImpl implements TrainApplyService {

	@Resource
	private TrainApplyDAO trainApplyDAO;
	@Override
	public boolean addApply(TrainApply trainApply) {
		// TODO Auto-generated method stub
		return trainApplyDAO.save(trainApply);
	}

}
