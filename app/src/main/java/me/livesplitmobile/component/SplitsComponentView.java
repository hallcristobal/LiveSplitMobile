package me.livesplitmobile.component;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import livesplitcore.SplitsComponent;
import livesplitcore.SplitsComponentState;
import livesplitcore.SplitsComponentStateRef;
import livesplitcore.Timer;
import me.livesplitmobile.MainActivity;
import me.livesplitmobile.R;

/**
 * Created by MidKnight on 5/14/2017.
 */

public class SplitsComponentView extends ListView implements IComponent {
    Timer timer;
    SplitsComponent component;
    Handler timerHandler;
    Runnable runnable;
    SplitsAdapter adapter;


    public SplitsComponentView(Context context, AttributeSet attr, Timer t, Handler handler) {
        super(context, attr);
        timer = t;
        timerHandler = handler;
        ArrayList<Split> splitArrayList = new ArrayList<Split>();
        adapter = new SplitsAdapter(context, splitArrayList);
        setAdapter(adapter);

        component = new SplitsComponent();
        component.setVisualSplitCount(12);
        setDivider(ResourcesCompat.getDrawable(getResources(), R.drawable.list_view_divider, null));
        runnable = new Runnable() {
            @Override
            public void run() {
                SplitsComponentState state = component.state(timer);
                update(state);
                state.close();
                timerHandler.postDelayed(runnable, MainActivity.INTERVAL);
            }
        };

    }

    public void run() {
        timerHandler.postDelayed(runnable, MainActivity.INTERVAL);
    }


    public Runnable getRunnable() {
        return runnable;
    }

    public void update(SplitsComponentStateRef state) {
        long split_count = state.len();
        boolean showIcons = false;

        while (adapter.getCount() < split_count) {
            adapter.add(new Split());
        }

        while (adapter.getCount() > split_count) {
            adapter.getItem(adapter.getCount() - 1);
        }

        for (int i = 0; i < split_count; i++) {
            Split sv = adapter.getItem(i);
            String iconChange = state.iconChange(i);

            if (iconChange != null) {
                if (iconChange.isEmpty()) {
                    sv.icon = null;
                } else {
                    byte[] decodedString = Base64.decode(iconChange.substring(13), Base64.DEFAULT);
                    sv.icon = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
                }
            }

            showIcons |= sv.icon != null;

            sv.isCurrentSplit = state.isCurrentSplit(i);
            sv.name = state.name(i);
            sv.delta = state.delta(i);
            sv.time = state.time(i);
            sv.colorName = state.color(i);
            sv.index = i;
        }

        for (int i = 0; i < split_count; i++) {
            adapter.getItem(i).showIconSpace = showIcons;
        }

        adapter.notifyDataSetChanged();
    }
}
