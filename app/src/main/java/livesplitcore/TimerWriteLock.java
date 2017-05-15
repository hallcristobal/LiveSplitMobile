package livesplitcore;

public class TimerWriteLock extends TimerWriteLockRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.TimerWriteLock_drop(this.ptr);
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
    TimerWriteLock(long ptr) {
        super(ptr);
    }
}