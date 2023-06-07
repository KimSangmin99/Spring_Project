package com.zeroday.seapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zeroday.service.memberService.member_Service;
import com.zeroday.vo.loginVO;

//회원 관리 컨트롤러 로그아웃 / 회원가입
@Controller
public class memberController {
	
	//서비스 객체 생성
	@Autowired
	private member_Service ms;
	//Bcrypt 암호화 객체 생성
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	
	//로그인 페이지 입장 defualt = get 방식
	@RequestMapping(value = "/login")
	public String loginpage(){
		return "logInfo/login";
	}
	
	//로그인 동작 UserDetail 오류로 현재 동작 안되는 Method
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String member_login(@ModelAttribute loginVO loginvo){
		System.out.println("member_login 동작 시작");
		ms.loadUserByUsername(loginvo.getSe_Id());
		
		return "/";
	}
	
	//회원가입 - 페이지 입장
	@RequestMapping(value = "/memberJoin")
	public String member_Join(){
		System.out.println("회원가입 페이지 입장");		
		return "logInfo/memberJoin";
	}
	
	//회원가입 - 회원 등록 메서드
	@RequestMapping(value = "/memberJoin/register", method = RequestMethod.POST)
	public String memberJoinRegister(@ModelAttribute loginVO loginvo){
		//회원 비밀번호 bcrypt 암호화
		loginvo.setSe_Password(BCrypt.hashpw(loginvo.getSe_Password(), BCrypt.gensalt(10)));		
		
		//정상동작
		if(ms.memberRegisterService(loginvo)){
			System.out.println("회원 가입 완료");
			return "redirect:/login";
		}
		else{
			System.out.println("로그인 실패-아이디 중복");
			return "redirect:/memberJoin";
		}
	}
	
	
	
	//로그아웃 메서드 작성할 필요 없음
	/*
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(){
		System.out.println("로그아웃 페이지 입장");		
		return "logInfo/login";
	}*/

}
