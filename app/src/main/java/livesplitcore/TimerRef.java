package livesplitcore;

public class TimerRef {
    long ptr;
    public byte currentTimingMethod() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        byte result = LiveSplitCoreNative.Timer_currentTimingMethod(this.ptr);
        return result;
    }
    public String currentComparison() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.Timer_currentComparison(this.ptr);
        return result;
    }
    public boolean isGameTimeInitialized() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.Timer_isGameTimeInitialized(this.ptr);
        return result;
    }
    public boolean isGameTimePaused() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.Timer_isGameTimePaused(this.ptr);
        return result;
    }
    public TimeSpanRef loadingTimes() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeSpanRef result = new TimeSpanRef(LiveSplitCoreNative.Timer_loadingTimes(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public byte currentPhase() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        byte result = LiveSplitCoreNative.Timer_currentPhase(this.ptr);
        return result;
    }
    public RunRef getRun() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        RunRef result = new RunRef(LiveSplitCoreNative.Timer_getRun(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public Run cloneRun() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        Run result = new Run(LiveSplitCoreNative.Timer_cloneRun(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public void printDebug() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Timer_printDebug(this.ptr);
    }
    TimerRef(long ptr) {
        this.ptr = ptr;
    }
}