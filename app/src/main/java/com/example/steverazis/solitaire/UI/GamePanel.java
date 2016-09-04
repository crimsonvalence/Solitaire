package com.example.steverazis.solitaire.UI;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.example.steverazis.solitaire.Model.Card;
import com.example.steverazis.solitaire.Model.Deck;
import com.example.steverazis.solitaire.Model.EndPile;
import com.example.steverazis.solitaire.Model.PlayPile;
import com.example.steverazis.solitaire.Model.Suit;
import com.example.steverazis.solitaire.Model.TurnPile;
import com.example.steverazis.solitaire.R;

import java.util.ArrayList;


public class GamePanel extends SurfaceView implements SurfaceHolder.Callback {

    private SurfaceHolder surfaceHolder;
    private Deck deck;
    private TurnPile turn;
    private EndPile spadeEndPile;
    private EndPile heartsEndPile;
    private EndPile clubsEndPile;
    private EndPile diamondEndPile;
    private PlayPile play1;
    private PlayPile play2;
    private PlayPile play3;
    private PlayPile play4;
    private PlayPile play5;
    private PlayPile play6;
    private PlayPile play7;
    private int cardWidth = BitmapFactory.decodeResource(this.getResources(), R.drawable.spades_ace).getWidth();
    private int cardHeight = BitmapFactory.decodeResource(this.getResources(), R.drawable.spades_ace).getHeight();
    private static int OFFSET = 10;
    private ArrayList<Card> selected;


    //CONSTRUCTOR
    public GamePanel(Context context) {
        super(context);
        setFocusable(true);

        surfaceHolder = getHolder();
        deck = new Deck(this.getContext());
        turn = new TurnPile(deck);
        turn.shuffle();
    }


    //SETTERS
    public void setEndPiles(Canvas canvas) {
        spadeEndPile = new EndPile(this.getContext(), Suit.SPADES, canvas.getWidth() - OFFSET, 0);
        heartsEndPile = new EndPile(this.getContext(), Suit.HEARTS, canvas.getWidth() - (2*OFFSET) - cardWidth, 0);
        clubsEndPile = new EndPile(this.getContext(), Suit.CLUBS, canvas.getWidth() - (2*OFFSET) - (2*cardWidth), 0);
        diamondEndPile = new EndPile(this.getContext(), Suit.DIAMONDS, canvas.getWidth() - (3*OFFSET) - (3*cardWidth), 0);
    }

    public void setPlayPiles(Canvas canvas) {
        play1 = new PlayPile(turn, 0, 1, (canvas.getWidth() + OFFSET), (canvas.getHeight() + cardHeight + OFFSET));
        play2 = new PlayPile(turn, 1, 1, (canvas.getWidth() +    cardWidth  + (2*OFFSET)), (canvas.getHeight() + cardHeight + OFFSET));
        play3 = new PlayPile(turn, 2, 1, (canvas.getWidth() + (2*cardWidth) + (3*OFFSET)), (canvas.getHeight() + cardHeight + OFFSET));
        play4 = new PlayPile(turn, 3, 1, (canvas.getWidth() + (3*cardWidth) + (4*OFFSET)), (canvas.getHeight() + cardHeight + OFFSET));
        play5 = new PlayPile(turn, 4, 1, (canvas.getWidth() + (4*cardWidth) + (5*OFFSET)), (canvas.getHeight() + cardHeight + OFFSET));
        play6 = new PlayPile(turn, 5, 1, (canvas.getWidth() + (5*cardWidth) + (6*OFFSET)), (canvas.getHeight() + cardHeight + OFFSET));
        play7 = new PlayPile(turn, 6, 1, (canvas.getWidth() + (6*cardWidth) + (7*OFFSET)), (canvas.getHeight() + cardHeight + OFFSET));
    }



