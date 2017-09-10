package com.team.cd.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class NotVeryUsefulAspect {
	@Pointcut("execution(public * *(..))")
	private void anyOldTransfer() {
		System.out.println("@Aspect+@Pointcut");
	}
	
	@Before("execution(* com.cnblog.yc610039525.aop..*.*eat3(..))")  
    public void before(){  
        System.out.println("方法执行前执行.....");  
    }  

	
}
