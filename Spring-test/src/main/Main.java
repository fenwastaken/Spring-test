package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.HelloM2i;
import bean.HelloM2iConfig;
import bean.HelloPoec;
import bean.HelloWorld;
import bean.TextEditor;

public class Main {
//exo1 ->keepHelloWorldObjetA as comment
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//		HelloWorld objA = (HelloWorld)context.getBean("helloWorld");
//		objA.sayMessage1();
//		objA.sayMessage2();
//
//		HelloPoec objB = (HelloPoec)context.getBean("helloPoec");
//		objB.sayMessage1();
//		objB.sayMessage2();
//		objB.sayMessage3();
//		
//		((AbstractApplicationContext) context).registerShutdownHook();
//	}
	
//exo 2 beans imbriqués
//	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		TextEditor te = (TextEditor)context.getBean("textEditor");
//		te.spellChecker();
//	}

	//exo definition de bean sans xml
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloM2iConfig.class);
		HelloM2i helloM2i = (HelloM2i) context.getBean(HelloM2i.class);
		helloM2i.setMessage("hello m2i");
		helloM2i.sayMessage();
		
	}
	
}
