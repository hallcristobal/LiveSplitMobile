package livesplitcore;

public class Run extends RunRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
            LiveSplitCoreNative.Run_drop(this.ptr);
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
    public Run() {
        super(0);
        this.ptr = LiveSplitCoreNative.Run_new();
    }
    public static Run parse(long data, long length) {
        Run result = new Run(LiveSplitCoreNative.Run_parse(data, length));
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    Run(long ptr) {
        super(ptr);
    }
}