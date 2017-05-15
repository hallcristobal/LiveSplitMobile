package me.livesplitmobile.component;

import android.os.Handler;

/**
 * Created by MidKnight on 5/15/2017.
 */

public interface IComponent {
    Runnable getRunnable();
    void run();
}
