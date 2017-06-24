package base;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestBaseCase {
	protected static ApplicationContext context = null;
	@BeforeClass
	public static void preHandler(){
		context = new ClassPathXmlApplicationContext("classpath*:spring*.xml");
	}
	@Before
	public void before(){
		System.out.println("测试开始====================");
	}
	@After
	public void after(){
		System.out.println("测试结束====================");
	}
}
