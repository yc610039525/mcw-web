package com.cnblog.yc610039525.springevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author Admin
 *
 */
public class TestSpringEvent
{
  public static void main(String[] args)
  {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
    //创建一个事件对象
    EmailEvent emailEvent = new EmailEvent("Hello","cyang198906@163.com","this is a test emain.");
    //主动发送ApplicationContext事件
    ctx.publishEvent(emailEvent);
  }
}
