package livesplitcore;

public class PreviousSegmentComponentState extends PreviousSegmentComponentStateRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.PreviousSegmentComponentState_drop(this.ptr);
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
    PreviousSegmentComponentState(long ptr) {
        super(ptr);
    }
}