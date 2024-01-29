package com.rahul.Controllr;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/controller22")
public class FirstWebController {
	
	@RequestMapping("/welcome")
	public String someMessage(Model model) {
		System.out.println("Model is Implemented by : "+model.getClass().getName());
		model.addAttribute("name", "Rahul");
		return "home";//logical view name is the  return type
	}	
	@GetMapping("/welcome2")
	public String someMessage2(Model model) {
		System.out.println("Model is Implemented by : "+model.getClass().getName());
		model.addAttribute("name", "VIRAT");
		return "home";//logical view name is the  return type
	}
	@PostMapping("/skill")
	public String someMessage3(Model model) {
		System.out.println("Model is Implemented by : "+model.getClass().getName());
		model.addAttribute("message", "hey this is first controller focus is the key");
		return "focus";//logical view name is the  return type
	}
	
	@GetMapping("/rcb")
	public String someMessage4(Model model) {
		System.out.println("Model is Implemented by : "+model.getClass().getName());
		model.addAttribute("rcbname", "Rahul Pannati");
		return "RCB";//logical view name is the  return type
	}
	
	@GetMapping("/esalacupnamdhe")
	public String someMessage5(Map<String,Object> model) {
		System.out.println("Model is Implemented by : "+model.getClass().getName());
		model.put("rcbname", " E sala Cup namdhe !!!");
		return "RCB";//logical view name is the  return type
	}
	
}
