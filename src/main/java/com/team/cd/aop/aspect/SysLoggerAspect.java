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
		lg.info("初始化控制层日志切面 .......");
	}
	@Pointcut("@annotation(com.team.cd.common.utils.annotation.SysLogger)")    
    public  void controllerAnnotationAspect() {} 
	
	@Before("controllerAnnotationAspect()")    
    public void annotationBefore(JoinPoint joinPoint) {    
//		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
//		System.out.println("请求方法:" + (joinPoint.getTarget().getClass().getName() + "." 
//		+ joinPoint.getSignature().getName() + "()"));  
		System.out.println("连接点获取切点处的方法类属性  JoinPoint .......");
	
	}   
	@Pointcut("execution(* com.team.cd.controller.*.*(..))")    
    public  void controllerMdAspect() {} 
	@Before("controllerMdAspect()")    
    public  void mdBefore(JoinPoint joinPoint) throws Exception {    
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		System.out.println(annotationParamValue(joinPoint)+":"+"controllerMdAspect.......`");
	
	} 
	
	public static String annotationParamValue(JoinPoint joinPoint) throws Exception {  
        String targetName = joinPoint.getTarget().getClass().getName();  
        String methodName = joinPoint.getSignature().getName();  
        Object[] arguments = joinPoint.getArgs();  
        Class targetClass = Class.forName(targetName);  
        Method[] methods = targetClass.getMethods();  
        String description = "";  
        for (Method method : methods) {  
            if (method.getName().equals(methodName)) {  
                Class[] clazzs = method.getParameterTypes();  
                if (clazzs.length == arguments.length) {  
                    description = method.getAnnotation(SysLogger.class).description(); 
                    break;  
                }  
            }  
        }  
        return description;  
    }  
}
