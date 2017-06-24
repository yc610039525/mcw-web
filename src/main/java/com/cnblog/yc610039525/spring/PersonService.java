package com.cnblog.yc610039525.spring;

/**
 * 
 * 一个bean,但是不一定非要是一个标准的Bean
 *
 */
public class PersonService
{
  private String name;

  public void setName(String name)
  {
    this.name = name;
  }

  public void info()
  {
    System.out.println("名字为: " + name);
    
  }
}
