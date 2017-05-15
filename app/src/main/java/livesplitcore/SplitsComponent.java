package livesplitcore;

public class SplitsComponent extends SplitsComponentRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.SplitsComponent_drop(this.ptr);
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
    public SplitsComponent() {
        super(0);
        this.ptr = LiveSplitCoreNative.SplitsComponent_new();
    }
    SplitsComponent(long ptr) {
        super(ptr);
    }
}