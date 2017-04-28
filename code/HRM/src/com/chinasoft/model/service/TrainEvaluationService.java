package com.chinasoft.model.service;

import java.util.List;

import com.chinasoft.model.entity.TrainEvaluation;

public interface TrainEvaluationService {

	List<TrainEvaluation>  getEvaluationsbydirect(String trainDirect);
	boolean addEvaluation(TrainEvaluation evaluation);
}
