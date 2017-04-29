package com.chinasoft.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.model.dao.TrainapplyMapper;

@Service
public class TrainApplyServiceImpl
{

	@Autowired
	private TrainapplyMapper trainapplyMapper;
}
