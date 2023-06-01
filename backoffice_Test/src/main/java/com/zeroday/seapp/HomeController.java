package com.zeroday.seapp;

import java.security.Principal;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, Principal principal) {
		logger.info("Welcome home! The client locale is {}.", locale);
		String userName = "";
		
		try{
			userName = principal.getName();
		}catch(NullPointerException e){
			e.printStackTrace();
		}finally{
			System.out.println("userName >>>>" + userName);
		//	System.out.println("principal >>>>>>>>>>>>>"+principal);
			model.addAttribute("userName",userName);
		}
		return "/home";
	}
	
  
	// 메인 페이지
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home() {
		return "/home";
	}
	//로그인 페이지
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		System.out.println("로그인 페이지");
		return "/logInfo/login";
	}
	// 회원가입 페이지
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public String memberJoin() {
		System.out.println("회원가입 페이지");
		return "/logInfo/memberJoin";
	}
	
	
}
