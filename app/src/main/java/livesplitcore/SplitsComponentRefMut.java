package livesplitcore;

public class SplitsComponentRefMut extends SplitsComponentRef {
    public String stateAsJson(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.SplitsComponent_stateAsJson(this.ptr, timer.ptr);
        return result;
    }
    public SplitsComponentState state(TimerRef timer) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (timer.ptr == 0) {
            throw new RuntimeException();
        }
        SplitsComponentState result = new SplitsComponentState(LiveSplitCoreNative.SplitsComponent_state(this.ptr, timer.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public void scrollUp() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.SplitsComponent_scrollUp(this.ptr);
    }
    public void scrollDown() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.SplitsComponent_scrollDown(this.ptr);
    }
    SplitsComponentRefMut(long ptr) {
        super(ptr);
    }
}