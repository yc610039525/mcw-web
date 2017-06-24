<%@ page language="java" import="java.util.*" 
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+
"://"+request.getServerName()+
":"+request.getServerPort()+path+"/";
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
    <hr>
    <%="协议request.getScheme()："+request.getScheme()+"，服务名request.getServerName()："+
       request.getServerName()+"，端口request.getServerPort()："
       +request.getServerPort()+"，上下文根路径request.getContextPath()："+path+"，资源路径request.getServletPath()："+
       request.getServletPath()%>
	<hr>
	<%
	 String addr=request.getRemoteAddr();
	 %>
	<%="你的登陆IP是："+addr%>
	<hr>
	<form action="login.do" method="post">
	<label>name:</label>
	<input name="name" />   
	<label>password:</label>
	<input name="pwd" type="password" />
	<label>code:</label>
	<%--response.setIntHeader("Refresh", 5);--%>
	<%--JSP验证码图片还未生成，获取不到session数据 --%>
	<input name="code" value="<%=session.getAttribute("code") %>">
	<img style="cursor:pointer;" src="checkcode.do" border="1" 
		onclick="this.src='checkcode.do?' + Math.random();"/>&nbsp;&nbsp;
	
	<c:if test="${sessionScope.isLogin eq false}" >
	<span>
	${sessionScope.errorMsg}
	</span>
	</c:if>
	<button type="submit">登录</button>
	</form>
	<button onclick="">获取用户信息</button>
	<a href="getUserInfo.do">获取用户信息2</a>
  </body>
</html>
