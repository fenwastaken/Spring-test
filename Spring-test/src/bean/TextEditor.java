package bean;

public class TextEditor {

	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		System.out.println("getSpellChecker");
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("setSpellChecker");
		this.spellChecker = spellChecker;
	}
	
	public  void spellChecker(){
		spellChecker.checkSpelling();
	}
	
	
	
}
