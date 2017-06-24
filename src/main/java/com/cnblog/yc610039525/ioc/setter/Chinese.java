package com.cnblog.yc610039525.ioc.setter;

public class Chinese implements Person
{
  private Axe axe;
  
  public void setAxe(Axe axe)
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
