package com.cnblog.yc610039525.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 测试类,无需启动tomcat
 * ApplicationContext就是传说中的Spring核心,一个巨大工厂.
 */
public class SpringTest
{
  public static void main(String[] args)
  {
    //创建Spring的ApplicationContext
    ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
    System.out.println(ctx);
    
    PersonService ps = ctx.getBean("personService",PersonService.class);
    ps.info(); //输出: 名字为: wawa
    /**
     * 这个看起来相当神奇,因为PersonService是Spring容器ctx创建的.
     * 并且,还设置了PersonService的name为wawa,而这些都是在S[pring的配置文件bean.xml中配置的.
     * 这种由spring容器为对象设置属性的方式被称为控制反转(Inversion of Control, IoC)
     */
  }
}
