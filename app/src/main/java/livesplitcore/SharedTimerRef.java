package livesplitcore;

public class SharedTimerRef {
    long ptr;
    public SharedTimer share() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        SharedTimer result = new SharedTimer(LiveSplitCoreNative.SharedTimer_share(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public TimerReadLock read() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimerReadLock result = new TimerReadLock(LiveSplitCoreNative.SharedTimer_read(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public TimerWriteLock write() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimerWriteLock result = new TimerWriteLock(LiveSplitCoreNative.SharedTimer_write(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public void readWith(java.util.function.Consumer<TimerRef> action) {
        try (TimerReadLock timerLock = read()) {
            action.accept(timerLock.timer());
        }
    }
    public void writeWith(java.util.function.Consumer<TimerRefMut> action) {
        try (TimerWriteLock timerLock = write()) {
            action.accept(timerLock.timer());
        }
    }
    SharedTimerRef(long ptr) {
        this.ptr = ptr;
    }
}