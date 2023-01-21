package com.kms.java.todoList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsrHomeContoller {
	
	
	@RequestMapping("usr/home/main")
	public String main() {
		return "usr/home/main";
	}
	
	@RequestMapping("/")
	public String Root() {
		return "redirect:usr/home/main";
	}
}
