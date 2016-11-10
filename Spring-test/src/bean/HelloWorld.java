package bean;

public class HelloWorld {

	private String message;
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public void sayMessage(){
		System.out.println("Votre message: " + this.getMessage());
	}
	
}
