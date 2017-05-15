package livesplitcore;

public class TimerRefMut extends TimerRef {
    public void split() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_split(this.ptr);
    }
    public void skipSplit() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_skipSplit(this.ptr);
    }
    public void undoSplit() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_undoSplit(this.ptr);
    }
    public void reset(boolean updateSplits) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_reset(this.ptr, updateSplits);
    }
    public void pause() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_pause(this.ptr);
    }
    public void setCurrentTimingMethod(byte method) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_setCurrentTimingMethod(this.ptr, method);
    }
    public void switchToNextComparison() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_switchToNextComparison(this.ptr);
    }
    public void switchToPreviousComparison() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_switchToPreviousComparison(this.ptr);
    }
    public void initializeGameTime() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_initializeGameTime(this.ptr);
    }
    public void uninitializeGameTime() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_uninitializeGameTime(this.ptr);
    }
    public void pauseGameTime() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_pauseGameTime(this.ptr);
    }
    public void unpauseGameTime() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_unpauseGameTime(this.ptr);
    }
    public void setGameTime(TimeSpanRef time) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (time.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_setGameTime(this.ptr, time.ptr);
    }
    public void setLoadingTimes(TimeSpanRef time) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (time.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_setLoadingTimes(this.ptr, time.ptr);
    }
    TimerRefMut(long ptr) {
        super(ptr);
    }
}