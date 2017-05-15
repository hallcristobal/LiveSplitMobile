package livesplitcore;

public class SegmentHistoryElement extends SegmentHistoryElementRefMut implements AutoCloseable {
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
    SegmentHistoryElement(long ptr) {
        super(ptr);
    }
}