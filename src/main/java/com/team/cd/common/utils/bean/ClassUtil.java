package com.team.cd.common.utils.bean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	/**
	 * 获取到的参数 返回值 是Class
	 * @param obj
	 */
	public static void printClassMethodMessage(Object obj){
		Class c = obj.getClass();
		System.out.println("获取Name:"+c.getName());
		Method[] ms = c.getMethods();
		//c.getDeclaredMethods()
		for(int i = 0; i < ms.length;i++){
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName()+" ");
			System.out.print(ms[i].getName()+"(");
			Class[] paramTypes = ms[i].getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
	/**
	 * 获取属性字段
	 * @param obj
	 */
	public static void printFieldMessage(Object obj) {
		Class c = obj.getClass();
		//Field[] fs = c.getFields();
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			Class fieldType = field.getType();
			String typeName = fieldType.getName();
			
			String fieldName = field.getName();
			System.out.println(typeName+" "+fieldName);
		}
	}
	//
	public static void printConMessage(Object obj){
		Class c = obj.getClass();
		//Constructor[] cs = c.getConstructors();
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			System.out.print(constructor.getName()+"(");
			Class[] paramTypes = constructor.getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
}
