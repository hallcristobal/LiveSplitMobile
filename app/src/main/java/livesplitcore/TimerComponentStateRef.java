package livesplitcore;

public class TimerComponentStateRef {
    long ptr;
    public String time() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.TimerComponentState_time(this.ptr);
        return result;
    }
    public String fraction() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.TimerComponentState_fraction(this.ptr);
        return result;
    }
    public String color() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.TimerComponentState_color(this.ptr);
        return result;
    }
    TimerComponentStateRef(long ptr) {
        this.ptr = ptr;
    }
}