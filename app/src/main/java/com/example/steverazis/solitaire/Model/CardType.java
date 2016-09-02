package com.example.steverazis.solitaire.Model;

/**
 * Created by SteveRazis on 16-08-23.
 */

/*
Represents the type of a card
        (ACE   = 1
         JACK  = 11
         QUEEN = 12
         KING  = 13)
 */
public enum CardType {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private int value; //the integer value of a card's number

    CardType(int value) {
        this.value = value;
    }

    // Get the value of this card
    // EFFECTS: returns the integer value of this card
    public int getValue() {
        return value;
    }
}
