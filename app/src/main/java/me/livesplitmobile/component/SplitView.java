package me.livesplitmobile.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import livesplitcore.SplitsComponent;
import me.livesplitmobile.Colors;
import me.livesplitmobile.R;

/**
 * Created by Cristobal on 5/14/2017.
 */

public class SplitView extends LinearLayout {

    public boolean isCurrentSplit;
    static final GradientDrawable currentSplitGradient = new GradientDrawable(
            GradientDrawable.Orientation.TOP_BOTTOM,
            new int[] {0xFF2e66d6, 0xFF163779});

    public SplitView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(
                attrs,
                R.styleable.SplitView, 0, 0
        );

        a.recycle();
        isCurrentSplit = false;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.split_view, this, true);
    }

    public SplitView(Context context) {
        this(context, null);
    }

    public void update(String name, String delta, String time, String colorName) {
        if(isCurrentSplit) {
            setBackground(currentSplitGradient);
        } else {
            setBackgroundColor(Color.TRANSPARENT);
        }
        ((TextView)getChildAt(0)).setText(name);
        TextView deltaTextView = (TextView)getChildAt(1);
        deltaTextView.setText(delta);
        deltaTextView.setTextColor(Colors.colorFromString(colorName));
        ((TextView)getChildAt(2)).setText(time);
    }
}
