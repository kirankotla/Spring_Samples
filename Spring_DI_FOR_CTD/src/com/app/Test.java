package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
         ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
         
       //  Employe  emp=(Employe)context.getBean("empobj");
         Employe  emp=context.getBean("empobj",Employe.class);
          System.out.println(emp);
		

	}

}
