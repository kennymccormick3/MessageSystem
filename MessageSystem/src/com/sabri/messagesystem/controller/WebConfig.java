package com.sabri.messagesystem.controller;



import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class WebConfig {
	
	@Bean
    public MyBean myBean () {
        return new MyBean();
    }

	//Message Source Configuration
	@Bean
	   public MessageSource messageSource() {
	      ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
	      messageSource.setBasename("classpath:mobile");
	      messageSource.setDefaultEncoding("UTF-8");
	      return messageSource;
	   }
	
	
	//Printer by Locale
	public static class MyBean {
        @Autowired
        private MessageSource messageSource;
        
        public String write (String id, int amount) {
        	String sonuc = messageSource.getMessage(id, new Object[]{amount}, Locale.getDefault());
            return sonuc;
        }
        
        public String write (String id) {
        	String sonuc = messageSource.getMessage(id, null, Locale.getDefault());
            return sonuc;
        }
    }
}
