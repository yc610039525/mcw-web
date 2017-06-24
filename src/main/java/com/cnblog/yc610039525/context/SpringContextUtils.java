package com.cnblog.yc610039525.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/**
 * Bean对IOC容器的感知  BeanNameAware BeanFactoryAware ApplicationContextAware
 * MessageSourceAware ApplicationEventPublisherAware ResourceLoaderAware
 * @author Admin
 */

public class SpringContextUtils implements ApplicationContextAware{
	
	private static ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext ctx)throws BeansException {
		SpringContextUtils.ctx=ctx;
	}
	public static ApplicationContext getApplicationContext() {
        return ctx;
	}
    public static Object getBean(String name) throws BeansException {
            return ctx.getBean(name);
    } 
	

}
