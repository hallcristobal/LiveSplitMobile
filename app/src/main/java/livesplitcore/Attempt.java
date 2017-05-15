package livesplitcore;

public class Attempt extends AttemptRefMut implements AutoCloseable {
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
    Attempt(long ptr) {
        super(ptr);
    }
}