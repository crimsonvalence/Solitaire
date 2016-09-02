package com.example.steverazis.solitaire;

import com.example.steverazis.solitaire.Model.Card;
import com.example.steverazis.solitaire.Model.CardType;
import com.example.steverazis.solitaire.Model.Deck;
import com.example.steverazis.solitaire.Model.Suit;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by SteveRazis on 16-08-24.
 */

public class DeckTest {
    /*
    Deck deck = new Deck();
    ArrayList<Card> testCards = new ArrayList<>();

    @Test
    public void test_deckSize() throws Exception {
        assertEquals(deck.getCards().size(), 52);
    }

    @Test
    public void test_containsSpadeAce() throws Exception {
        Card spadeAce = new Card(Suit.SPADES, CardType.ACE);
        assertTrue(deck.getCards().contains(spadeAce));
    }

    @Test
    public void test_containsDiamondKing() throws Exception {
        Card diamondKing = new Card(Suit.DIAMONDS, CardType.KING);
        assertTrue(deck.getCards().contains(diamondKing));
    }

    @Test
    public void test_containsAllCards() throws Exception {
        loadTestSuit();
        int i;
        for(i = 0; i < testCards.size(); i++) {
            assertTrue(deck.getCards().contains(testCards.get(i)));
        }
    }

    @Test
    public void test_containsOneOfCards() throws Exception {
        loadTestSuit();
        int i;
        int deckSize = 52;
        for(i = 0; i < testCards.size(); i++) {
            deck.getCards().remove(testCards.get(i));
            deckSize--;
            assertTrue(deck.getCards().size() == deckSize);
        }
    }


    private void loadTestSuit() {
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
        Card spadeJack = new Card(Suit.SPADES, CardType.JACK);
        Card spadeQueen = new Card(Suit.SPADES, CardType.QUEEN);
        Card spadeKing = new Card(Suit.SPADES, CardType.KING);

        Card heartAce = new Card(Suit.HEARTS, CardType.ACE);
        Card heart2 = new Card(Suit.HEARTS, CardType.TWO);
        Card heart3 = new Card(Suit.HEARTS, CardType.THREE);
        Card heart4 = new Card(Suit.HEARTS, CardType.FOUR);
        Card heart5 = new Card(Suit.HEARTS, CardType.FIVE);
        Card heart6 = new Card(Suit.HEARTS, CardType.SIX);
        Card heart7 = new Card(Suit.HEARTS, CardType.SEVEN);
        Card heart8 = new Card(Suit.HEARTS, CardType.EIGHT);
        Card heart9 = new Card(Suit.HEARTS, CardType.NINE);
        Card heart10 = new Card(Suit.HEARTS, CardType.TEN);
        Card heartJack = new Card(Suit.HEARTS, CardType.JACK);
        Card heartQueen = new Card(Suit.HEARTS, CardType.QUEEN);
        Card heartKing = new Card(Suit.HEARTS, CardType.KING);

        Card clubsAce = new Card(Suit.CLUBS, CardType.ACE);
        Card clubs2 = new Card(Suit.CLUBS, CardType.TWO);
        Card clubs3 = new Card(Suit.CLUBS, CardType.THREE);
        Card clubs4 = new Card(Suit.CLUBS, CardType.FOUR);
        Card clubs5 = new Card(Suit.CLUBS, CardType.FIVE);
        Card clubs6 = new Card(Suit.CLUBS, CardType.SIX);
        Card clubs7 = new Card(Suit.CLUBS, CardType.SEVEN);
        Card clubs8 = new Card(Suit.CLUBS, CardType.EIGHT);
        Card clubs9 = new Card(Suit.CLUBS, CardType.NINE);
        Card clubs10 = new Card(Suit.CLUBS, CardType.TEN);
        Card clubsJack = new Card(Suit.CLUBS, CardType.JACK);
        Card clubsQueen = new Card(Suit.CLUBS, CardType.QUEEN);
        Card clubsKing = new Card(Suit.CLUBS, CardType.KING);

        Card diamondAce = new Card(Suit.DIAMONDS, CardType.ACE);
        Card diamond2 = new Card(Suit.DIAMONDS, CardType.TWO);
        Card diamond3 = new Card(Suit.DIAMONDS, CardType.THREE);
        Card diamond4 = new Card(Suit.DIAMONDS, CardType.FOUR);
        Card diamond5 = new Card(Suit.DIAMONDS, CardType.FIVE);
        Card diamond6 = new Card(Suit.DIAMONDS, CardType.SIX);
        Card diamond7 = new Card(Suit.DIAMONDS, CardType.SEVEN);
        Card diamond8 = new Card(Suit.DIAMONDS, CardType.EIGHT);
        Card diamond9 = new Card(Suit.DIAMONDS, CardType.NINE);
        Card diamond10 = new Card(Suit.DIAMONDS, CardType.TEN);
        Card diamondJack = new Card(Suit.DIAMONDS, CardType.JACK);
        Card diamondQueen = new Card(Suit.DIAMONDS, CardType.QUEEN);
        Card diamondKing = new Card(Suit.DIAMONDS, CardType.KING);

        testCards.add(spadeAce);
        testCards.add(spade2);
        testCards.add(spade3);
        testCards.add(spade4);
        testCards.add(spade5);
        testCards.add(spade6);
        testCards.add(spade7);
        testCards.add(spade8);
        testCards.add(spade9);
        testCards.add(spade10);
        testCards.add(spadeJack);
        testCards.add(spadeQueen);
        testCards.add(spadeKing);

        testCards.add(heartAce);
        testCards.add(heart2);
        testCards.add(heart3);
        testCards.add(heart4);
        testCards.add(heart5);
        testCards.add(heart6);
        testCards.add(heart7);
        testCards.add(heart8);
        testCards.add(heart9);
        testCards.add(heart10);
        testCards.add(heartJack);
        testCards.add(heartQueen);
        testCards.add(heartKing);

        testCards.add(clubsAce);
        testCards.add(clubs2);
        testCards.add(clubs3);
        testCards.add(clubs4);
        testCards.add(clubs5);
        testCards.add(clubs6);
        testCards.add(clubs7);
        testCards.add(clubs8);
        testCards.add(clubs9);
        testCards.add(clubs10);
        testCards.add(clubsJack);
        testCards.add(clubsQueen);
        testCards.add(clubsKing);

        testCards.add(diamondAce);
        testCards.add(diamond2);
        testCards.add(diamond3);
        testCards.add(diamond4);
        testCards.add(diamond5);
        testCards.add(diamond6);
        testCards.add(diamond7);
        testCards.add(diamond8);
        testCards.add(diamond9);
        testCards.add(diamond10);
        testCards.add(diamondJack);
        testCards.add(diamondQueen);
        testCards.add(diamondKing);

    }
*/
}
