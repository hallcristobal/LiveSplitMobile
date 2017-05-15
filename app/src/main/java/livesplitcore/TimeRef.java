package livesplitcore;

public class TimeRef {
    long ptr;
    public Time copy() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        Time result = new Time(LiveSplitCoreNative.Time_clone(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public TimeSpanRef realTime() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeSpanRef result = new TimeSpanRef(LiveSplitCoreNative.Time_realTime(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public TimeSpanRef gameTime() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeSpanRef result = new TimeSpanRef(LiveSplitCoreNative.Time_gameTime(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public TimeSpanRef index(byte timingMethod) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeSpanRef result = new TimeSpanRef(LiveSplitCoreNative.Time_index(this.ptr, timingMethod));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    TimeRef(long ptr) {
        this.ptr = ptr;
    }
}