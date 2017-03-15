package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary {

	private LinkedList<WordEnhanced> paroleNote= new LinkedList<WordEnhanced>();
	
	public void addWord(String alienWord, String translation){
		for(WordEnhanced p : paroleNote){
		    if(p.compare(alienWord)== true)
			p.aggiungiTraduzione(translation);
     }
		paroleNote.add(new WordEnhanced(alienWord, translation));
	}
	
	
	public String translateWord(String alienWord){
		for(WordEnhanced p : paroleNote){
			if(p.compare(alienWord)== true)
				return p.getTranslation();
	     }
		
		return null;
    }


	public void reset() {
		paroleNote.clear();
	}


}
