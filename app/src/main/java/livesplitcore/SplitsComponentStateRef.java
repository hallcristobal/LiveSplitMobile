package livesplitcore;

public class SplitsComponentStateRef {
    long ptr;
    public boolean finalSeparatorShown() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.SplitsComponentState_finalSeparatorShown(this.ptr);
        return result;
    }
    public long len() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        long result = LiveSplitCoreNative.SplitsComponentState_len(this.ptr);
        return result;
    }
    public String iconChange(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.SplitsComponentState_iconChange(this.ptr, index);
        return result;
    }
    public String name(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.SplitsComponentState_name(this.ptr, index);
        return result;
    }
    public String delta(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.SplitsComponentState_delta(this.ptr, index);
        return result;
    }
    public String time(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.SplitsComponentState_time(this.ptr, index);
        return result;
    }
    public String color(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.SplitsComponentState_color(this.ptr, index);
        return result;
    }
    public boolean isCurrentSplit(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.SplitsComponentState_isCurrentSplit(this.ptr, index);
        return result;
    }
    SplitsComponentStateRef(long ptr) {
        this.ptr = ptr;
    }
}