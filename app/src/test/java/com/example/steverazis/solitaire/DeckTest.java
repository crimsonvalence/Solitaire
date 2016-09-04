package com.example.steverazis.solitaire;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.test.mock.MockContext;

import com.example.steverazis.solitaire.Model.Card;
import com.example.steverazis.solitaire.Model.CardType;
import com.example.steverazis.solitaire.Model.Deck;
import com.example.steverazis.solitaire.Model.Suit;
import com.example.steverazis.solitaire.UI.SolitaireGame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class DeckTest {
    SolitaireGame testGame;
    Deck deck = new Deck(testGame);
    ArrayList<Card> testCards = new ArrayList<>();
    private Context context;

    @Before
    public void setUp() throws Exception {
        testGame = new SolitaireGame();
        context = testGame;
    }

    @Test
    public void test_deckSize() throws Exception {
        assertEquals(deck.getCards().size(), 52);
    }

    @Test
    public void test_containsSpadeAce() throws Exception {
        Card spadeAce = new Card(Suit.SPADES, CardType.ACE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_ace), 0, 0);
        assertTrue(deck.getCards().contains(spadeAce));
    }

    @Test
    public void test_containsDiamondKing() throws Exception {
        Card diamondKing = new Card(Suit.DIAMONDS, CardType.KING, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_king), 0, 0);
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
    public void test_containsOneOfAllCards() throws Exception {
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
        Card spadeAce = new Card(Suit.SPADES, CardType.ACE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_ace), 0, 0);
        Card spade2 = new Card(Suit.SPADES, CardType.TWO, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_2), 0, 0);
        Card spade3 = new Card(Suit.SPADES, CardType.THREE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_3), 0, 0);
        Card spade4 = new Card(Suit.SPADES, CardType.FOUR, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_4), 0, 0);
        Card spade5 = new Card(Suit.SPADES, CardType.FIVE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_5), 0, 0);
        Card spade6 = new Card(Suit.SPADES, CardType.SIX, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_6), 0, 0);
        Card spade7 = new Card(Suit.SPADES, CardType.SEVEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_7), 0, 0);
        Card spade8 = new Card(Suit.SPADES, CardType.EIGHT, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_8), 0, 0);
        Card spade9 = new Card(Suit.SPADES, CardType.NINE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_9), 0, 0);
        Card spade10 = new Card(Suit.SPADES, CardType.TEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_10), 0, 0);
        Card spadeJack = new Card(Suit.SPADES, CardType.JACK, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_jack), 0, 0);
        Card spadeQueen = new Card(Suit.SPADES, CardType.QUEEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_queen), 0, 0);
        Card spadeKing = new Card(Suit.SPADES, CardType.KING, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.spades_king), 0, 0);

        Card heartAce = new Card(Suit.HEARTS, CardType.ACE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_ace), 0, 0);
        Card heart2 = new Card(Suit.HEARTS, CardType.TWO, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_2), 0, 0);
        Card heart3 = new Card(Suit.HEARTS, CardType.THREE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_3), 0, 0);
        Card heart4 = new Card(Suit.HEARTS, CardType.FOUR, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_4), 0, 0);
        Card heart5 = new Card(Suit.HEARTS, CardType.FIVE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_5), 0, 0);
        Card heart6 = new Card(Suit.HEARTS, CardType.SIX, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_6), 0, 0);
        Card heart7 = new Card(Suit.HEARTS, CardType.SEVEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_7), 0, 0);
        Card heart8 = new Card(Suit.HEARTS, CardType.EIGHT, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_8), 0, 0);
        Card heart9 = new Card(Suit.HEARTS, CardType.NINE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_9), 0, 0);
        Card heart10 = new Card(Suit.HEARTS, CardType.TEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_10), 0, 0);
        Card heartJack = new Card(Suit.HEARTS, CardType.JACK, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_jack), 0, 0);
        Card heartQueen = new Card(Suit.HEARTS, CardType.QUEEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_queen), 0, 0);
        Card heartKing = new Card(Suit.HEARTS, CardType.KING, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.hearts_king), 0, 0);

        Card clubsAce = new Card(Suit.CLUBS, CardType.ACE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_ace), 0, 0);
        Card clubs2 = new Card(Suit.CLUBS, CardType.TWO, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_2), 0, 0);
        Card clubs3 = new Card(Suit.CLUBS, CardType.THREE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_3), 0, 0);
        Card clubs4 = new Card(Suit.CLUBS, CardType.FOUR, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_4), 0, 0);
        Card clubs5 = new Card(Suit.CLUBS, CardType.FIVE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_5), 0, 0);
        Card clubs6 = new Card(Suit.CLUBS, CardType.SIX, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_6), 0, 0);
        Card clubs7 = new Card(Suit.CLUBS, CardType.SEVEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_7), 0, 0);
        Card clubs8 = new Card(Suit.CLUBS, CardType.EIGHT, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_8), 0, 0);
        Card clubs9 = new Card(Suit.CLUBS, CardType.NINE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_9), 0, 0);
        Card clubs10 = new Card(Suit.CLUBS, CardType.TEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_10), 0, 0);
        Card clubsJack = new Card(Suit.CLUBS, CardType.JACK, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_jack), 0, 0);
        Card clubsQueen = new Card(Suit.CLUBS, CardType.QUEEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_queen), 0, 0);
        Card clubsKing = new Card(Suit.CLUBS, CardType.KING, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.clubs_king), 0, 0);

        Card diamondAce = new Card(Suit.DIAMONDS, CardType.ACE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_ace), 0, 0);
        Card diamond2 = new Card(Suit.DIAMONDS, CardType.TWO, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_2), 0, 0);
        Card diamond3 = new Card(Suit.DIAMONDS, CardType.THREE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_3), 0, 0);
        Card diamond4 = new Card(Suit.DIAMONDS, CardType.FOUR, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_4), 0, 0);
        Card diamond5 = new Card(Suit.DIAMONDS, CardType.FIVE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_5), 0, 0);
        Card diamond6 = new Card(Suit.DIAMONDS, CardType.SIX, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_6), 0, 0);
        Card diamond7 = new Card(Suit.DIAMONDS, CardType.SEVEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_7), 0, 0);
        Card diamond8 = new Card(Suit.DIAMONDS, CardType.EIGHT, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_8), 0, 0);
        Card diamond9 = new Card(Suit.DIAMONDS, CardType.NINE, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_9), 0, 0);
        Card diamond10 = new Card(Suit.DIAMONDS, CardType.TEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_10), 0, 0);
        Card diamondJack = new Card(Suit.DIAMONDS, CardType.JACK, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_jack), 0, 0);
        Card diamondQueen = new Card(Suit.DIAMONDS, CardType.QUEEN, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_queen), 0, 0);
        Card diamondKing = new Card(Suit.DIAMONDS, CardType.KING, BitmapFactory.decodeResource(testGame.getResources(), R.drawable.diamonds_king), 0, 0);

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
}
