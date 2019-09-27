package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/*
	@Around("execution(* com.example.demo.repositories.*.*(..))")
	public void aroundDAOs(JoinPoint joinPoint){
		// Advice go here
		logger.info("around execution of {}", joinPoint);
	}
	
	@Around("execution(* com.example.demo.services.*.*(..))")
	public void aroundServices(JoinPoint joinPoint){
		// Advice go here
		logger.info("around execution of {}", joinPoint);
	}
	*/
}
