package livesplitcore;

public class AttemptRef {
    long ptr;
    public int index() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        int result = LiveSplitCoreNative.Attempt_index(this.ptr);
        return result;
    }
    public TimeRef time() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeRef result = new TimeRef(LiveSplitCoreNative.Attempt_time(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    AttemptRef(long ptr) {
        this.ptr = ptr;
    }
}