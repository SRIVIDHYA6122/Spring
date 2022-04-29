package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		 Employee e= (Employee) ctx.getBean("employeeobject");
		 e.display();
				
		// TODO Auto-generated method stub

	}

}
