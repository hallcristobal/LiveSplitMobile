package livesplitcore;

public class HotkeySystem extends HotkeySystemRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.HotkeySystem_drop(this.ptr);
            ptr = 0;
        }
    }
    protected void finalize() throws Throwable {
        drop();
        super.finalize();
    }
    public void close() {
        drop();
    }
    public HotkeySystem(SharedTimer sharedTimer) {
        super(0);
        if (sharedTimer.ptr == 0) {
            throw new RuntimeException();
        }
        this.ptr = LiveSplitCoreNative.HotkeySystem_new(sharedTimer.ptr);
        sharedTimer.ptr = 0;
    }
    HotkeySystem(long ptr) {
        super(ptr);
    }
}