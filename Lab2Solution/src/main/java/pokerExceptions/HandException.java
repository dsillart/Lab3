package pokerExceptions;

import java.util.ArrayList;

import pokerBase.Card;
import pokerBase.Deck;

public class HandException extends Exception {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Exception ShortHand() {
	Card.h.add(Deck.Draw());
	return null;
	}
}