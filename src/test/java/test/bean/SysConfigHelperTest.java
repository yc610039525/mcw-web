package test.bean;

import org.junit.Test;

import com.team.cd.sys.SysConfigHelper;


import base.SpringTestBaseCase;


public class SysConfigHelperTest extends SpringTestBaseCase {
	
	@Test public void getEnvTest() {
		SysConfigHelper bean = (SysConfigHelper)context.getBean("SysConfigHelper");
		System.out.println("properties:"+bean.getEnv());
	}

}
