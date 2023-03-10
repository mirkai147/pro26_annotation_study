package com.spring.ex02;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController")
public class LoginController {

	@RequestMapping(value = {"/loginForm.do"}, method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm");
		return mav;
	}
//	 @RequiredParam 적용 시 required 속성을 생략하면 기본값은 true임
//	 required 속성을 true로 설정하면 메서드 호출시 반드시 지정한 이름의 매개변수를 전달해야함 (매개변수가 없으면 예외 발생) 
//	 required 속성을 false로 설정하면 메서드 호출시 지정한 이름의 매개변수가 전달되면 값을 
	 
	@RequestMapping(value = {"/test/login.do"}, method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		String userID = request.getParameter("userID");
		String userName = request.getParameter("userName");
		System.out.println(userID);
		System.out.println(userName);
		mav.addObject(userID);
		mav.addObject(userName);
		mav.setViewName("result");
		return mav;
	}
	
	
//	Model 클래스의 addAttribute() 메서드는 ModelAndView의 addObject() 메서드
	@RequestMapping(value = {"/test/login5.do"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String login(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		model.addAttribute("asdf","nice");
		return "result5";
	}
}