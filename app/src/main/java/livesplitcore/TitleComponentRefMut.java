package livesplitcore;

public class TitleComponentRefMut extends TitleComponentRef {
    public String stateAsJson(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.TitleComponent_stateAsJson(this.ptr, timer.ptr);
        return result;
    }
    public TitleComponentState state(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        TitleComponentState result = new TitleComponentState(LiveSplitCoreNative.TitleComponent_state(this.ptr, timer.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    TitleComponentRefMut(long ptr) {
        super(ptr);
    }
}