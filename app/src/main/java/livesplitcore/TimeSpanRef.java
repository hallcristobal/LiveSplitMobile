package livesplitcore;

public class TimeSpanRef {
    long ptr;
    public TimeSpan copy() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeSpan result = new TimeSpan(LiveSplitCoreNative.TimeSpan_clone(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public double totalSeconds() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        double result = LiveSplitCoreNative.TimeSpan_totalSeconds(this.ptr);
        return result;
    }
    TimeSpanRef(long ptr) {
        this.ptr = ptr;
    }
}