package livesplitcore;

public class SegmentHistoryIterRefMut extends SegmentHistoryIterRef {
    public SegmentHistoryElementRef next() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        SegmentHistoryElementRef result = new SegmentHistoryElementRef(LiveSplitCoreNative.SegmentHistoryIter_next(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    SegmentHistoryIterRefMut(long ptr) {
        super(ptr);
    }
}