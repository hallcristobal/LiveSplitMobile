package livesplitcore;

public class SegmentHistoryElementRef {
    long ptr;
    public int index() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        int result = LiveSplitCoreNative.SegmentHistoryElement_index(this.ptr);
        return result;
    }
    public TimeRef time() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeRef result = new TimeRef(LiveSplitCoreNative.SegmentHistoryElement_time(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    SegmentHistoryElementRef(long ptr) {
        this.ptr = ptr;
    }
}