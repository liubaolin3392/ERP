package com.chinasoft.model.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.model.entity.TrainEvaluation;
import com.chinasoft.model.entity.mapper.TrainEvaluationDAO;
import com.chinasoft.model.service.TrainEvaluationService;

@Service
public class TrainEvaluationServiceImpl implements TrainEvaluationService {

	@Resource
	private TrainEvaluationDAO trainEvaluationDAO;
	
	
	@Override
	public List<TrainEvaluation> getEvaluationsbydirect(String trainDirect) {
		// TODO Auto-generated method stub
		return trainEvaluationDAO.findByProperty("trainDirect", trainDirect);
	}


	@Override
	public boolean addEvaluation(TrainEvaluation evaluation) {
		// TODO Auto-generated method stub
		return trainEvaluationDAO.save(evaluation);
	}

}
