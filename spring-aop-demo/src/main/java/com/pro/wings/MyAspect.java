package com.pro.wings;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Before("execution(* com.pro.wings.BankService*.*(..))")
	public void myLogBefore()
	{
		System.out.println("Logging before deposit!!!");
	}
	
	@After("execution(* com.pro.wings.BankService*.*(..))")
	public void myLogAfter()
	{
		System.out.println("Logging After successful deposit!!!");
	}	

}
