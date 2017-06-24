package com.cnblog.yc610039525.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class MainController {
	@RequestMapping("/success.do")
    public String login(HttpServletRequest request,HttpServletResponse response){
        System.out.println("success.do...");
        HttpSession session = request.getSession();
        session.setAttribute("username", "mainView");
        return "/view/success";
    }
}
