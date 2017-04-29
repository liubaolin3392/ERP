package com.chinasoft.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.dao.TrainplanMapper;

@Service
@Transactional
public class TrainPlanServiceImpl
{
	@Autowired
	private TrainplanMapper trainPlanMapper;

}
