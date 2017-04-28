package com.chinasoft.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.entity.TrainPlan;

public interface TrainPlanService {
	
	List<TrainPlan> getallplan();
	List<TrainPlan> getparamplan(String trainObject,String trainDirect,String trainContent );
}
