package com.zeroday.seapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zeroday.mapper.mapper_interface.testPageMapper;
import com.zeroday.vo.testPage;

@Controller
public class testPageController {

	
	/*
	 * @RequestMapping(value = "/testPage", method = RequestMethod.GET) public
	 * String testPage() { return "testPage/testpage"; }
	 * 
	 * 
	 * @Autowired private testPageMapper testpagemapper;
	 * 
	 * 
	 * 
	 * @RequestMapping(value = "/testPage", method = RequestMethod.GET)
	 * 
	 * //DB ��� ���� �޼��� public String testPage_print(Model model){ //<> �ȿ� DTO
	 * or VO �̸� List<testPage> testpage = testpagemapper.getList();
	 * System.out.println("testPage DB 연결 요청"); //model�� ���� View�� ����
	 * model.addAttribute("testpage",testpage);
	 * System.out.println("testPage DB 연결 완료");
	 * 
	 * return "testPage/testpage"; } jsp 페이지에서 구분자로 "/testPage/insert_data" 값으로
	 * 던져주었기 떄문에 해당 값으로 RequesetMapping을 합니다. post 형식으로 던졌기 때문에 post로 받아주기!
	 * (GET/POST 형식의 차이는 면접에서 자주 물어보는 기본 질문이니 숙지합시다 ㅎㅎ)
	 * 
	 * @RequestMapping(value = "/testPage/insert_data", method = RequestMethod.POST)
	 * 
	 * //메서드 작성하기 @Model 어노테이션을 통해 testPage 생성 public String
	 * insert_data(@ModelAttribute testPage testpage){
	 * 
	 * System.out.print(testpage.toString()); //view에서 제대로 값 던져주는지 확인하기
	 * testpagemapper.insert_data(testpage); return "redirect:/testPage"; //요청 처리 후
	 * testPage로 다시 연결 }
	 */
	 

}
