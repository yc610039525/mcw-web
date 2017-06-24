package com.cnblog.yc610039525.springevent;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmainNotifier implements ApplicationListener
{
  Logger logger=Logger.getLogger("EmainNotifier@ApplicationEvent");
  @Override
  public void onApplicationEvent(ApplicationEvent evt)
  {
    if (evt instanceof EmailEvent)
    {
      EmailEvent emailEvent = (EmailEvent) evt;
      logger.info("邮件地址: " + emailEvent.getAddress());
      logger.info("邮件正文: " + emailEvent.getText());
    }
    else
    // 容器内置事件
    {
    	logger.info(evt);
    }
  }
}
