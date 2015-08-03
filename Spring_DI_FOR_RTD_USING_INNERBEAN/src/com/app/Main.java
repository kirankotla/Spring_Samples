package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employe  empobj=context.getBean("empobj",Employe.class);
		System.out.println(empobj);
	}
}
