package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ci/ci.xml");
		Object person = context.getBean("person");
		//Object Certi = context.getBean("Certi");
		System.out.println(person);
		//System.out.println(Certi);
		Adddition add=  (Adddition) context.getBean("add");
		System.out.println(add);
		add.dosum();
		
		}

}
