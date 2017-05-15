package livesplitcore;

public class PreviousSegmentComponentRef {
    long ptr;
    public String stateAsJson(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.PreviousSegmentComponent_stateAsJson(this.ptr, timer.ptr);
        return result;
    }
    public PreviousSegmentComponentState state(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        PreviousSegmentComponentState result = new PreviousSegmentComponentState(LiveSplitCoreNative.PreviousSegmentComponent_state(this.ptr, timer.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    PreviousSegmentComponentRef(long ptr) {
        this.ptr = ptr;
    }
}