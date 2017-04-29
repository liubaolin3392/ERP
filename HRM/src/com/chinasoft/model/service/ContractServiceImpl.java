package com.chinasoft.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.model.dao.ContractMapper;

@Service
@Transactional
public class ContractServiceImpl
{

	@Autowired
	private ContractMapper contractMapper;

}
