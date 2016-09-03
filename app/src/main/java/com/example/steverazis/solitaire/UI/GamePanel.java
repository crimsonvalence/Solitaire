package com.example.steverazis.solitaire.UI;

import android.content.Context;
import android.content.res.Resources;
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

/**
 * Created by SteveRazis on 16-08-24.
 */
public class GamePanel extends SurfaceView implements SurfaceHolder.Callback {
//    MainThread thread;

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
    private int cardWidth = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.spades_ace).getWidth();
    private int cardHeight = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.spades_ace).getHeight();
    private static int OFFSET = 10;
    private ArrayList<Card> selected;

    public GamePanel(Context context) {
        super(context);
//        getHolder().addCallback(this);
//        thread = new MainThread(getHolder(), this);
        setFocusable(true);

        surfaceHolder = getHolder();
        deck = new Deck();
        turn = new TurnPile(deck);
        turn.shuffle();
    }

    public void setEndPiles(Canvas canvas) {
        spadeEndPile = new EndPile(Suit.SPADES, canvas.getWidth() - OFFSET, 0);
        heartsEndPile = new EndPile(Suit.HEARTS, canvas.getWidth() - (2*OFFSET) - cardWidth, 0);
        clubsEndPile = new EndPile(Suit.CLUBS, canvas.getWidth() - (2*OFFSET) - (2*cardWidth), 0);
        diamondEndPile = new EndPile(Suit.DIAMONDS, canvas.getWidth() - (3*OFFSET) - (3*cardWidth), 0);
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
            int i;
            for (i = 0; i < deck.getCards().size(); i++) {                                                                //PRESSES A CARD
                deck.getCards().get(i).handleActionDown((int) event.getX(), (int) event.getY());
            }
            if ((event.getX() >= turn.getLeftX() - cardWidth) && (event.getX() <= turn.getLeftX() + cardWidth)) {         //PRESSES THE TURN PILE
                if (((event.getY() >= turn.getLeftY() - cardHeight) && (event.getY() <= turn.getLeftY()))) {
                    turn.turnOver();
                }
            }
            if (selected.size() > 0) {                                                                                    //PRESSES THE BOTTOM OF A PLAY PILE WHILE A CARD IS SELECTED
                checkSelectPlay(event, play1);
                checkSelectPlay(event, play2);
                checkSelectPlay(event, play3);
                checkSelectPlay(event, play4);
                checkSelectPlay(event, play5);
                checkSelectPlay(event, play6);
                checkSelectPlay(event, play7);
            }
            if (selected.size() == 1) {
                if ((event.getX() >= spadeEndPile.getX() - cardWidth) && (event.getX() <= spadeEndPile.getX() + cardWidth)) {
                    if (((event.getY() >= spadeEndPile.getY() - cardHeight) && (event.getY() <= spadeEndPile.getY()))) {  //PRESSES THE SPADE END PILE WHILE A CARD IS SELECTED
                        spadeEndPile.addCard(selected.get(0));
                    }
                }
                if ((event.getX() >= heartsEndPile.getX() - cardWidth) && (event.getX() <= heartsEndPile.getX() + cardWidth)) {
                    if (((event.getY() >= heartsEndPile.getY() - cardHeight) && (event.getY() <= heartsEndPile.getY()))) {  //PRESSES THE HEARTS END PILE WHILE A CARD IS SELECTED
                        heartsEndPile.addCard(selected.get(0));
                    }
                }
                if ((event.getX() >= clubsEndPile.getX() - cardWidth) && (event.getX() <= clubsEndPile.getX() + cardWidth)) {
                    if (((event.getY() >= clubsEndPile.getY() - cardHeight) && (event.getY() <= clubsEndPile.getY()))) {   //PRESSES THE CLUBS END PILE WHILE A CARD IS SELECTED
                        clubsEndPile.addCard(selected.get(0));
                    }
                }
                if ((event.getX() >= diamondEndPile.getX() - cardWidth) && (event.getX() <= diamondEndPile.getX() + cardWidth)) {
                    if (((event.getY() >= diamondEndPile.getY() - cardHeight) && (event.getY() <= diamondEndPile.getY()))) {  //PRESSES THE DIAMOND END PILE WHILE A CARD IS SELECTED
                        diamondEndPile.addCard(selected.get(0));
                    }
                }
            }
        }
        updateCondition();
        checkWin();
        return true;
    }

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


//     STUFF FROM THREADING, NEED TO EDIT
    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
//        thread.setRunning(true);
//        thread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int format, int width, int height) {
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
//        // tell the thread to shut down and wait for it to finish
//        // this is a clean shutdown
//        boolean retry = true;
//        while (retry) {
//            try {
//                thread.join();
//                retry = false;
//            }
//            catch (InterruptedException e) {
//                //try again shutting down the thread
//            }
//        }
    }
}
