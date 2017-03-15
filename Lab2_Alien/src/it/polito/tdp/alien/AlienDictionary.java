package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary {

	private LinkedList<Parole> paroleNote= new LinkedList<Parole>();
	
	public void addWord(String alienWord, String translation){
		paroleNote.add(new Parole(alienWord, translation));
	}
	
	
	public String translateWord(String alienWord){
		for(Parole p : paroleNote){
			if(p.compare(alienWord)== true)
				return p.getTranslation();
	     }
		
		return null;
    }


	public void reset() {
		paroleNote.clear();
	}


}
