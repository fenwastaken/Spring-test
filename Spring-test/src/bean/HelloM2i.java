package bean;

public class HelloM2i {

	private String message;

	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
		
	public void sayMessage(){
		System.out.println("Votre message 1 : " + this.getMessage());
	}

	
	public void init(){
		System.out.println("Bean Initialisé");
		
	}
	
	public void destroy(){
		System.out.println("Bean Détruit");
	}
	
	
}
