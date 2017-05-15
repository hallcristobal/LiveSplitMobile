package me.livesplitmobile.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by MidKnight on 5/14/2017.
 */

public class SplitsAdapter extends ArrayAdapter<Split> {
    public SplitsAdapter(Context context, ArrayList<Split> splits){
        super(context, 0, splits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Split split = getItem(position);

        if(convertView == null) {
            convertView = new SplitView(getContext(), null);
        }

        SplitView sv = (SplitView)convertView;
        sv.isCurrentSplit = split.isCurrentSplit;
        sv.update(split.name, split.delta, split.time, split.colorName);

        return sv;
    }
}
