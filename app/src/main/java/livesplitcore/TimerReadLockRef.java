package livesplitcore;

public class TimerReadLockRef {
    long ptr;
    public TimerRef timer() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimerRef result = new TimerRef(LiveSplitCoreNative.TimerReadLock_timer(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    TimerReadLockRef(long ptr) {
        this.ptr = ptr;
    }
}