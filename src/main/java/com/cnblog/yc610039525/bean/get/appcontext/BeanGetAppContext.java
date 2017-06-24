package com.cnblog.yc610039525.bean.get.appcontext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 
 * bean中获取ApplicationContext引用
 * 实现接口ApplicationContextAware的
 * setApplicationContext(ApplicationContext ctx) throws BeansException方法
 */
public class BeanGetAppContext implements ApplicationContextAware
{
  private ApplicationContext ctx = null;
  
  @Override
  public void setApplicationContext(ApplicationContext ctx) throws BeansException
  {
    this.ctx = ctx;
  }

  public ApplicationContext getCtx()
  {
    return ctx;
  }

}
