package com.jbk.aop;

import java.text.SimpleDateFormat;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.jbk.ClassWatchApplication;

@Component
@Aspect
public class MyAdvice {
	static Logger logger = LoggerFactory.getLogger(ClassWatchApplication.class);
	
    // Define the pointcut with correct parameter names and types
    @Pointcut("execution(* com.jbk.controller.*.*(..))")
    public void p1() {
        
    }

    // Before advice with matching parameters
    @Before("p1()")
    public void startTime() {
    	String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new java.util.Date());
    	logger.info("ExcutionStartTime:"+time);
    }

   
    
    @AfterReturning("p1()")
    public void endTime() {
    	String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new java.util.Date());
    	logger.info("ExcutionEndTime:"+time);
    }
}
