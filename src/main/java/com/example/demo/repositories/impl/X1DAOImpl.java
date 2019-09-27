package com.example.demo.repositories.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Model;
import com.example.demo.repositories.X1DAO;

@Repository
public class X1DAOImpl implements X1DAO {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public Model integrateData1() {
		logger.info("begin integrateData1");
		Model model = new Model();
		model.setModelVar("I am model, I am being called by X1DAOImpl");
		logger.info(model.toString());
		return model;
	}
	
}