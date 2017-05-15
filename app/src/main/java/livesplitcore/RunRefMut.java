package livesplitcore;

public class RunRefMut extends RunRef {
    public void pushSegment(Segment segment) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        if (segment.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Run_pushSegment(this.ptr, segment.ptr);
        segment.ptr = 0;
    }
    public void setGameName(String game) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Run_setGameName(this.ptr, game);
    }
    public void setCategoryName(String category) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.Run_setCategoryName(this.ptr, category);
    }
    RunRefMut(long ptr) {
        super(ptr);
    }
}