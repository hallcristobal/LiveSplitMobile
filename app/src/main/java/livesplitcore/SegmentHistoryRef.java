package livesplitcore;

public class SegmentHistoryRef {
    long ptr;
    public SegmentHistoryIter iter() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        SegmentHistoryIter result = new SegmentHistoryIter(LiveSplitCoreNative.SegmentHistory_iter(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    SegmentHistoryRef(long ptr) {
        this.ptr = ptr;
    }
}