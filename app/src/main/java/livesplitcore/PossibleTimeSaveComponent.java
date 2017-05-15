package livesplitcore;

public class PossibleTimeSaveComponent extends PossibleTimeSaveComponentRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.PossibleTimeSaveComponent_drop(this.ptr);
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
    public PossibleTimeSaveComponent() {
        super(0);
        this.ptr = LiveSplitCoreNative.PossibleTimeSaveComponent_new();
    }
    PossibleTimeSaveComponent(long ptr) {
        super(ptr);
    }
}