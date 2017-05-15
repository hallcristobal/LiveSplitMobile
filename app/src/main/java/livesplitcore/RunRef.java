package livesplitcore;

public class RunRef {
    long ptr;
    public String gameName() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.Run_gameName(this.ptr);
        return result;
    }
    public String gameIcon() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.Run_gameIcon(this.ptr);
        return result;
    }
    public String categoryName() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.Run_categoryName(this.ptr);
        return result;
    }
    public String extendedFileName(boolean useExtendedCategoryName) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.Run_extendedFileName(this.ptr, useExtendedCategoryName);
        return result;
    }
    public String extendedName(boolean useExtendedCategoryName) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.Run_extendedName(this.ptr, useExtendedCategoryName);
        return result;
    }
    public String extendedCategoryName(boolean showRegion, boolean showPlatform, boolean showVariables) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.Run_extendedCategoryName(this.ptr, showRegion, showPlatform, showVariables);
        return result;
    }
    public int attemptCount() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        int result = LiveSplitCoreNative.Run_attemptCount(this.ptr);
        return result;
    }
    public RunMetadataRef metadata() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        RunMetadataRef result = new RunMetadataRef(LiveSplitCoreNative.Run_metadata(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public TimeSpanRef offset() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeSpanRef result = new TimeSpanRef(LiveSplitCoreNative.Run_offset(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public long len() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        long result = LiveSplitCoreNative.Run_len(this.ptr);
        return result;
    }
    public SegmentRef segment(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        SegmentRef result = new SegmentRef(LiveSplitCoreNative.Run_segment(this.ptr, index));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public long attemptHistoryLen() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        long result = LiveSplitCoreNative.Run_attemptHistoryLen(this.ptr);
        return result;
    }
    public AttemptRef attemptHistoryIndex(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        AttemptRef result = new AttemptRef(LiveSplitCoreNative.Run_attemptHistoryIndex(this.ptr, index));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public String saveAsLss() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.Run_saveAsLss(this.ptr);
        return result;
    }
    RunRef(long ptr) {
        this.ptr = ptr;
    }
}