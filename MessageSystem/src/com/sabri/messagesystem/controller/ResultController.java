package com.sabri.messagesystem.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sabri.messagesystem.controller.WebConfig.MyBean;

@Controller
@RequestMapping("/form")
public class ResultController {
	
	//Send Form
	@RequestMapping("/showSendForm")
	public String sendForm(Model model) {
		
		Result result = new Result();
		
		model.addAttribute("result", result);
		
		return "sendForm";
	}
	
	//Receive Form
	@RequestMapping("/showReceiveForm")
	public String receiveForm(Model model) {
		
		Result result = new Result();
		
		model.addAttribute("result", result);
		
		return "receiveForm";
	}
	
	//Processing Form
	@RequestMapping("/processForm")
	public String Process(@ModelAttribute("result") Result result) throws InterruptedException {
		
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(WebConfig.class);
		MyBean bean = context.getBean(MyBean.class);
		
		//Control Balance and Receiving or Sending
		if (result.getAmount()-result.getBalance() == result.getAmount()) {
			result.setResult(bean.write(result.getBranchType()+".receivesuccess", result.getAmount()));
			return "resultSuccess";
		}
		else if (result.getBalance()-result.getAmount() < 0 ) {
			result.setResult(bean.write(result.getBranchType()+".sendfail"));
			return "resultFail";
		}
		else {
			result.setBalance(result.getBalance()-result.getAmount());
			result.setResult(bean.write(result.getBranchType()+".sendsuccess", result.getAmount()) + bean.write("newbalance", result.getBalance()));
			return "resultSuccess";
		}
	}
}
