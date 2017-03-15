package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary2 {

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

	
	public String translateWordWildCard(String alienWildCard) {

		// Utilizzo le regual expression di Java.
		// Sostituisco il punto interrogativo con il punto.
		// Il punto indica qualsiasi carattere (posso usare stringa.matches())
		alienWildCard = alienWildCard.replaceAll("\\?", ".");

		int matchCounter = 0;
		StringBuilder sb = new StringBuilder();

		for (WordEnhanced w : paroleNote) {
			if (w.compareWild(alienWildCard)) {
				matchCounter++;
				sb.append(w.getTranslation() + "\n");
			}
		}

		if (matchCounter != 0)
			return sb.toString();
		else
			return null;
	}


}