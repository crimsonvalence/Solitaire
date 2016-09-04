package com.example.steverazis.solitaire.Model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;


//REPRESENTS: -a typical card in a deck
//            -handleActionDown is in this method for all cards

public class Card {
    private int colour; //0 is black, 1 is red
    private Suit suit;
    private CardType type;

    private Bitmap bitmap;
    private int x;
    private int y;
    private boolean touched;


    //CONSTRUCTOR
    public Card(Suit suit, CardType type, Bitmap bitmap, int x, int y) {
        this.suit = suit;
        this.type = type;
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
        touched = false;

        if (suit.equals(Suit.SPADES) || suit.equals(Suit.CLUBS)) {
            colour = 0;
        }
        else colour = 1;
    }


    //GETTERS AND SETTERS
    /*
    NOTE: 0 = black,   1 = red
    Effects: returns the colour of the card
     */
    public int getColour() {
        return colour;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardType getType() {
        return type;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean getTouched() {
        return touched;
    }

    public void setTouched(boolean touched) {
        this.touched = touched;
    }


    //EFFECT: draws the card onto the given canvas
    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmap, x - (bitmap.getWidth() / 2), y - (bitmap.getHeight() / 2), null);
    }

    //EFFECT: if eventX and eventY are within the bounds of a cards x and y co-ordinates, then select it
    //NOTE:   touching twice does not de-select it
    public void handleActionDown(int eventX, int eventY) {
        if ((eventX >= (x - bitmap.getWidth() / 2)) && (eventX <= (x + bitmap.getWidth() / 2))) {
            if ((eventY >= (y - bitmap.getHeight() / 2)) && (eventY <= (y + bitmap.getHeight() / 2))) {
                setTouched(true);
            }
            else setTouched(false);
        }
        else setTouched(false);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (colour != card.getColour()) return false;
        if (suit != card.getSuit()) return false;
        return type == card.getType();

    }

    @Override
    public int hashCode() {
        int result = colour;
        result = 31 * result + suit.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
