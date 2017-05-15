package me.livesplitmobile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

import livesplitcore.Run;
import livesplitcore.Segment;
import livesplitcore.Timer;
import android.view.ViewGroup.LayoutParams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import me.livesplitmobile.component.IComponent;
import me.livesplitmobile.component.SplitsComponentView;
import me.livesplitmobile.component.TimerComponentView;
import me.livesplitmobile.component.TitleComponentView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    private static  Timer timer;
    private static List<IComponent> components = new ArrayList<IComponent>();
    public static long INTERVAL = 1000/30;
    public static Handler runHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(0xFF000000);

        createTimerInstance();
        addComponents();
    }

    private void addComponents() {
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        Context context = mainLayout.getContext();

        TimerComponentView tcv = new TimerComponentView(context, null, timer, runHandler);
        tcv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1
        ));
        tcv.setGravity(Gravity.BOTTOM);
        mainLayout.addView(tcv, 0);
        components.add(tcv);


        SplitsComponentView scv = new SplitsComponentView(context, null, timer, runHandler);
        mainLayout.addView(scv, 0);
        components.add(scv);

        TitleComponentView titleComponentView = new TitleComponentView(context, null, timer, runHandler);
        mainLayout.addView(titleComponentView, 0);
        components.add(titleComponentView);

        for (IComponent c : components){
            c.run();
        }
    }

    private void createTimerInstance() {
        Run run = new Run();
        run.setGameName("The Legend of Zelda: The Wind Waker");
        run.setCategoryName("Any%");
        run.pushSegment(new Segment("Hero's Sword"));
        run.pushSegment(new Segment("Leaving Outset"));
        run.pushSegment(new Segment("Forsaken Fortress 1"));
        run.pushSegment(new Segment("Wind Waker"));
        run.pushSegment(new Segment("Empty Bottle"));
        run.pushSegment(new Segment("Delivery Bag"));
        run.pushSegment(new Segment("Kargaroc Key"));
        run.pushSegment(new Segment("Grappling Hook"));
        run.pushSegment(new Segment("Enter Gohma"));
        run.pushSegment(new Segment("Dragon Roost Cavern"));
        run.pushSegment(new Segment("Northern Triangle"));
        run.pushSegment(new Segment("Greatfish"));

        timer = new Timer(run);
    }

    public void startSplitClicked(View view) {
        timer.split();
    }

    public void resetClicked(View view) {
        timer.reset(true);
    }

    public void undoClicked(View view) {
        timer.undoSplit();
    }

    public void skipClicked(View view) {
        timer.skipSplit();
    }

    public void pauseClicked(View view) {
        timer.pause();
    }
}
