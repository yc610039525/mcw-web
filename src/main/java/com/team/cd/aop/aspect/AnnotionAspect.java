package com.team.cd.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Service
@Aspect
public class AnnotionAspect {
//	@Pointcut("execution(* com.team.cd.aop..*(..))")
	private void pointCutLog() {
	}
	
	@Before("execution(* com.team.cd.aop..*(..))")  
//	@Before("pointCutLog()")  
    public void before(){  
        System.out.println("使用全注解配置AOP-@Service-@Aspect-@Pointcut-@Before");  
    }  

	
}
