package me.livesplitmobile;

import android.content.Context;
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
import me.livesplitmobile.component.SplitsComponentView;
import me.livesplitmobile.component.TimerComponentView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    private Timer timer;
    private TimerComponentView tcv;
    private SplitsComponentView scv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        Context context = mainLayout.getContext();

        getWindow().setStatusBarColor(0xFF000000);

        createTimerInstance();

        tcv = new TimerComponentView(context, null, timer);
        tcv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1
        ));
        tcv.setGravity(Gravity.BOTTOM);

        scv = new SplitsComponentView(context, null, timer);

        mainLayout.addView(tcv, 0);
        mainLayout.addView(scv, 0);
        tcv.run();
        scv.run();

    }

    private void createTimerInstance() {
        Run run = new Run();
        run.setGameName("Breath of the Wild");
        run.setCategoryName("Any%");
        run.pushSegment(new Segment("Plateau"));
        run.pushSegment(new Segment("Ganondork"));

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
