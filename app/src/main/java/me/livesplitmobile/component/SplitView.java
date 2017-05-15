package me.livesplitmobile.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
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
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.split_view, this, true);
        final float scale = getContext().getResources().getDisplayMetrics().density;
        int pixels = (int) (30 * scale + 0.5f);
        setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, pixels));

        isCurrentSplit = false;
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
        ((TextView)findViewById(R.id.svName)).setText(name);
        TextView deltaTextView = (TextView)findViewById(R.id.svDelta);
        deltaTextView.setText(delta);
        deltaTextView.setTextColor(Colors.colorFromString(colorName));
        ((TextView)findViewById(R.id.svTime)).setText(time);
    }
}
