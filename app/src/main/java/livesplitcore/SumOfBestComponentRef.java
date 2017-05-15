package livesplitcore;

public class SumOfBestComponentRef {
    long ptr;
    public String stateAsJson(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.SumOfBestComponent_stateAsJson(this.ptr, timer.ptr);
        return result;
    }
    public SumOfBestComponentState state(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        SumOfBestComponentState result = new SumOfBestComponentState(LiveSplitCoreNative.SumOfBestComponent_state(this.ptr, timer.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    SumOfBestComponentRef(long ptr) {
        this.ptr = ptr;
    }
}