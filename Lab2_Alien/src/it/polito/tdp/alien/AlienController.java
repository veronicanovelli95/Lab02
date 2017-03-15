package it.polito.tdp.alien;

import java.awt.List;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	private AlienDictionary ad;

	
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	ad = new AlienDictionary();
    }
  
    
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String[] array = txtWord.getText().split(" ");
    	
//    	txtResult.setText(array[0]  + "\n");
//    	txtResult.appendText(array[1] + "\n");
    	
    	int i = array.length;
    	
    	if(array[0].matches("[A-Za-z]*")){
    		txtResult.appendText("Match");
    	} else {
    		txtResult.appendText("Do not match");
    		return;
    	}
    	
    	if(i==1){
    		String traduzione = ad.translateWord(array[0]);
    		txtResult.setText("traduzione "+traduzione);
    	} else if(i==2){
    		ad.addWord(array[0], array[1]);
    		txtResult.setText(array[1]);
    	}
 
       
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
     ad.reset();
    }
    
}
