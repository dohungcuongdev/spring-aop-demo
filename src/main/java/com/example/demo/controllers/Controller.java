package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.X1Service;
import com.example.demo.services.X2Service;

@RestController
@RequestMapping("/api")
public class Controller {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private X1Service x1Service;
	

	@Autowired
	private X2Service x2Service;
	
    @GetMapping("/business1")
    public ResponseEntity<?> testBusiness1() {
    	logger.info("begin testBusiness1");
    	return ResponseEntity.status(HttpStatus.OK).body(x1Service.doBusiness1());
    }
    
    @GetMapping("/business2")
    public ResponseEntity<?> testBusiness2() {
    	logger.info("begin testBusiness2");
    	return ResponseEntity.status(HttpStatus.OK).body(x2Service.doBusiness2());
    }

}
