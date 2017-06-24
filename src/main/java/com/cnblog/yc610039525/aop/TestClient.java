package com.cnblog.yc610039525.aop;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * AOP客户端测试类
 *
 */
public class TestClient
{
  public static void main(String[] args)
  {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
    System.out.println(ctx);
    
    Person person = ctx.getBean("chinese_aop",Person.class);
    
//    person.sayHello("jack");
//    person.eat("米饭",new Date());
    person.eat2("米饭",new Date(),"test");
//    person.eat3("米饭",new Date(),"test");
  }
}
