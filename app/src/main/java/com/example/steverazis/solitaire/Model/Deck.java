package com.example.steverazis.solitaire.Model;

import android.content.Context;
import android.graphics.BitmapFactory;

import com.example.steverazis.solitaire.R;

import java.util.ArrayList;


//REPRESENTS: -a common 52 card deck (with no jokers)

public class Deck {
    private ArrayList<Card> cards;
    private Context context;

    //CONSTRUCTOR
    public Deck(Context context) {
        this.context = context;
        genDeck();
    }


    //GETTERS
    public Context getContext(){
        return context;
    }
    public ArrayList<Card> getCards(){
        return cards;
    }


    //EFFECT: Generates a standard deck of 52 cards with no jokers
    private void genDeck() {
        cards = new ArrayList<>();

        Card spadeAce = new Card(Suit.SPADES, CardType.ACE, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_ace), 50, 50);
        cards.add(spadeAce);
        Card spade2 = new Card(Suit.SPADES, CardType.TWO, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_2), 50, 50);
        cards.add(spade2);
        Card spade3 = new Card(Suit.SPADES, CardType.THREE, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_3), 50, 50);
        cards.add(spade3);
        Card spade4 = new Card(Suit.SPADES, CardType.FOUR, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_4), 50, 50);
        cards.add(spade4);
        Card spade5 = new Card(Suit.SPADES, CardType.FIVE, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_5), 50, 50);
        cards.add(spade5);
        Card spade6 = new Card(Suit.SPADES, CardType.SIX, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_6), 50, 50);
        cards.add(spade6);
        Card spade7 = new Card(Suit.SPADES, CardType.SEVEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_7), 50, 50);
        cards.add(spade7);
        Card spade8 = new Card(Suit.SPADES, CardType.EIGHT, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_8), 50, 50);
        cards.add(spade8);
        Card spade9 = new Card(Suit.SPADES, CardType.NINE, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_9), 50, 50);
        cards.add(spade9);
        Card spade10 = new Card(Suit.SPADES, CardType.TEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_10), 50, 50);
        cards.add(spade10);
        Card spadeJack = new Card(Suit.SPADES, CardType.JACK, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_jack), 50, 50);
        cards.add(spadeJack);
        Card spadeQueen = new Card(Suit.SPADES, CardType.QUEEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_queen), 50, 50);
        cards.add(spadeQueen);
        Card spadeKing = new Card(Suit.SPADES, CardType.KING, BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_king), 50, 50);

        cards.add(spadeKing);
        Card heartAce = new Card(Suit.HEARTS, CardType.ACE, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_ace), 50, 50);
        cards.add(heartAce);
        Card heart2 = new Card(Suit.HEARTS, CardType.TWO, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_2), 50, 50);
        cards.add(heart2);
        Card heart3 = new Card(Suit.HEARTS, CardType.THREE, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_3), 50, 50);
        cards.add(heart3);
        Card heart4 = new Card(Suit.HEARTS, CardType.FOUR, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_4), 50, 50);
        cards.add(heart4);
        Card heart5 = new Card(Suit.HEARTS, CardType.FIVE, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_5), 50, 50);
        cards.add(heart5);
        Card heart6 = new Card(Suit.HEARTS, CardType.SIX, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_6), 50, 50);
        cards.add(heart6);
        Card heart7 = new Card(Suit.HEARTS, CardType.SEVEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_7), 50, 50);
        cards.add(heart7);
        Card heart8 = new Card(Suit.HEARTS, CardType.EIGHT, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_8), 50, 50);
        cards.add(heart8);
        Card heart9 = new Card(Suit.HEARTS, CardType.NINE, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_9), 50, 50);
        cards.add(heart9);
        Card heart10 = new Card(Suit.HEARTS, CardType.TEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_10), 50, 50);
        cards.add(heart10);
        Card heartJack = new Card(Suit.HEARTS, CardType.JACK, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_jack), 50, 50);
        cards.add(heartJack);
        Card heartQueen = new Card(Suit.HEARTS, CardType.QUEEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_queen), 50, 50);
        cards.add(heartQueen);
        Card heartKing = new Card(Suit.HEARTS, CardType.KING, BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_king), 50, 50);
        cards.add(heartKing);

        Card clubsAce = new Card(Suit.CLUBS, CardType.ACE, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_ace), 50, 50);
        cards.add(clubsAce);
        Card clubs2 = new Card(Suit.CLUBS, CardType.TWO, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_2), 50, 50);
        cards.add(clubs2);
        Card clubs3 = new Card(Suit.CLUBS, CardType.THREE, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_3), 50, 50);
        cards.add(clubs3);
        Card clubs4 = new Card(Suit.CLUBS, CardType.FOUR, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_4), 50, 50);
        cards.add(clubs4);
        Card clubs5 = new Card(Suit.CLUBS, CardType.FIVE, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_5), 50, 50);
        cards.add(clubs5);
        Card clubs6 = new Card(Suit.CLUBS, CardType.SIX, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_6), 50, 50);
        cards.add(clubs6);
        Card clubs7 = new Card(Suit.CLUBS, CardType.SEVEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_7), 50, 50);
        cards.add(clubs7);
        Card clubs8 = new Card(Suit.CLUBS, CardType.EIGHT, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_8), 50, 50);
        cards.add(clubs8);
        Card clubs9 = new Card(Suit.CLUBS, CardType.NINE, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_9), 50, 50);
        cards.add(clubs9);
        Card clubs10 = new Card(Suit.CLUBS, CardType.TEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_10), 50, 50);
        cards.add(clubs10);
        Card clubsJack = new Card(Suit.CLUBS, CardType.JACK, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_jack), 50, 50);
        cards.add(clubsJack);
        Card clubsQueen = new Card(Suit.CLUBS, CardType.QUEEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_queen), 50, 50);
        cards.add(clubsQueen);
        Card clubsKing = new Card(Suit.CLUBS, CardType.KING, BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_king), 50, 50);
        cards.add(clubsKing);

        Card diamondAce = new Card(Suit.DIAMONDS, CardType.ACE, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_ace), 50, 50);
        cards.add(diamondAce);
        Card diamond2 = new Card(Suit.DIAMONDS, CardType.TWO, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_2), 50, 50);
        cards.add(diamond2);
        Card diamond3 = new Card(Suit.DIAMONDS, CardType.THREE, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_3), 50, 50);
        cards.add(diamond3);
        Card diamond4 = new Card(Suit.DIAMONDS, CardType.FOUR, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_4), 50, 50);
        cards.add(diamond4);
        Card diamond5 = new Card(Suit.DIAMONDS, CardType.FIVE, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_5), 50, 50);
        cards.add(diamond5);
        Card diamond6 = new Card(Suit.DIAMONDS, CardType.SIX, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_6), 50, 50);
        cards.add(diamond6);
        Card diamond7 = new Card(Suit.DIAMONDS, CardType.SEVEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_7), 50, 50);
        cards.add(diamond7);
        Card diamond8 = new Card(Suit.DIAMONDS, CardType.EIGHT, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_8), 50, 50);
        cards.add(diamond8);
        Card diamond9 = new Card(Suit.DIAMONDS, CardType.NINE, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_9), 50, 50);
        cards.add(diamond9);
        Card diamond10 = new Card(Suit.DIAMONDS, CardType.TEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_10), 50, 50);
        cards.add(diamond10);
        Card diamondJack = new Card(Suit.DIAMONDS, CardType.JACK, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_jack), 50, 50);
        cards.add(diamondJack);
        Card diamondQueen = new Card(Suit.DIAMONDS, CardType.QUEEN, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_queen), 50, 50);
        cards.add(diamondQueen);
        Card diamondKing = new Card(Suit.DIAMONDS, CardType.KING, BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_king), 50, 50);
        cards.add(diamondKing);
    }

}
