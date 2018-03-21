package com.sabri.messagesystem.controller;

import java.util.LinkedHashMap;

public class Home {
	
	private String platform;
	private LinkedHashMap<String, String> platforms;
	
	

	public Home() {
		
		platforms = new LinkedHashMap<>();
		platforms.put("m", "Mobile");
		platforms.put("w", "Web");
		platforms.put("b", "Branch Office");
	}

	public LinkedHashMap<String, String> getPlatforms() {
		return platforms;
	}


	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
}
