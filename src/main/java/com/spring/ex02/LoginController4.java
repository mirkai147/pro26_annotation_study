package com.spring.ex02;

//import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController4")
public class LoginController4 {

	@RequestMapping(value = {"/loginForm4.do"}, method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm");
		return mav;
	}
	
	@RequestMapping(value = {"/test/login4.do"}, method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login(@ModelAttribute("info") LoginVO loginVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		
		String userID = loginVO.getUserId();
		String userName = loginVO.getUserName();
		System.out.println(userID);
		System.out.println(userName);
//		mav.addObject("loginVO",loginVO);
		mav.setViewName("result3");
		return mav;
	}
}
