package me.livesplitmobile.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import livesplitcore.Timer;
import livesplitcore.TitleComponent;
import livesplitcore.TitleComponentState;
import livesplitcore.TitleComponentStateRef;
import me.livesplitmobile.MainActivity;
import me.livesplitmobile.R;

/**
 * Created by MidKnight on 5/15/2017.
 */

public class TitleComponentView extends LinearLayout implements IComponent {
    Handler runHandler;
    Timer timer;
    Runnable runnable;
    TitleComponent component;

    public TitleComponentView(Context context, AttributeSet attr, final Timer timer, Handler handler) {
        super(context, attr);

        this.timer = timer;
        runHandler = handler;
        component = new TitleComponent();

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.title_view, this, true);

        runnable = new Runnable() {
            @Override
            public void run() {
                TitleComponentState state = component.state(timer);
                update(state);
                state.close();
                runHandler.postDelayed(runnable, MainActivity.INTERVAL);
            }
        };
    }

    public void run() {
        runHandler.postDelayed(runnable, MainActivity.INTERVAL);
    }

    public void update(TitleComponentStateRef state) {
        String iconChange = state.iconChange();
        if (iconChange != null) {
            byte[] decodedString = Base64.decode(iconChange.substring(13), Base64.DEFAULT);
            Bitmap bitMap = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
            ((ImageView)findViewById(R.id.imageView)).setImageBitmap(bitMap);
        }
        ((TextView)findViewById(R.id.tvGameTitle)).setText(state.game());
        ((TextView)findViewById(R.id.tvGameCategory)).setText(state.category());
        ((TextView)findViewById(R.id.tvAttemptCount)).setText(String.valueOf(state.attempts()));
    }

    public Runnable getRunnable() {
        return runnable;
    }

}
