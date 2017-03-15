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
		StringBuilder sb = new StringBuilder();
		for(String s: translation)
			sb.append(translation.toString());
		return sb.toString();
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
