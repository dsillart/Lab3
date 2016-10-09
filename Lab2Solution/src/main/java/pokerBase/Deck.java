package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerExceptions.OverdrawException;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if ((eSuit != pokerEnums.eSuit.JOKER) && (eSuit != pokerEnums.eSuit.JOKER)) {
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				}
			}
			 
		}
		Collections.shuffle(deckCards);
	}
	
	public Deck(int NbrOfJokers) {
		for (int i = 0; i <= NbrOfJokers; i++) {
			deckCards.add(new Card(eSuit.JOKER,eRank.JOKER,99));
		}
	}
	
	
	public Deck(int NbrOfJokers, ArrayList<Card> Wilds) {
		for (int i = 0; i <= NbrOfJokers; i++) {
			deckCards.add(new Card(eSuit.JOKER,eRank.JOKER,99));
		for (Card c : Wilds) {
			c.setbWild(true);
		}
	}
		
	}
	public Card Draw() throws Exception {
			if (deckCards.size() == 0) {
				throw new Exception(OverdrawException.overdrawException);
				}		
			
		return deckCards.remove(0);
		
	}

	public Object getDeck() {
		return deckCards;
	}
}
