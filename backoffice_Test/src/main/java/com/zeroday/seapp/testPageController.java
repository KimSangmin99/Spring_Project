package com.zeroday.seapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class testPageController {
	
	@RequestMapping(value = "/testPage", method = RequestMethod.GET)
	public String testPage() {
		return "testPage/testpage";
	}
}
