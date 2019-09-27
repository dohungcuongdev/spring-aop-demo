package com.example.demo.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Model;
import com.example.demo.repositories.X2DAO;
import com.example.demo.services.X2Service;

@Service
public class X2ServiceImpl implements X2Service {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private X2DAO x2DAO;

	@Override
	public Model doBusiness2() {
		logger.info("begin doBusiness2");
		return x2DAO.integrateData2();
	}
	
}