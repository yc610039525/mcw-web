package com.cnblog.yc610039525.aop.aspect;

import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

/**
 * 
 * 定义切面类,处理test.aop.Chinese.eat()
 *
 */
public class AccessArgAspect
{
  
  //普通的 增强方法
  public void access(Date time,String food, String retval)
  {
    
    System.out.println("目标方法中 String 参数为: " + food);
    System.out.println("目标方法中 String 参数为: " + time);
    
  }
  
  /**
   * 第一个参数为JoinPoint类型的增强方法,JoinPoint必须为第一个参数
   *在Spring AOP中，一个连接点 总是 代表一个方法的执行。 
   * 通过声明一个org.aspectj.lang.JoinPoint类型的参数可以使通知（Advice）
   * 的主体部分获得连接点信息。 
   * @param jp
   * @param time
   * @param food
   * @param retval
   */
  public void accessWithJoinPoint(JoinPoint jp,Date time,String food)
  {
	  
	  
    System.out.println("参数列表:" + Arrays.toString(jp.getArgs()));
    System.out.println("方法名:"+jp.getSignature().getName());
  }
}
