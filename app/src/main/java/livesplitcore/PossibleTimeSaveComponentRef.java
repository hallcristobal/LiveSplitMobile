package livesplitcore;

public class PossibleTimeSaveComponentRef {
    long ptr;
    public String stateAsJson(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.PossibleTimeSaveComponent_stateAsJson(this.ptr, timer.ptr);
        return result;
    }
    public PossibleTimeSaveComponentState state(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        PossibleTimeSaveComponentState result = new PossibleTimeSaveComponentState(LiveSplitCoreNative.PossibleTimeSaveComponent_state(this.ptr, timer.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    PossibleTimeSaveComponentRef(long ptr) {
        this.ptr = ptr;
    }
}