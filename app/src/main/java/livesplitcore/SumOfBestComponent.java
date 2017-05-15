package livesplitcore;

public class SumOfBestComponent extends SumOfBestComponentRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.SumOfBestComponent_drop(this.ptr);
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
    public SumOfBestComponent() {
        super(0);
        this.ptr = LiveSplitCoreNative.SumOfBestComponent_new();
    }
    SumOfBestComponent(long ptr) {
        super(ptr);
    }
}