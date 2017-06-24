package com.cnblog.yc610039525.aop;

import java.util.Date;

/**
 * 
 *一个普通bean,eat方法和sayHello方法,是需要被切入,动态影响的
 *
 */
public class Chinese implements Person
{

  @Override
  public void eat(String afood, Date atime)
  {
    System.out.println("正在吃: " + afood + ", 时间是: " + atime);
  }

  @Override
  public String sayHello(String name)
  {
    return name + " Hello, Spring AOP.";
  }
  
  public void eat2(String afood, Date atime,String test)
  {
    System.out.println("eat2 --------- 正在吃: " + afood + ", 时间是: " + atime + ", eat2里面的test= " + test);
  }

  public void eat3(String afood, Date atime,String test)
  {
	    System.out.println("eat3 --------- 正在吃: " + afood + ", 时间是: " + atime + ", eat2里面的test= " + test);
	  }
}
