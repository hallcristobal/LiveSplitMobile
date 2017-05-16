package me.livesplitmobile.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import livesplitcore.PreviousSegmentComponent;

/**
 * Created by MidKnight on 5/15/2017.
 */

public class PreviousSegmentView extends LinearLayout implements IComponent {
    PreviousSegmentComponent component;
    Runnable runnable;
    public PreviousSegmentView(Context context, AttributeSet attr) {
        super(context, attr);

    }

    public void run() {

    }

    public Runnable getRunnable() {
        return runnable;
    }
}
