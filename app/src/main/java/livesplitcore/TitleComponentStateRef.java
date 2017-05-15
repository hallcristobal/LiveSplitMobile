package livesplitcore;

public class TitleComponentStateRef {
    long ptr;
    public String iconChange() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.TitleComponentState_iconChange(this.ptr);
        return result;
    }
    public String game() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.TitleComponentState_game(this.ptr);
        return result;
    }
    public String category() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.TitleComponentState_category(this.ptr);
        return result;
    }
    public int attempts() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        int result = LiveSplitCoreNative.TitleComponentState_attempts(this.ptr);
        return result;
    }
    TitleComponentStateRef(long ptr) {
        this.ptr = ptr;
    }
}