package livesplitcore;

public class TimerComponentRef {
    long ptr;
    public String stateAsJson(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.TimerComponent_stateAsJson(this.ptr, timer.ptr);
        return result;
    }
    public TimerComponentState state(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        TimerComponentState result = new TimerComponentState(LiveSplitCoreNative.TimerComponent_state(this.ptr, timer.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    TimerComponentRef(long ptr) {
        this.ptr = ptr;
    }
}