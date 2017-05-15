package livesplitcore;

public class PossibleTimeSaveComponentStateRef {
    long ptr;
    public String text() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.PossibleTimeSaveComponentState_text(this.ptr);
        return result;
    }
    public String time() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.PossibleTimeSaveComponentState_time(this.ptr);
        return result;
    }
    PossibleTimeSaveComponentStateRef(long ptr) {
        this.ptr = ptr;
    }
}