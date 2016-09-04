package com.example.steverazis.solitaire.Model;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.steverazis.solitaire.R;

import java.util.Stack;


//REPRESENTS: -1 of the 4 piles at the top-right in solitaire
//            -win condition is determined according to these
//            -note that the piles in this pile should all have the same x and y co-ordinates

public class EndPile {
    private Stack<Card>cardStack;
    private Suit allowed;
    private int x;
    private int y;
    private Bitmap bitmap;


    //CONSTRUCTOR
    public EndPile(Suit suit, int x, int y) {
        cardStack = new Stack<>();
        allowed = suit;
        this.x = x;
        this.y = y;

        switch(suit) {
            case SPADES:
                bitmap = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.spades);
                break;
            case HEARTS:
                bitmap = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.hearts);
                break;
            case CLUBS:
                bitmap = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.clubs);
                break;
            case DIAMONDS:
                bitmap = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.diamonds);
                break;
        }
    }

    //GETTERS
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Card getTopCard() {
        return cardStack.peek();
    }



    //EFFECTS: adds a card to the top of the cardStack if the card is the right suit and type
    public void addCard(Card card) {
        if (isSuitAllowed(card) && isValidType(card)) {
            cardStack.push(card);
            card.setX(x);
            card.setY(y);
        }
        if (cardStack.size() > 0) {
            bitmap = cardStack.peek().getBitmap();
        }
    }


    //EFFECTS: removes a card from the top of the stack, returns the card that was removed
    public Card removeCard() {
        return cardStack.pop();
    }


    //EFFECTS: returns true if the Suit of the given card is the same as the pile's suit
    //NOTE: HELPER METHOD FOR addCard()
    public boolean isSuitAllowed(Card card) {
        return card.getSuit().equals(allowed);
    }


    //EFFECTS: returns true if the the card is an acceptable type to be placed on top of the stack
    //         the card is accepted if it is one type above the top of the current stack
    //         an ace is accepted if the stack is empty
    //NOTE: HELPER METHOD FOR addCard()
    public boolean isValidType(Card card) {
        if (cardStack.isEmpty() && (card.getType() == CardType.ACE)) {
            return true;
        }
        else {
            Card top = cardStack.peek();
            switch (top.getType()) {
                case ACE:
                    if (card.getType() == CardType.TWO) {
                        return true;
                    }
                    break;
                case TWO:
                    if (card.getType() == CardType.THREE) {
                        return true;
                    }
                    break;
                case THREE:
                    if (card.getType() == CardType.FOUR) {
                        return true;
                    }
                    break;
                case FOUR:
                    if (card.getType() == CardType.FIVE) {
                        return true;
                    }
                    break;
                case FIVE:
                    if (card.getType() == CardType.SIX) {
                        return true;
                    }
                    break;
                case SIX:
                    if (card.getType() == CardType.SEVEN) {
                        return true;
                    }
                    break;
                case SEVEN:
                    if (card.getType() == CardType.EIGHT) {
                        return true;
                    }
                    break;
                case EIGHT:
                    if (card.getType() == CardType.NINE) {
                        return true;
                    }
                    break;
                case NINE:
                    if (card.getType() == CardType.TEN) {
                        return true;
                    }
                    break;
                case TEN:
                    if (card.getType() == CardType.JACK) {
                        return true;
                    }
                    break;
                case JACK:
                    if (card.getType() == CardType.QUEEN) {
                        return true;
                    }
                    break;
                case QUEEN:
                    if (card.getType() == CardType.KING) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }


    //EFFECTS: Draws the EndPile onto the canvas
    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmap, x, y, null);
    }


    //EFFECTS: returns true if the pile is complete (i.e., the stack is filled from ACE -> KING)
    public boolean isComplete() {
        return cardStack.peek().getType() == CardType.KING;
    }
}
