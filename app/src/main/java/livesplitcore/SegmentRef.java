package livesplitcore;

public class SegmentRef {
    long ptr;
    public String name() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.Segment_name(this.ptr);
        return result;
    }
    public String icon() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.Segment_icon(this.ptr);
        return result;
    }
    public TimeRef comparison(String comparison) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeRef result = new TimeRef(LiveSplitCoreNative.Segment_comparison(this.ptr, comparison));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public TimeRef personalBestSplitTime() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeRef result = new TimeRef(LiveSplitCoreNative.Segment_personalBestSplitTime(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public TimeRef bestSegmentTime() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        TimeRef result = new TimeRef(LiveSplitCoreNative.Segment_bestSegmentTime(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    public SegmentHistoryRef segmentHistory() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        SegmentHistoryRef result = new SegmentHistoryRef(LiveSplitCoreNative.Segment_segmentHistory(this.ptr));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    SegmentRef(long ptr) {
        this.ptr = ptr;
    }
}