package livesplitcore;

public class SegmentHistory extends SegmentHistoryRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
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
    SegmentHistory(long ptr) {
        super(ptr);
    }
}