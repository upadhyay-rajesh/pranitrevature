package com.pranitproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pranitproject.entity.FacebookUser;

@RestController
public class FacebookController { 
	
	
 
	@PostMapping("register")
	public @ResponseBody FacebookUser createProfile(@RequestBody FacebookUser fb) {// here we are taking user data from UI and storing inside entity class via @RequestBody)
		return fb; 
	}

	@DeleteMapping("delete/{email}/{ad}")
	public String deleteProfile(@PathVariable("email") String em, @PathVariable("ad") String address) {
		return "profile deleted "+em;
	}
	
	
	@PutMapping("edit")
	public String editProfile() {
		return "profile edited";
	}

	@GetMapping("view")
	public String viewProfile() {
		return "profile viewed";
	}

}
