package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(value = "execution(* com.example.demo.repositories.*.*(..))", 
			returning = "result")
	public void afterDAOsReturning(JoinPoint joinPoint, Object result) {
		//Advice
		logger.info("{} returned with value {}", joinPoint, result);
	}
	
	@After(value = "execution(* com.example.demo.repositories.*.*(..))")
	public void afterDAOs(JoinPoint joinPoint) {
		//Advice
		logger.info("after execution of {}", joinPoint);
	}

	@AfterReturning(value = "execution(* com.example.demo.services.*.*(..))", 
			returning = "result")
	public void afterServicesReturning(JoinPoint joinPoint, Object result) {
		//Advice
		logger.info("{} returned with value {}", joinPoint, result);
	}
	
	@After(value = "execution(* com.example.demo.services.*.*(..))")
	public void afterServices(JoinPoint joinPoint) {
		//Advice
		logger.info("after execution of {}", joinPoint);
	}
}