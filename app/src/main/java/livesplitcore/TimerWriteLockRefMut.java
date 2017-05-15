package livesplitcore;

public class TimerWriteLockRefMut extends TimerWriteLockRef {
    public TimerRefMut timer() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimerRefMut result = new TimerRefMut(LiveSplitCoreNative.TimerWriteLock_timer(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    TimerWriteLockRefMut(long ptr) {
        super(ptr);
    }
}