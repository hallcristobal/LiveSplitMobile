package livesplitcore;

public class RunEditor extends RunEditorRefMut implements AutoCloseable {
    private void drop() {
        if (ptr != 0) {
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
    public RunEditor(Run run) {
        super(0);
        if (run.ptr == 0) {
            throw new RuntimeException();
        }
        this.ptr = LiveSplitCoreNative.RunEditor_new(run.ptr);
        run.ptr = 0;
    }
    public Run finish() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        Run result = new Run(LiveSplitCoreNative.RunEditor_close(this.ptr));
        this.ptr = 0;
        if (result.ptr == 0) {
            return null;
        }
        return result;
    }
    RunEditor(long ptr) {
        super(ptr);
    }
}