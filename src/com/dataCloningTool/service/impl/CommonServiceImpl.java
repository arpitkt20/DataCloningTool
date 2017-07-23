package com.dataCloningTool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataCloningTool.dao.CommonDao;
import com.dataCloningTool.service.CommonService;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	CommonDao commonDao;
	
	@Override
	public int validateCustomerId(int custId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String getCurrentSequence() {
		Integer currentSequence = commonDao.getCurrentSequence(22);
		return String.valueOf(currentSequence);
	}

}
