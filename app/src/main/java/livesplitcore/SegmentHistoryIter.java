package livesplitcore;

public class SegmentHistoryIter extends SegmentHistoryIterRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.SegmentHistoryIter_drop(this.ptr);
            ptr = 0;
        }
    }
    protected void finalize() throws Throwable {
        drop();
        super.finalize();
    }
    public void close() {
        drop();
    }
    SegmentHistoryIter(long ptr) {
        super(ptr);
    }
}