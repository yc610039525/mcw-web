package com.team.cd.common.utils;

import java.lang.reflect.Method;

public class BeanUtil {
	
	//根据属性名称获取属性值
	public static Object getValueByPropertyName(Object obj, String propertyName) {
		String getMethodName = "get"
				+ propertyName.substring(0, 1).toUpperCase()
				+ propertyName.substring(1);
		Class c = obj.getClass();
		try {
			Method m= c.getMethod(getMethodName);
			Object value = m.invoke(obj);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
