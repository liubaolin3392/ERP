package com.chinasoft.model.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.dao.TrainPlanDAO;
import com.chinasoft.model.entity.TrainPlan;
import com.chinasoft.model.service.TrainPlanService;

@Service
@Transactional
public class TrainPlanServiceImpl implements TrainPlanService {
		
	@Resource
		private TrainPlanDAO trainPlanDAO;
		

		
	@Override
	public List<TrainPlan> getallplan() {
		// TODO Auto-generated method stub
		return trainPlanDAO.findAll();
	}



	@Override
	public List<TrainPlan> getparamplan(String trainObject, String trainDirect,
			String trainContent) {
		// TODO Auto-generated method stub
		return trainPlanDAO.findbyparam(trainObject, trainDirect, trainContent);
	}



}
