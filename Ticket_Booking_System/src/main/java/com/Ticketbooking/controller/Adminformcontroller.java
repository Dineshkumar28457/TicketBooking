package com.Ticketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class Adminformcontroller{
	@GetMapping("/booking")
	public String page() {
	 return "Mainpage.html";
	}
	@GetMapping("/booking")
	public String page2() {
	 return "Bookingpage.html";
		
	}
	@GetMapping("/booking")
	public String page3() {
	 return "loginform.html";
		
	}
	@GetMapping("/booking")
	public String page4() {
	 return "adminform.html";
		
	}
}