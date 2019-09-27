package com.example.demo.repositories.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Model;
import com.example.demo.repositories.X2DAO;

@Repository
public class X2DAOImpl implements X2DAO {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public Model integrateData2() {
		logger.info("begin integrateData2");
		Model model = new Model();
		model.setModelVar("I am model, I am being called by X2DAOImpl");
		logger.info(model.toString());
		return model;
	}
	
}