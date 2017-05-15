package livesplitcore;

public class TimerComponent extends TimerComponentRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.TimerComponent_drop(this.ptr);
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
    public TimerComponent() {
        super(0);
        this.ptr = LiveSplitCoreNative.TimerComponent_new();
    }
    TimerComponent(long ptr) {
        super(ptr);
    }
}