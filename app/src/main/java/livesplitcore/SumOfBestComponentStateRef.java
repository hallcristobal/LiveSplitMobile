package livesplitcore;

public class SumOfBestComponentStateRef {
    long ptr;
    public String text() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.SumOfBestComponentState_text(this.ptr);
        return result;
    }
    public String time() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.SumOfBestComponentState_time(this.ptr);
        return result;
    }
    SumOfBestComponentStateRef(long ptr) {
        this.ptr = ptr;
    }
}