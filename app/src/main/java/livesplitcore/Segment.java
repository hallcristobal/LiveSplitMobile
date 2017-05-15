package livesplitcore;

public class Segment extends SegmentRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.Segment_drop(this.ptr);
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
    public Segment(String name) {
        super(0);
        this.ptr = LiveSplitCoreNative.Segment_new(name);
    }
    Segment(long ptr) {
        super(ptr);
    }
}