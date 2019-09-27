package com.example.demo.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Model;
import com.example.demo.repositories.X1DAO;
import com.example.demo.services.X1Service;

@Service
public class X1ServiceImpl implements X1Service {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private X1DAO x1DAO;

	@Override
	public Model doBusiness1() {
		logger.info("begin doBusiness1");
		return x1DAO.integrateData1();	
	}
	
}