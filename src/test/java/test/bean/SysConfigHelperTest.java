package test.bean;

import org.junit.Test;

import base.SpringTestBaseCase;

import com.cnblog.yc610039525.sys.SysConfigHelper;

public class SysConfigHelperTest extends SpringTestBaseCase {
	
	@Test public void getEnvTest() {
		SysConfigHelper bean = (SysConfigHelper)context.getBean("SysConfigHelper");
		System.out.println("properties:"+bean.getEnv());
	}

}
