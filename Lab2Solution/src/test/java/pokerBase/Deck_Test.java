package pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Deck_Test {

	private static ArrayList<Card> theDeck = new ArrayList<Card>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
	}

	Card c = new Card();
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
		theDeck = null;
	
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void DeckBuildTest()
	{
		for (int i = 0; i < theDeck.size(); i++) {
			assertTrue(theDeck.size() == 52);
		}
	}
}
