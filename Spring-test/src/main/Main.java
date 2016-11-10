package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Eleve;
import bean.EleveJDBCTemplate;

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

//	//exo definition de bean sans xml
//	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(HelloM2iConfig.class);
//		HelloM2i helloM2i = (HelloM2i) context.getBean(HelloM2i.class);
//		helloM2i.setMessage("hello m2i");
//		helloM2i.sayMessage();
//		
//	}
	
	//exo DAO
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EleveJDBCTemplate eleveJDBCTemplate = (EleveJDBCTemplate)context.getBean("eleveJDBCTemplate");
	
		System.out.println("---------------------Création---------------------");
		eleveJDBCTemplate.create("Juan", "Javanais");
		eleveJDBCTemplate.create("PierJean", "Javharambe");
		
		System.out.println("---------------------Liste des élèves---------------------");
		List<Eleve> eleves = eleveJDBCTemplate.listEleves();
		
		for(Eleve record : eleves){
			System.out.println("ID: " + record.getId() + ", Nom: " + record.getNom() + ", nick: " + record.getNick());
		}
		
		System.out.println("---------------------Liste des élèves---------------------");
		
		eleveJDBCTemplate.update(2, "Javacuum");
		
		System.out.println("---------------------Liste des élèves 2---------------------");
		List<Eleve> eleves2 = eleveJDBCTemplate.listEleves();
		
		for(Eleve record : eleves2){
			System.out.println("ID: " + record.getId() + ", Nom: " + record.getNom() + ", nick: " + record.getNick());
		}
		
	}
}
