package com.team.cd.aop.aspect;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.team.cd.common.utils.annotation.SysLogger;

@Service
@Aspect
public class SysLoggerAspect {
	private static final Logger lg = Logger.getLogger(SysLoggerAspect.class);
	public SysLoggerAspect(){
		lg.info("init syslog aspect ......");
	}
	@Pointcut("@annotation(com.team.cd.common.utils.annotation.SysLogger)")    
    public  void aspectPointcut() {} 
	@Before("aspectPointcut()")    
    public void annotationBefore(JoinPoint joinPoint) {
		lg.info("ClassName:"+joinPoint.getTarget().getClass().getName());
		lg.info("MethodName:"+joinPoint.getSignature().getName());
	}   
	@Pointcut("execution(* com.team.cd.controller.*.*(..))")    
    public  void controllerMdAspect() {} 
	@Before("controllerMdAspect()")    
    public  void mdBefore(JoinPoint joinPoint) throws Exception {    
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		String requestURI = request.getRequestURI();
		lg.info(requestURI);
		lg.info(annotationParamValue(joinPoint));
	
	} 
	
	public static String annotationParamValue(JoinPoint joinPoint) throws Exception {  
        String targetName = joinPoint.getTarget().getClass().getName();  
        String methodName = joinPoint.getSignature().getName();  
        Object[] arguments = joinPoint.getArgs();  
        Class<?> targetClass = Class.forName(targetName);  
        Method[] methods = targetClass.getMethods();  
        String description = "";  
        for (Method method : methods) {  
            if (method.getName().equals(methodName)) {  
                @SuppressWarnings("rawtypes")
				Class[] clazzs = method.getParameterTypes();  
                if (clazzs.length == arguments.length) { 
                	SysLogger lg = method.getAnnotation(SysLogger.class);
                	if(lg!=null){
                		description = lg.description();
                	}
                    break;  
                }  
            }  
        }  
        return description;  
    }  
}
