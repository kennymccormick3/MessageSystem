package com.sabri.messagesystem.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	//Show Home Page
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
	
	//Change Locale
	@RequestMapping("/tr")
	public String tr() {
		Locale.setDefault(new Locale("tr"));
		return "home";
	}
	
	//Change Locale
	@RequestMapping("/en")
	public String en() {
		Locale.setDefault(new Locale("en"));
		return "home";
	}
	
}
