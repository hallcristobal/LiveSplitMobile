package livesplitcore;

public class RunMetadata extends RunMetadataRefMut implements AutoCloseable {
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
    RunMetadata(long ptr) {
        super(ptr);
    }
}