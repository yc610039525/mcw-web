<%@ page language="java" import="java.util.*" 
pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+
"://"+request.getServerName()+
":"+request.getServerPort()+ path+"/";
%>
<html>
  <head>
    <title>login</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
	<p>登陆成功，即将跳转到新页面......</p>
	<%
		System.out.println("登陆成功，即将跳转到新页面......");
	%>
  </body>
</html>