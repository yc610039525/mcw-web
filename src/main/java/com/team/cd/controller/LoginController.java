package com.team.cd.controller;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.team.cd.common.utils.annotation.SysLogger;
import com.team.cd.common.utils.file.ImageUtils;
import com.team.cd.model.User;

@Controller
public class LoginController{
	private static Logger logger=Logger.getLogger(LoginController.class);
	@SysLogger(description="login")
	@RequestMapping("/login.do")
    public String login(HttpServletRequest request,HttpServletResponse response){
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("pwd", pwd);
        String code =(String)session.getAttribute("code");        
        ServletContext applcontext = request.getSession().getServletContext();
        String servletContext=(String)applcontext.getInitParameter("webParam");
        System.out.println("code:"+code);
        System.out.println("servletContext:"+servletContext);
        String method = request.getMethod();
        System.out.println("请求方式为:"+method);
//      "forward:/view/success" "redirect:/view/success"
        Cookie cookie= new Cookie("name", "xiaoming");
        cookie.setPath("/");
        Cookie[] cookies = request.getCookies();
        response.addCookie(cookie);
        return "redirect:/view/success.jsp";
    }
	
	@SysLogger(description="checkcode")
	@RequestMapping("/checkcode.do")
    public void getCode(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
//		String ADDRESS = "http://localhost/spring.framework/cxf/helloWorld";
//	    JaxWsProxyFactoryBean jwpFactory = new JaxWsProxyFactoryBean();  
//        jwpFactory.setAddress(ADDRESS);  
//        jwpFactory.setServiceClass(IHelloWorld.class);  
//        IHelloWorld hw = (IHelloWorld)jwpFactory.create(); 
//        String responseText = hw.sayHi("world");  
//        System.out.println(responseText); 
	      
		response.setHeader("Paragma", "no-cache");  
        response.setHeader("Cache-Control", "no-cache");  
        response.setDateHeader("Expires", 0); 
		//step1,告诉浏览器，返回的是图片
		response.setContentType("image/jpeg");
		//step2,要使用字节流输出
		OutputStream os =response.getOutputStream();
		//step3,压缩图片并输出
		String number=ImageUtils.getNumber(4);
		HttpSession session = request.getSession();
		session.setAttribute("code", number);
		BufferedImage image = ImageUtils.drawCode(number);
		ImageIO.write(image, "jpeg", os);
		os.close();
		
	}
	@SysLogger(description="getUserInfo")
	@RequestMapping(value = "/getUserInfo.do",method = RequestMethod.GET)
	public void getUserInfo(HttpServletRequest request,HttpServletResponse response) throws IOException{
		User user=new User();
		user.setName("LiWEi");
		user.setGender("F");
		user.setAge(12);
		user.setAddress("CHENGDU");
//		JSONObject jsonObj=JSON.
		String jsonStr=JSON.toJSONString(user);
		User jsonObj=JSON.parseObject(jsonStr, User.class);
//		ServletOutputStream outputStream = response.getOutputStream();
		PrintWriter out=response.getWriter();
		out.write(jsonStr);
		out.flush();
		out.close();
	}
	
	public Object getAttrFromSession(String attrName){
		RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
		Object obj = requestAttributes.getAttribute(attrName,RequestAttributes.SCOPE_SESSION);
		return obj;
	}
	public HttpServletRequest getHttpServletRequest(){
		RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
		HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
		return request;
	}
//	public HttpServletResponse  getHttpServletResponse (){
//		ResponseC
//		RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
//		HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).get();
//		return response;
//	}
}
