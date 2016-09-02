package com.example.steverazis.solitaire;

import com.example.steverazis.solitaire.Model.Card;
import com.example.steverazis.solitaire.Model.CardType;
import com.example.steverazis.solitaire.Model.Deck;
import com.example.steverazis.solitaire.Model.Suit;
import com.example.steverazis.solitaire.Model.TurnPile;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by SteveRazis on 16-08-24.
 */

public class TurnPileTest {
    /*
    Deck deck = new Deck();
    TurnPile turn = new TurnPile(deck);

    Card spadeAce = new Card(Suit.SPADES, CardType.ACE);
    Card spade2 = new Card(Suit.SPADES, CardType.TWO);
    Card spade3 = new Card(Suit.SPADES, CardType.THREE);
    Card spade4 = new Card(Suit.SPADES, CardType.FOUR);
    Card spade5 = new Card(Suit.SPADES, CardType.FIVE);
    Card spade6 = new Card(Suit.SPADES, CardType.SIX);
    Card spade7 = new Card(Suit.SPADES, CardType.SEVEN);

    @Test
    public void test_turnThreeOver() throws Exception {
        ArrayList<Card> testBurn = new ArrayList<>();
        testBurn.add(spadeAce);
        testBurn.add(spade2);
        testBurn.add(spade3);

        turn.turnOver();

        assertEquals(turn.getBurnCards(), testBurn);

    }

    @Test
    public void test_turnTwoOver() throws Exception {
        turn.turnOver(); //-3
        turn.turnOver(); //-6
        turn.turnOver(); //-9
        turn.turnOver(); //-12
        turn.turnOver(); //-15
        turn.turnOver(); //-18
        turn.turnOver(); //-21
        turn.turnOver(); //-24
        turn.turnOver(); //-27
        turn.turnOver(); //-30
        turn.turnOver(); //-33
        turn.turnOver(); //-36
        turn.turnOver(); //-39
        turn.turnOver(); //-42
        turn.turnOver(); //-45
        turn.turnOver(); //-48
        turn.turnOver(); //-51
        turn.turnOver(); //-52

        turn.removeBurn();   //now 51 cards
        turn.removeBurn();   //now 50 cards

        turn.turnOver(); //0

        turn.turnOver(); //-3
        turn.turnOver(); //-6
        turn.turnOver(); //-9
        turn.turnOver(); //-12
        turn.turnOver(); //-15
        turn.turnOver(); //-18
        turn.turnOver(); //-21
        turn.turnOver(); //-24
        turn.turnOver(); //-27
        turn.turnOver(); //-30
        turn.turnOver(); //-33
        turn.turnOver(); //-36
        turn.turnOver(); //-39
        turn.turnOver(); //-42
        turn.turnOver(); //-45
        turn.turnOver(); //-48

        turn.turnOver(); //-50

        assertEquals(turn.getCards().size(), 0);
        assertEquals(turn.getBurnCards().size(), 50);
    }

    @Test
    public void test_turnOneOver() throws Exception {
        turn.turnOver(); //-3
        turn.turnOver(); //-6
        turn.turnOver(); //-9
        turn.turnOver(); //-12
        turn.turnOver(); //-15
        turn.turnOver(); //-18
        turn.turnOver(); //-21
        turn.turnOver(); //-24
        turn.turnOver(); //-27
        turn.turnOver(); //-30
        turn.turnOver(); //-33
        turn.turnOver(); //-36
        turn.turnOver(); //-39
        turn.turnOver(); //-42
        turn.turnOver(); //-45
        turn.turnOver(); //-48
        turn.turnOver(); //-51

        turn.turnOver(); //-52

        assertEquals(turn.getCards().size(), 0);
        assertEquals(turn.getBurnCards().size(), 52);
    }

    @Test
    public void test_moveFromBurnToTurn() throws Exception {
        turn.turnOver(); //burn = 3
        turn.turnOver(); //burn = 6
        turn.turnOver(); //burn = 9
        turn.turnOver(); //burn = 12
        turn.turnOver(); //burn = 15
        turn.turnOver(); //burn = 18
        turn.turnOver(); //burn = 21
        turn.turnOver(); //burn = 24
        turn.turnOver(); //burn = 27
        turn.turnOver(); //burn = 30
        turn.turnOver(); //burn = 33
        turn.turnOver(); //burn = 36
        turn.turnOver(); //burn = 39
        turn.turnOver(); //burn = 42
        turn.turnOver(); //burn = 45
        turn.turnOver(); //burn = 48
        turn.turnOver(); //burn = 51
        turn.turnOver(); //-52

        turn.turnOver(); //0

        assertEquals(turn.getCards().size(), 52);
        assertEquals(turn.getBurnCards().size(), 0);
    }

    @Test
    public void test_removeBurn() throws Exception {
        turn.turnOver();
        turn.removeBurn();

        assertEquals(turn.getBurnCards().size(), 2);
    }
    */
}
