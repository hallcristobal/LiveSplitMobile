package livesplitcore;

public class RunMetadataRef {
    long ptr;
    public String runId() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.RunMetadata_runId(this.ptr);
        return result;
    }
    public String platformName() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.RunMetadata_platformName(this.ptr);
        return result;
    }
    public boolean usesEmulator() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.RunMetadata_usesEmulator(this.ptr);
        return result;
    }
    public String regionName() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.RunMetadata_regionName(this.ptr);
        return result;
    }
    RunMetadataRef(long ptr) {
        this.ptr = ptr;
    }
}