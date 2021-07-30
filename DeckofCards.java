package com.workshop2;
import java.util.ArrayList;

	public class DeckofCards<card> {                                   //creating class name as DeckofCards
	  ArrayList<card> deckofCards = new ArrayList<card>();              //usind Array list
	  public void BuiltDeckOfCard(){
	      String[] suit ={"club","diamond","heart","spade"};
	      
	      int rank;
	      for(String suits : suit){
	          for(rank=1;rank<=13;rank++){
	              Card oneCard = new Card(rank);
	              deckofCards.add((card) oneCard);
	          }

	      }
	  }
	}
