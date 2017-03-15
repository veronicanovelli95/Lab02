package it.polito.tdp.alien;

import java.util.LinkedList;

public class WordEnhanced {
	private String alienWord;
	private LinkedList<String> translation=new LinkedList<String>();

   public WordEnhanced(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation.add(translation);
	}

	public String getAlienWord() {
	
		return alienWord;
	}


	public String getTranslation() {
		String trad="";
		for(String s: translation)
			trad += s.toString() + " ";
		return trad.trim();
	}

	public Boolean compare(String alien){
		String a = alien.toLowerCase();
		String b = this.alienWord.toLowerCase();
		return a.equals(b);
	}

	public void aggiungiTraduzione(String translation2) {
		translation.add(translation2);
		
	}

}
