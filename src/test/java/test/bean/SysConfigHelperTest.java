package test.bean;

import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.junit.Test;

import com.team.cd.sys.SysConfigHelper;


import base.SpringTestBaseCase;


public class SysConfigHelperTest extends SpringTestBaseCase {
	
	@Test public void getEnvTest() {
		SysConfigHelper bean = (SysConfigHelper)context.getBean("SysConfigHelper");
		System.out.println("properties:"+bean.getEnv());
		Date courrentDate=new Date();
		String dateStr=DateFormatUtils.ISO_DATE_FORMAT.format(courrentDate);
		String dateStr2 = DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT.format(courrentDate);
		System.out.println(dateStr2);
		System.out.println(dateStr);
	}

}
