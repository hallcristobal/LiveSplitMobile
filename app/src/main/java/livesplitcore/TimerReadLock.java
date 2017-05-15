package livesplitcore;

public class TimerReadLock extends TimerReadLockRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.TimerReadLock_drop(this.ptr);
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
    TimerReadLock(long ptr) {
        super(ptr);
    }
}