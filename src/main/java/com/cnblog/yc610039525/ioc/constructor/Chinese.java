package com.cnblog.yc610039525.ioc.constructor;

import com.cnblog.yc610039525.ioc.setter.Axe;
import com.cnblog.yc610039525.ioc.setter.Person;

/**
 * 
 * 没有提供setAxe方法,而是提供了一个传入Axe实例的构造器.
 * 另外,默认构造器不能少
 *
 */
public class Chinese implements Person
{
  private Axe axe;
  
  public Chinese()
  {
    
  }
  
  public Chinese(Axe axe)
  {
    this.axe = axe;
  }
  
  //实现Person的接口方法
  @Override
  public void userAxe()
  {
    //调用axe的chop()方法
    //表名Person依赖于axe对象
    System.out.println(axe.chop());
    
  }

}
