package com.cnblog.yc610039525.bean.get.appcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetAppContext
{
  public static void main(String[] args)
  {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean.xml");
    BeanGetAppContext bean = ctx.getBean("beangetappcontext",BeanGetAppContext.class);
    System.out.println(ctx);
    //比较获取的ApplicationContext对象是否相同
    System.out.println(ctx == bean.getCtx()); //输出是true
    
  }
  
}
