package com.rahul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/welcome")
	public ModelAndView displaymessage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "welcome to my page");
		mav.setViewName("index");
		return mav;
	}

	@RequestMapping("/home")
	public ModelAndView displaymessage2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "spring mvc learning ");
		mav.setViewName("index");
		return mav;
	}
}
