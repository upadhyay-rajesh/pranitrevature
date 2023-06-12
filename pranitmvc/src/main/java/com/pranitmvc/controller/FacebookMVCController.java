package com.pranitmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FacebookMVCController {

	@RequestMapping("createprofile.htm")
	public ModelAndView registerUser(@RequestParam("nm") String name,@RequestParam("pass") String password,@RequestParam("em") String email,@RequestParam("ad") String address) {
		ModelAndView mv=new ModelAndView();
		return mv;
	}
}
