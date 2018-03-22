package com.sabri.messagesystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("sort")
public class SortListController {
	
	@RequestMapping("/list")
	@ResponseBody
	public String sortPage() {
		List<String> words = new ArrayList<String>();
		
		words.add("aaaasdf");
        words.add("aaaasd");
        words.add("a");
        words.add("aab");
        words.add("aaabcd");
        words.add("ef");
        words.add("cssssssd");
        words.add("fdz");
        words.add("kf");
        words.add("zc");
        words.add("lklklklklklklklkl");
        words.add("l");
        
		return SortList.sortWords(words).toString();
	}
}
