package livesplitcore;

public class PreviousSegmentComponentStateRef {
    long ptr;
    public String text() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.PreviousSegmentComponentState_text(this.ptr);
        return result;
    }
    public String time() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.PreviousSegmentComponentState_time(this.ptr);
        return result;
    }
    PreviousSegmentComponentStateRef(long ptr) {
        this.ptr = ptr;
    }
}