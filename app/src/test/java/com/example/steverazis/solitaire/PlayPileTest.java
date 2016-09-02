package com.example.steverazis.solitaire;

import com.example.steverazis.solitaire.Model.Card;
import com.example.steverazis.solitaire.Model.CardType;
import com.example.steverazis.solitaire.Model.Deck;
import com.example.steverazis.solitaire.Model.PlayPile;
import com.example.steverazis.solitaire.Model.Suit;
import com.example.steverazis.solitaire.Model.TurnPile;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by SteveRazis on 16-08-24.
 */

public class PlayPileTest {
    /*
    Deck deck = new Deck();
    TurnPile turnPile = new TurnPile(deck);
    PlayPile playPile = new PlayPile(turnPile, 6, 1);

    Card spadeAce = new Card(Suit.SPADES, CardType.ACE);
    Card spade2 = new Card(Suit.SPADES, CardType.TWO);
    Card spade3 = new Card(Suit.SPADES, CardType.THREE);
    Card spade4 = new Card(Suit.SPADES, CardType.FOUR);
    Card spade5 = new Card(Suit.SPADES, CardType.FIVE);
    Card spade6 = new Card(Suit.SPADES, CardType.SIX);
    Card spade7 = new Card(Suit.SPADES, CardType.SEVEN);

    @Test
    public void test_getListDown() throws Exception {
        ArrayList<Card> testFaceDown = new ArrayList<>();
        testFaceDown.add(spadeAce);
        testFaceDown.add(spade2);
        testFaceDown.add(spade3);
        testFaceDown.add(spade4);
        testFaceDown.add(spade5);
        testFaceDown.add(spade6);

        assertEquals(playPile.getListOfDown(), testFaceDown);
    }

    @Test
    public void test_getListUp() throws Exception {
        ArrayList<Card> testFaceUp = new ArrayList<>();
        testFaceUp.add(spade7);

        assertEquals(playPile.getListOfUp(), testFaceUp);
    }

    @Test
    public void test_addCardsMany() throws Exception {
        Card heart6 = new Card(Suit.HEARTS, CardType.SIX);
        Card club5 = new Card(Suit.CLUBS, CardType.FIVE);
        Card heart4 = new Card(Suit.HEARTS, CardType.FOUR);

        ArrayList<Card> listToAdd = new ArrayList<>();
        listToAdd.add(heart6);
        listToAdd.add(club5);
        listToAdd.add(heart4);

        playPile.addCards(listToAdd);

        assertEquals(playPile.getListOfUp().size(), 4);
    }

    @Test
    public void test_addCardsOne() throws Exception {
        Card heart6 = new Card(Suit.HEARTS, CardType.SIX);

        ArrayList<Card> listToAdd = new ArrayList<>();
        listToAdd.add(heart6);

        playPile.addCards(listToAdd);

        assertEquals(playPile.getListOfUp().size(), 2);
    }

    @Test
    public void test_invalidSuitAdd() throws Exception {
        Card clubs6 = new Card(Suit.CLUBS, CardType.SIX);

        ArrayList<Card> listToAdd = new ArrayList<>();
        listToAdd.add(clubs6);

        playPile.addCards(listToAdd);

        assertEquals(playPile.getListOfUp().size(), 1);
    }

    @Test
    public void test_invalidTypeAdd() throws Exception {
        Card heart7 = new Card(Suit.HEARTS, CardType.SEVEN);

        ArrayList<Card> listToAdd = new ArrayList<>();
        listToAdd.add(heart7);

        playPile.addCards(listToAdd);

        assertEquals(playPile.getListOfUp().size(), 1);
    }

    @Test
    public void test_removeCardsMany() throws Exception {
        Card heart6 = new Card(Suit.HEARTS, CardType.SIX);
        Card club5 = new Card(Suit.CLUBS, CardType.FIVE);
        Card heart4 = new Card(Suit.HEARTS, CardType.FOUR);

        ArrayList<Card> listToAdd = new ArrayList<>();
        listToAdd.add(heart6);
        listToAdd.add(club5);
        listToAdd.add(heart4);

        playPile.addCards(listToAdd);

        playPile.setNumSelected(3);
        playPile.removeCards();

        assertEquals(playPile.getListOfUp().size(), 1);
    }

    @Test
    public void test_removeCardsOne() throws Exception {
        Card heart6 = new Card(Suit.HEARTS, CardType.SIX);
        Card club5 = new Card(Suit.CLUBS, CardType.FIVE);
        Card heart4 = new Card(Suit.HEARTS, CardType.FOUR);

        ArrayList<Card> listToAdd = new ArrayList<>();
        listToAdd.add(heart6);
        listToAdd.add(club5);
        listToAdd.add(heart4);

        playPile.addCards(listToAdd);

        playPile.setNumSelected(1);
        playPile.removeCards();

        assertEquals(playPile.getListOfUp().size(), 3);
    }

    @Test
    public void test_flipOver() throws Exception {
        playPile.setNumSelected(1);
        playPile.removeCards();

        playPile.setNumSelected(1);
        playPile.removeCards();

        assertEquals(playPile.getListOfUp().size(), 1);
        assertEquals(playPile.getListOfDown().size(), 4);
    }
    */
}
