package it.polito.tdp.alien;

public class Parole {
	private String alienWord;
	private String translation;

   public Parole(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}

	public String getAlienWord() {
		return alienWord;
	}


	public String getTranslation() {
		return translation;
	}

	public Boolean compare(String alien){
		String a = alien.toLowerCase();
		String b = this.alienWord.toLowerCase();
		return a.equals(b);
	}

}
