package com.pro.wings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(RegisterAspect.class);
		
		BankService b = ctx.getBean(BankService.class);
		
		b.deposit("SBIN1234");
	}

}
