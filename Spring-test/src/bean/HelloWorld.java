package bean;

public class HelloWorld {

	private String message1;
	private String message2;
	
	public String getMessage1() {
		return message1;
	}
	
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	
	public String getMessage2() {
		return message2;
	}
	
	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public void sayMessage1(){
		System.out.println("Votre message 1 : " + this.getMessage1());
	}
	
	public void sayMessage2(){
		System.out.println("Votre message 2 : " + this.getMessage2());
	}
	
	public void init(){
		System.out.println("Bean Initialisé");
		
	}
	
	public void destroy(){
		System.out.println("Bean Détruit");
	}
	
	
}
