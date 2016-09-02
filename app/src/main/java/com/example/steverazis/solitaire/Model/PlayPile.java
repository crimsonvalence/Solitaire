package com.example.steverazis.solitaire.Model;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.steverazis.solitaire.R;

import java.util.ArrayList;

/**
 * Created by SteveRazis on 16-08-23.
 */
public class PlayPile {
    ArrayList<Card> listOfDown;
    ArrayList<Card> listOfUp;

    private int numSelected;
    private static int OFFSET = 20;
    private int x;
    private int y;
    private Bitmap blackCardBack = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.black_cardback);

    public PlayPile(TurnPile turn, int faceDown, int faceUp, int x, int y) {
        numSelected = 0;

        listOfDown = new ArrayList<>();
        listOfUp = new ArrayList<>();

        this.x = x;
        this.y = y;

        int i;
        for(i = 0; i < faceDown; i++) {
            listOfDown.add(turn.getCards().get(i));
        }
        while (i > 0) {
            turn.cards.remove(0);
            i--;
        }

        int j;
        for(j = 0; j < faceUp; j++) {
            listOfUp.add(turn.getCards().get(j));
        }
        while (j > 0) {
            turn.cards.remove(0);
            j--;
        }
    }

    public ArrayList<Card> getListOfDown() {
        return listOfDown;
    }

    public ArrayList<Card> getListOfUp() {
        return listOfUp;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //EFFECTS: adds cards to the front of the arraylist (the top of the cards)
    //ADD FUNCTIONALITY: ADDS CARD BITMAP A LITTLE WAYS DOWN THE INITIAL ONE
    public void addCards(ArrayList<Card> cards) {
        int i;
        if (isValidGroup(cards)) {
            for(i = 0; i < cards.size(); i++) {
              listOfUp.add(cards.get(i));
            }
        }
    }

    //EFFECTS: removes cards from the front of the array list (the top of the cards)
    public ArrayList<Card> removeCards() {
        ArrayList<Card> toReturn = new ArrayList<>();
        int i;

        for(i = numSelected; i > 0; i--) {
            toReturn.add(listOfUp.get(i - 1));
            listOfUp.remove(i - 1);
        }
        if (listOfUp.size() == 0 && listOfDown.size() > 0) {
            flipOver();
        }
        return toReturn;
    }

    //EFFECTS: returns true if the end of the list of cards contains a card that can be placed
    //         at the front of the PlayPile
    //NOTE:    if the listOfUp is empty, then it will accept any cards
    private boolean isValidGroup(ArrayList<Card> cards) {
        if (listOfUp.size() == 0 && listOfDown.size() == 0) {
            return true;
        }
        return (cards.get(cards.size() - 1).getColour() != listOfUp.get(0).getColour()) &&
                (cards.get(0).getType().getValue() == listOfUp.get(0).getType().getValue() - 1);
    }

    //EFFECTS: moves the top card from the listOfDown to the listOfUp if the ListOfUp is empty
    //NOTE:    if both lists are empty then leave it that way (addCards() will handle that)
    private void flipOver() {
        if (listOfUp.size() == 0 && listOfDown.size() != 0) {
            listOfUp.add(listOfDown.get(0));
            listOfDown.remove(0);
        }
    }

    //EFFECTS: if a card is selected, then every card below it (or ahead of it in the list) is selected as well
    //         -also increments numSelected according to how many are selected (may need to call this to test if
    //          just one is selected
    public void multiSelect() {
        int i;
        for (i=0; i<listOfUp.size(); i++) {
            if (listOfUp.get(i).getTouched() && i > 0) {
                numSelected = 1;
                int j;
                for (j = 0; j<i; j++) {
                    listOfUp.get(j).setTouched(true);
                    numSelected++;
                }
            }
        }
    }

    //EFFECTS: draws the play pile on canvas, listOfUp cards are face-up and below listOfDown cards, which are face-down
    //         -cards are separated by the OFFSET variable
    public void draw(Canvas canvas) {
        int i;
        int j;
        for(i = 0; i<listOfDown.size(); i++) {
            if(i == 0) {
                canvas.drawBitmap(blackCardBack, x, y, null);
            }
            canvas.drawBitmap(blackCardBack, x, (y + i*OFFSET), null);
        }
        for(j = 0; j<listOfUp.size(); j++) {
            if (i == 0) {
                canvas.drawBitmap(listOfUp.get(j).getBitmap(), x, y, null);
            }
            canvas.drawBitmap(listOfUp.get(j).getBitmap(), x, (y + (i+j)*OFFSET), null);
        }
    }
}