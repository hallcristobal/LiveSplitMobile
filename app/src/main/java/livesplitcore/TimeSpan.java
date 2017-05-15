package livesplitcore;

public class TimeSpan extends TimeSpanRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.TimeSpan_drop(this.ptr);
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
    public static TimeSpan fromSeconds(double seconds) {
        TimeSpan result = new TimeSpan(LiveSplitCoreNative.TimeSpan_fromSeconds(seconds));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    TimeSpan(long ptr) {
        super(ptr);
    }
}