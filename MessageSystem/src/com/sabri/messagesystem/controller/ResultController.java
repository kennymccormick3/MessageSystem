package com.sabri.messagesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {
	@RequestMapping("/")
	public String mobil(Model model) {
		
		Result result = new Result();
		
		model.addAttribute("result", result);
		
		return "sendForm";
	}
	
	@RequestMapping("/processForm")
	public String Process(@ModelAttribute("result") Result result) {
		if (result.getBalance()-result.getAmount() < 0 ) {
			return "resultFail";
		}
		else {
			result.setBalance(result.getBalance()-result.getAmount());
			return "resultSuccess";
		}
	}
}
