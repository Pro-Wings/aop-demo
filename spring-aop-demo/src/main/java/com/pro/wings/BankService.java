package com.pro.wings;

import org.springframework.stereotype.Component;

@Component
public class BankService {
	
	public static final String SUCCESS_MSG = "success";
	
	public String deposit(String accNo)
	{
		System.out.println("inside deposit method!!");
		
		if(accNo == "SBIN1234")
		{
			System.out.println("deposited successfully!!!");
		}
		return SUCCESS_MSG;
	}

}
