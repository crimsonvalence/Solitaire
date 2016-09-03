package com.example.steverazis.solitaire.Model;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.steverazis.solitaire.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by SteveRazis on 16-08-23.
 */
public class TurnPile {
    protected ArrayList<Card> cards;
    private   ArrayList<Card> burnCards;

    private static Bitmap blackCardBack = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.black_cardback);

    private Bitmap leftSide;
    private Bitmap rightSide;

    private static int LEFT_X = 0;
    private static int LEFT_Y = 0;
    private static int RIGHT_X = blackCardBack.getWidth();
    private static int RIGHT_Y = blackCardBack.getHeight();

    public TurnPile(Deck deck) {
        cards = deck.getCards();
        burnCards = new ArrayList<>();
        shuffle();

        leftSide = blackCardBack;
        rightSide = null;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public ArrayList<Card> getBurnCards() {
        return burnCards;
    }

    public int getLeftX() {
        return LEFT_X;
    }

    public int getLeftY() {
        return LEFT_Y;
    }

    public int getRightX() {
        return RIGHT_X;
    }

    public int getRightY() {
        return RIGHT_Y;
    }


    //EFFECTS: turns 3 cards over (moves from cards to burn cards)
    //         if 0 > cards < 3, then flips the amount of cards left over
    //         if 0 cards in the cards list, then moves all cards from burn to cards list
    //         when moving all cards from burn to the cards list, last card in burn is first
    //         card in cards list
    public void turnOver() {
        int tempCards = cards.size();

        if (tempCards >= 3) {
            leftSide = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.black_cardback);

            burnCards.add(cards.get(0));
            burnCards.add(cards.get(1));
            burnCards.add(cards.get(2));
            cards.remove(0);
            cards.remove(0);
            cards.remove(0);
        }
        if (tempCards == 2) {
            leftSide = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.black_cardback);

            burnCards.add(cards.get(0));
            burnCards.add(cards.get(1));
            cards.remove(0);
            cards.remove(0);
        }
        if (tempCards == 1) {
            leftSide = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.black_cardback);

            burnCards.add(cards.get(0));
            cards.remove(0);
        }
        if (tempCards == 0) {
            leftSide = null;

            int i;
            for (i = burnCards.size(); i > 0; i--) {
                cards.add(burnCards.get(i - 1));
                burnCards.remove(burnCards.get(i - 1));
            }
        }
        rightSide = burnCards.get(0).getBitmap();
    }

    //EFFECTS: removes the top card from the burnCards list
    public void removeBurn() {
        if (burnCards.size() > 0) {
            burnCards.remove(0);
            rightSide = burnCards.get(0).getBitmap();
        }
    }

    // EFFECTS: randomly shuffles the cards in the "cards" list
    //          (NEED TO SHUFFLE BEFORE DEALING)
    public void shuffle() {
        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Collections.shuffle(cards);
    }

    //EFFECTS: Draws the TurnPile onto the canvas
    public void draw(Canvas canvas) {
        canvas.drawBitmap(leftSide, LEFT_X, LEFT_Y, null);
        int i;
        for(i = 0; i < cards.size(); i++) {
            cards.get(i).setX(LEFT_X);
            cards.get(i).setY(LEFT_Y);
        }
        canvas.drawBitmap(rightSide, RIGHT_X, RIGHT_Y, null);
        if (burnCards.size() > 0) {
            int j;
            for (j = 0; j < burnCards.size(); j++) {
                burnCards.get(j).setX(RIGHT_X);
                burnCards.get(j).setY(RIGHT_Y);
            }
        }

    }
}
