package livesplitcore;

public class PossibleTimeSaveComponentState extends PossibleTimeSaveComponentStateRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.PossibleTimeSaveComponentState_drop(this.ptr);
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
    PossibleTimeSaveComponentState(long ptr) {
        super(ptr);
    }
}