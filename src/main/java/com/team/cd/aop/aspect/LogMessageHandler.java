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

import com.team.cd.common.utils.annotation.LogMessage;

/**
 *注解方式声明拦截处理 
 */
@Service
@Aspect
public class LogMessageHandler {
	private static final Logger lg = Logger.getLogger(LogMessageHandler.class);
	public LogMessageHandler(){
		lg.info("INIT LogMessageHandler......");
	}
	/**
	 * 切入点
	 */
	@Pointcut("@annotation(com.team.cd.common.utils.annotation.LogMessage)")    
    public void aspectPointcut() {} 
	@Before("aspectPointcut()")    
    public void printJoinPointInfo(JoinPoint joinPoint) {
		lg.info("调用类名:"+joinPoint.getTarget().getClass().getName());
		lg.info("调用方法名:"+joinPoint.getSignature().getName());
	} 
	/**
	 * JoinPoint 连接点--方法
	 */
	@Pointcut("execution(* com.team.cd.controller.*.*(..))")    
    public void pathMatchingPointCut() {} 
	@Before("pathMatchingPointCut()")    
    public  void printInvokeInfo(JoinPoint joinPoint) throws Exception {    
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		String requestURI = request.getRequestURI();
		lg.info("请求URI："+requestURI);
		lg.info("请求描述："+getAnnotionInfo(joinPoint));
	
	} 
	
	@SuppressWarnings("unchecked")
	public static String getAnnotionInfo(JoinPoint joinPoint) throws Exception {  
        String targetName = joinPoint.getTarget().getClass().getName();  
        String methodName = joinPoint.getSignature().getName();  
        Object[] arguments = joinPoint.getArgs();  
        Class<?> targetClass = Class.forName(targetName);  
        Method[] methods = targetClass.getMethods();  
        String description = "";  
        for (Method method : methods) {  
            if (method.getName().equals(methodName)) {  
				Class[] clazzs = method.getParameterTypes();  
                if (clazzs.length == arguments.length) { 
                	LogMessage lg = method.getAnnotation(LogMessage.class);
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
