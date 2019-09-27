package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAopAspect {
    
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.example.demo.repositories.*.*(..))")
	public void beforeDAOs(JoinPoint joinPoint){
		// Advice go here
		logger.info("before execution of {}", joinPoint);
	}
	
	@Before("execution(* com.example.demo.services.*.*(..))")
	public void beforeServices(JoinPoint joinPoint){
		// Advice go here
		logger.info("before execution of {}", joinPoint);
	}

}