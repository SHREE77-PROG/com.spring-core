package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("collection/collection.xml");
		Emps Emps1=(Emps) context.getBean("Emps1");
		System.out.println(Emps1);

	}

}
