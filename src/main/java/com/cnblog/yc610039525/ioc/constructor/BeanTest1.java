package com.cnblog.yc610039525.ioc.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnblog.yc610039525.ioc.setter.Person;


public class BeanTest1
{
  public static void main(String[] args)
  {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
    
    //获取chinese实例,并没有设置axe属性,而是由Sping容器设置
    Person p = ctx.getBean("chinese1",Person.class);
    //调用接口方法
    p.userAxe(); 
  }
}
