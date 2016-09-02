package com.example.steverazis.solitaire.UI;

import android.graphics.Canvas;
import android.nfc.Tag;
import android.util.Log;
import android.view.SurfaceHolder;

/**
 * Created by SteveRazis on 16-08-29.
 */
public class MainThread extends Thread {

    private static final String TAG = MainThread.class.getSimpleName();

    private SurfaceHolder surfaceHolder;
    private GamePanel gamePanel;
    private boolean running;

    public MainThread(SurfaceHolder surfaceHolder, GamePanel gamePanel) {
        super();
        this.surfaceHolder = surfaceHolder;
        this.gamePanel = gamePanel;
    }

        public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run() {
        Canvas canvas;
        Log.d(TAG, "Starting game loop");

        while(running) {
            canvas = null;
            try {
                canvas = this.surfaceHolder.lockCanvas();
                synchronized (surfaceHolder) {
                    this.gamePanel.draw(canvas); //MAY NEED ONDRAW NOT DRAW
                }
            }
                finally {
                    if (canvas != null) {
                        surfaceHolder.unlockCanvasAndPost(canvas);
                    }
                }
        }
    }


        /*
        super.run();
        long tickCount = 0L;
        Log.d(TAG, "Starting game loop");
        while(running) {
            tickCount++;
            //update game state
            //render state to screen
        }
        Log.d(TAG, "Game loop executed " + tickCount + " times");
    }
    */
}
