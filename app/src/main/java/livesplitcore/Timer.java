package livesplitcore;

public class Timer extends TimerRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.Timer_drop(this.ptr);
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
    public Timer(Run run) {
        super(0);
        if (run.ptr == 0) {
            throw new RuntimeException();
        }
        this.ptr = LiveSplitCoreNative.Timer_new(run.ptr);
        run.ptr = 0;
    }
    public SharedTimer intoShared() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        SharedTimer result = new SharedTimer(LiveSplitCoreNative.Timer_intoShared(this.ptr));
        this.ptr = 0;
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    Timer(long ptr) {
        super(ptr);
    }
}