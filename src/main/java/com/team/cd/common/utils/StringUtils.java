package com.team.cd.common.utils;

//import com.imooc.reflect.BeanUtil;

public class StringUtils {
public static void main(String[] args) {
	System.out.println(StringUtils.getStrLength("48378511694301"));
	
}

public static int getStrLength(String str){
	if(str!=null){
		return str.length();
	}else{
		return 0;
	}	
}
public static boolean isEmpty(String str){
	return str==null||str.equals("")||str.replaceAll("\\s", "").equals("");
}

}