    //EFFECTS: returns true if all of the endpiles have all of the cards
    public boolean checkWin() {
        return spadeEndPile.isComplete() &&
                heartsEndPile.isComplete() &&
                clubsEndPile.isComplete() &&
                diamondEndPile.isComplete();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {

            //TODO: NEED TO ADD FUNCTIONALITY FOR MULTI-SELECT IN PLAY PILES

            //PRESSES A CARD
            int i;
            for (i = 0; i < deck.getCards().size(); i++) {
                deck.getCards().get(i).handleActionDown((int) event.getX(), (int) event.getY());
            }

            //PRESSES THE TURN PILE
            if ((event.getX() >= turn.getLeftX() - cardWidth) && (event.getX() <= turn.getLeftX() + cardWidth)) {
                if (((event.getY() >= turn.getLeftY() - cardHeight) && (event.getY() <= turn.getLeftY()))) {
                    turn.turnOver();
                }
            }

            //PRESSES A PLAY PILE WHILE A CARD IS SELECTED
            if (selected.size() > 0) {
                checkSelectPlay(event, play1, selected);
                checkSelectPlay(event, play2, selected);
                checkSelectPlay(event, play3, selected);
                checkSelectPlay(event, play4, selected);
                checkSelectPlay(event, play5, selected);
                checkSelectPlay(event, play6, selected);
                checkSelectPlay(event, play7, selected);
            }


            //PRESSES END PILES WHILE CARD IS SELECTED
            if (selected.size() == 1) {
                //SPADE END PILE
                if ((event.getX() >= spadeEndPile.getX() - cardWidth) && (event.getX() <= spadeEndPile.getX() + cardWidth)) {
                    if (((event.getY() >= spadeEndPile.getY() - cardHeight) && (event.getY() <= spadeEndPile.getY()))) {
                        spadeEndPile.addCard(selected.get(0));
                    }
                }
                //HEARTS END PILE
                if ((event.getX() >= heartsEndPile.getX() - cardWidth) && (event.getX() <= heartsEndPile.getX() + cardWidth)) {
                    if (((event.getY() >= heartsEndPile.getY() - cardHeight) && (event.getY() <= heartsEndPile.getY()))) {
                        heartsEndPile.addCard(selected.get(0));
                    }
                }
                //CLUBS END PILE
                if ((event.getX() >= clubsEndPile.getX() - cardWidth) && (event.getX() <= clubsEndPile.getX() + cardWidth)) {
                    if (((event.getY() >= clubsEndPile.getY() - cardHeight) && (event.getY() <= clubsEndPile.getY()))) {
                        clubsEndPile.addCard(selected.get(0));
                    }
                }
                //DIAMONDS END PILE
                if ((event.getX() >= diamondEndPile.getX() - cardWidth) && (event.getX() <= diamondEndPile.getX() + cardWidth)) {
                    if (((event.getY() >= diamondEndPile.getY() - cardHeight) && (event.getY() <= diamondEndPile.getY()))) {
                        diamondEndPile.addCard(selected.get(0));
                    }
                }
            }
        }
        updateCondition();
        checkWin();
        return true;
    }

    //EFFECT: Add card to bottom of playPile (IN CORRECT ORDER) if event is pressing playPile and card is valid
    //NOTE: Helper method for onTouchEvent(), in the "presses play pile" section
    private void checkSelectPlay(MotionEvent event, PlayPile playPile, ArrayList<Card> cards) {
        if ((event.getX() >= playPile.getX() - cardWidth) && (event.getX() <= playPile.getX() + cardWidth)) {
            if (((event.getY() >= playPile.getY() - cardHeight) && (event.getY() <= playPile.getY()))) {
                playPile.addCards(cards);
            }
        }
    }

    //EFFECTS: Updates the selected list with all the cards that are selected
    //POSSIBLE ISSUE: adding to the selected list might take the card from a list it should stay in
    //TODO: fix this method

    private void updateCondition() {
        selected = new ArrayList<>();
        int i;
        for(i = 0; i<deck.getCards().size(); i++) {
            if (deck.getCards().get(i).getTouched()) {
                selected.add(deck.getCards().get(i));
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.GREEN);
        setEndPiles(canvas);
        setPlayPiles(canvas);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int format, int width, int height) {
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
