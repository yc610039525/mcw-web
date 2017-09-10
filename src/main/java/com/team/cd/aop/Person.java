package com.team.cd.aop;

import java.util.Date;

/**
 * 
 * 普通bean的接口
 *
 */
public interface Person
{
  String sayHello(String name);
  void eat(String food, Date time);
  void eat2(String food, Date time,String test);
  void eat3(String food, Date time,String test);
}
