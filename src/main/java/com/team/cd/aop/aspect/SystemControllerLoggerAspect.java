package com.team.cd.aop.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sun.istack.logging.Logger;
@Service
@Aspect
public class SystemControllerLoggerAspect {
	private static final Logger lg = Logger.getLogger(SystemControllerLoggerAspect.class);
	public SystemControllerLoggerAspect(){
		lg.info("SystemControllerLoggerAspect Init .......");
	}
	@Pointcut("@annotation(com.team.cd.annotation.SystemControllerLogger)")    
    public  void controllerAnnotationAspect() {} 
	
	@Before("controllerAnnotationAspect()")    
    public  void annotationBefore(JoinPoint joinPoint) {    
//		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
//		System.out.println("请求方法:" + (joinPoint.getTarget().getClass().getName() + "." 
//		+ joinPoint.getSignature().getName() + "()"));  
		System.out.println("controllerAnnotationAspect .......");
	
	}   
	@Pointcut("execution(* com.team.cd.controller.*.*(..))")    
    public  void controllerMdAspect() {} 
	@Before("controllerMdAspect()")    
    public  void mdBefore(JoinPoint joinPoint) {    
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		System.out.println("controllerMdAspect.......`");
	
	} 
}
