package livesplitcore;

public class PreviousSegmentComponent extends PreviousSegmentComponentRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.PreviousSegmentComponent_drop(this.ptr);
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
    public PreviousSegmentComponent() {
        super(0);
        this.ptr = LiveSplitCoreNative.PreviousSegmentComponent_new();
    }
    PreviousSegmentComponent(long ptr) {
        super(ptr);
    }
}