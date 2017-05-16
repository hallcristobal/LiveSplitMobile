package me.livesplitmobile.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import livesplitcore.SplitsComponent;
import me.livesplitmobile.Colors;
import me.livesplitmobile.R;

/**
 * Created by Cristobal on 5/14/2017.
 */

public class SplitView extends LinearLayout {

    static final GradientDrawable currentSplitGradient = new GradientDrawable(
            GradientDrawable.Orientation.TOP_BOTTOM,
            new int[] {0xFF2e66d6, 0xFF163779});
    final float scale = getContext().getResources().getDisplayMetrics().density;
    public int height;

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


        height = (int) (31.2 * scale + 0.5f);
        setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));

    }

    public SplitView(Context context) {
        this(context, null);
    }

    public void update(Split split) {
        ImageView imageView = ((ImageView) findViewById(R.id.svImage));
        if(split.showIconSpace) {
            imageView.setImageBitmap(split.icon);
            int pixels = (int) (30 * scale + 0.5f);
            imageView.setLayoutParams(new LayoutParams(pixels, ViewGroup.LayoutParams.MATCH_PARENT, .07f));
        } else {
            imageView.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT, 0f));
        }

        if(split.isCurrentSplit) {
            setBackground(currentSplitGradient);
        } else {
            if(split.index % 2 == 0) {
                setBackgroundColor(Color.TRANSPARENT);
            } else {
                setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.split_border, null));
            }
        }

        TextView nameTextView = ((TextView)findViewById(R.id.svName));
        nameTextView.setText(split.name);

        TextView deltaTextView = (TextView)findViewById(R.id.svDelta);
        deltaTextView.setText(split.delta);
        deltaTextView.setTextColor(Colors.colorFromString(split.colorName));
        ((TextView)findViewById(R.id.svTime)).setText(split.time);
    }
}
