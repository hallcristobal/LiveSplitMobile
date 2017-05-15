package me.livesplitmobile.component;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import livesplitcore.SplitsComponent;
import livesplitcore.SplitsComponentState;
import livesplitcore.SplitsComponentStateRef;
import livesplitcore.Timer;
import me.livesplitmobile.R;

/**
 * Created by MidKnight on 5/14/2017.
 */

public class SplitsComponentView extends ListView {
    Timer timer;
    SplitsComponent component;
    Handler timerHandler = new Handler();
    Runnable runnable;
    SplitsAdapter adapter;

    public SplitsComponentView(Context context, AttributeSet attr,Timer t){
        super(context, attr);
        timer = t;

        ArrayList<Split> splitArrayList = new ArrayList<Split>();
        adapter = new SplitsAdapter(context, splitArrayList);
        setAdapter(adapter);

        component = new SplitsComponent();
        runnable = new Runnable() {
            @Override
            public void run() {
                SplitsComponentState state = component.state(timer);
                update(state);
                state.close();
                timerHandler.postDelayed(runnable, 1000/30);
            }
        };
    }

    public void run() {
        timerHandler.postDelayed(runnable, 1000/30);
    }

    public void update(SplitsComponentStateRef state) {
        long split_count = state.len();

        while(adapter.getCount() < split_count) {
            adapter.add(new Split());
        }

        while(adapter.getCount() > split_count){
            adapter.getItem(adapter.getCount() - 1);
        }

        for(int i = 0; i < split_count; i++) {
            Split sv = adapter.getItem(i);
            sv.isCurrentSplit = state.isCurrentSplit(i);
            sv.name = state.name(i);
            sv.delta = state.delta(i);
            sv.time = state.time(i);
            sv.colorName = state.color(i);
        }

        adapter.notifyDataSetChanged();
    }
}
