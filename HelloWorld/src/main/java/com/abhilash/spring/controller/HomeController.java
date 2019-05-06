package com.abhilash.spring.controller;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abhilash.spring.model.Message;


@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		return "home";
	}
	
	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public String mesage(@Validated Message message,Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("message", message.getMessage());
		model.addAttribute("anotherMessage", message.getAnotherMessage());
		return "message";
	}
	
	@RequestMapping(value = "/anotherPage", method = RequestMethod.GET)
	public String anotherPage(Model model) {
		return "anotherPage";
	}

}
