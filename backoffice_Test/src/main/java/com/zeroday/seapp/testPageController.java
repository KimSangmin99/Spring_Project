package com.zeroday.seapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zeroday.mapper.testPageMapper;
import com.zeroday.vo.testPage;

@Controller
public class testPageController {
	
	/*
	 * @RequestMapping(value = "/testPage", method = RequestMethod.GET) public
	 * String testPage() { return "testPage/testpage"; }
	 */
	@Autowired
    private testPageMapper testpagemapper;
    
    @RequestMapping(value = "/testPage", method = RequestMethod.GET)
    
    //DB ��� ���� �޼���
    public String testPage_print(Model model){
        //<> �ȿ� DTO or VO �̸�
        List<testPage> testpage = testpagemapper.getList();
        System.out.println("testPage DB ����õ�");
        //model�� ���� View�� ����
        model.addAttribute("testpage",testpage);
        System.out.println("testPage DB ���Ἲ��");
        
        return "testPage/testpage";
    }
}
