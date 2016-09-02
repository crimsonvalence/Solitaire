package com.example.steverazis.solitaire;

import com.example.steverazis.solitaire.Model.Card;
import com.example.steverazis.solitaire.Model.CardType;
import com.example.steverazis.solitaire.Model.Deck;
import com.example.steverazis.solitaire.Model.EndPile;
import com.example.steverazis.solitaire.Model.Suit;
import com.example.steverazis.solitaire.Model.TurnPile;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by SteveRazis on 16-08-24.
 */

public class EndPileTest {
    /*
    Deck deck = new Deck();
    EndPile endPile = new EndPile(Suit.SPADES);
    TurnPile turnPile = new TurnPile(deck);

    @Test
    public void test_addCard() throws Exception {
        Card spadeAce = new Card(Suit.SPADES, CardType.ACE);
        Card spade2 = new Card(Suit.SPADES, CardType.TWO);
        Card spade3 = new Card(Suit.SPADES, CardType.THREE);
        Card spade4 = new Card(Suit.SPADES, CardType.FOUR);

        endPile.addCard(spadeAce);
        endPile.addCard(spade2);
        endPile.addCard(spade3);
        endPile.addCard(spade4);
        assertEquals(endPile.getTopCard(), spade4);
    }

    @Test
    public void test_removeCard() throws Exception {
        Card spadeAce = new Card(Suit.SPADES, CardType.ACE);
        Card spade2 = new Card(Suit.SPADES, CardType.TWO);
        Card spade3 = new Card(Suit.SPADES, CardType.THREE);
        Card spade4 = new Card(Suit.SPADES, CardType.FOUR);

        endPile.addCard(spadeAce);
        endPile.addCard(spade2);
        endPile.addCard(spade3);
        endPile.addCard(spade4);

        endPile.removeCard();
        assertEquals(endPile.getTopCard(), spade3);
    }


    /*
    @Test
    public void test_removeCard_nothingInStack() throws Exception {
        endPile.removeCard();
        assertEquals(endPile.getTopCard(), null);
    }
    */

    /*
    @Test
    public void test_addCard_wrongSuit() throws Exception {
        Card spadeAce = new Card(Suit.SPADES, CardType.ACE);
        Card spade2 = new Card(Suit.SPADES, CardType.TWO);
        Card spade3 = new Card(Suit.SPADES, CardType.THREE);
        Card spade4 = new Card(Suit.SPADES, CardType.FOUR);

        Card heart5 = new Card(Suit.HEARTS, CardType.FIVE);

        endPile.addCard(spadeAce);
        endPile.addCard(spade2);
        endPile.addCard(spade3);
        endPile.addCard(spade4);

        endPile.addCard(heart5);

        assertEquals(endPile.getTopCard(), spade4);
    }

    @Test
    public void test_addCard_wrongType() throws Exception {
        Card spadeAce = new Card(Suit.SPADES, CardType.ACE);
        Card spade2 = new Card(Suit.SPADES, CardType.TWO);
        Card spade3 = new Card(Suit.SPADES, CardType.THREE);
        Card spade4 = new Card(Suit.SPADES, CardType.FOUR);

        Card spadeQ = new Card(Suit.SPADES, CardType.QUEEN);

        endPile.addCard(spadeAce);
        endPile.addCard(spade2);
        endPile.addCard(spade3);
        endPile.addCard(spade4);

        endPile.addCard(spadeQ);

        assertEquals(endPile.getTopCard(), spade4);
    }

    @Test
    public void test_isCompleteYes() throws Exception {
        Card spadeAce = new Card(Suit.SPADES, CardType.ACE);
        Card spade2 = new Card(Suit.SPADES, CardType.TWO);
        Card spade3 = new Card(Suit.SPADES, CardType.THREE);
        Card spade4 = new Card(Suit.SPADES, CardType.FOUR);
        Card spade5 = new Card(Suit.SPADES, CardType.FIVE);
        Card spade6 = new Card(Suit.SPADES, CardType.SIX);
        Card spade7 = new Card(Suit.SPADES, CardType.SEVEN);
        Card spade8 = new Card(Suit.SPADES, CardType.EIGHT);
        Card spade9 = new Card(Suit.SPADES, CardType.NINE);
        Card spade10 = new Card(Suit.SPADES, CardType.TEN);
        Card spadeJ = new Card(Suit.SPADES, CardType.JACK);
        Card spadeQ = new Card(Suit.SPADES, CardType.QUEEN);
        Card spadeK = new Card(Suit.SPADES, CardType.KING);

        endPile.addCard(spadeAce);
        endPile.addCard(spade2);
        endPile.addCard(spade3);
        endPile.addCard(spade4);
        endPile.addCard(spade5);
        endPile.addCard(spade6);
        endPile.addCard(spade7);
        endPile.addCard(spade8);
        endPile.addCard(spade9);
        endPile.addCard(spade10);
        endPile.addCard(spadeJ);
        endPile.addCard(spadeQ);
        endPile.addCard(spadeK);

        assertTrue(endPile.isComplete());
    }


    @Test
    public void test_isCompleteNo() throws Exception {
        Card spadeAce = new Card(Suit.SPADES, CardType.ACE);
        Card spade2 = new Card(Suit.SPADES, CardType.TWO);
        Card spade3 = new Card(Suit.SPADES, CardType.THREE);
        Card spade4 = new Card(Suit.SPADES, CardType.FOUR);
        Card spade5 = new Card(Suit.SPADES, CardType.FIVE);
        Card spade6 = new Card(Suit.SPADES, CardType.SIX);
        Card spade7 = new Card(Suit.SPADES, CardType.SEVEN);
        Card spade8 = new Card(Suit.SPADES, CardType.EIGHT);
        Card spade9 = new Card(Suit.SPADES, CardType.NINE);
        Card spade10 = new Card(Suit.SPADES, CardType.TEN);
        Card spadeJ = new Card(Suit.SPADES, CardType.JACK);
        Card spadeQ = new Card(Suit.SPADES, CardType.QUEEN);

        endPile.addCard(spadeAce);
        endPile.addCard(spade2);
        endPile.addCard(spade3);
        endPile.addCard(spade4);
        endPile.addCard(spade5);
        endPile.addCard(spade6);
        endPile.addCard(spade7);
        endPile.addCard(spade8);
        endPile.addCard(spade9);
        endPile.addCard(spade10);
        endPile.addCard(spadeJ);
        endPile.addCard(spadeQ);

        assertFalse(endPile.isComplete());
    }
    */
}
