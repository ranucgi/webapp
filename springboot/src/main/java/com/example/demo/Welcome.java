package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcome {
	@RequestMapping("home")
	@ResponseBody
	public String show() {
		return"welcome to boot";
	}

}
