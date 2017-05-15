package livesplitcore;

public class TitleComponent extends TitleComponentRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.TitleComponent_drop(this.ptr);
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
    public TitleComponent() {
        super(0);
        this.ptr = LiveSplitCoreNative.TitleComponent_new();
    }
    TitleComponent(long ptr) {
        super(ptr);
    }
}