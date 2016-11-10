package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.HelloPoec;
import bean.HelloWorld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//		HelloWorld objA = (HelloWorld)context.getBean("helloWorld");
//		objA.sayMessage1();
//		objA.sayMessage2();

		HelloPoec objB = (HelloPoec)context.getBean("helloPoec");
		objB.sayMessage1();
		objB.sayMessage2();
		objB.sayMessage3();
		
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
