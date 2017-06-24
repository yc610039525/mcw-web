package com.cnblog.yc610039525.userinterceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserSecurityInterceptor  implements HandlerInterceptor{
	
	List<String> ignoreUrls;
	public void setIgnoreUrls(List<String> ignoreUrls) {
		this.ignoreUrls = ignoreUrls;
	}
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
//		String username =(String)session.getAttribute("name");
//		String pwd =(String)session.getAttribute("pwd");
		String username =(String)request.getParameter("name");
		String pwd =(String)request.getParameter("pwd");;
		String code =(String)request.getParameter("code");;
		Boolean isLogin =(Boolean)session.getAttribute("isLogin");
		boolean flag=false;
		if(username!=null&&!username.isEmpty()){
			if("admin".equals(username)&&"000000".equals(pwd)){
				if(StringUtils.equalsIgnoreCase(code, (String)session.getAttribute("code"))){
					flag=true;	
				}else{
					System.out.println("验证码错误！");
					session.setAttribute("errorMsg", "验证码错误！");
				}
			}else if(ignoreUrls!=null&&!ignoreUrls.isEmpty()){
				for(String ignoreUrl : ignoreUrls){
					if(ignoreUrl.equals(username)){
						flag=true;
					}
				}
			}
		}
		if(isLogin!=null&&isLogin){
//			flag=true;
		}
		if(!flag){
//			request.getRequestDispatcher("/index.jsp").forward(request, response);
			response.sendRedirect("/easy.spring/index.jsp");

		}
		session.setAttribute("isLogin", flag);
		System.out.println("UserSecurityInterceptor-preHandle():"+request.getServletPath()+(flag?"未被拦截":"被拦截"));
		return flag;
	}

	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("UserSecurityInterceptor-postHandle():preHandle()返回true执行postHandle()...");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("UserSecurityInterceptor-afterCompletion():拦截完成后...一般用于日志处理");
	}

}