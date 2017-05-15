package livesplitcore;

public class RunEditorRefMut extends RunEditorRef {
    public String stateAsJson() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        String result = LiveSplitCoreNative.RunEditor_stateAsJson(this.ptr);
        return result;
    }
    public void selectTimingMethod(byte method) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_selectTimingMethod(this.ptr, method);
    }
    public void unselect(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_unselect(this.ptr, index);
    }
    public void selectAdditionally(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_selectAdditionally(this.ptr, index);
    }
    public void selectOnly(long index) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_selectOnly(this.ptr, index);
    }
    public void setGameName(String game) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_setGameName(this.ptr, game);
    }
    public void setCategoryName(String category) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_setCategoryName(this.ptr, category);
    }
    public boolean parseAndSetOffset(String offset) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.RunEditor_parseAndSetOffset(this.ptr, offset);
        return result;
    }
    public boolean parseAndSetAttemptCount(String attempts) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.RunEditor_parseAndSetAttemptCount(this.ptr, attempts);
        return result;
    }
    public void setGameIcon(long data, long length) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_setGameIcon(this.ptr, data, length);
    }
    public void insertSegmentAbove() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_insertSegmentAbove(this.ptr);
    }
    public void insertSegmentBelow() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_insertSegmentBelow(this.ptr);
    }
    public void removeSegments() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_removeSegments(this.ptr);
    }
    public void moveSegmentsUp() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_moveSegmentsUp(this.ptr);
    }
    public void moveSegmentsDown() {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_moveSegmentsDown(this.ptr);
    }
    public void selectedSetIcon(long data, long length) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_selectedSetIcon(this.ptr, data, length);
    }
    public void selectedSetName(String name) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        LiveSplitCoreNative.RunEditor_selectedSetName(this.ptr, name);
    }
    public boolean selectedParseAndSetSplitTime(String time) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.RunEditor_selectedParseAndSetSplitTime(this.ptr, time);
        return result;
    }
    public boolean selectedParseAndSetSegmentTime(String time) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.RunEditor_selectedParseAndSetSegmentTime(this.ptr, time);
        return result;
    }
    public boolean selectedParseAndSetBestSegmentTime(String time) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.RunEditor_selectedParseAndSetBestSegmentTime(this.ptr, time);
        return result;
    }
    public boolean selectedParseAndSetComparisonTime(String comparison, String time) {
        if (this.ptr == 0) {
            throw new RuntimeException();
        }
        boolean result = LiveSplitCoreNative.RunEditor_selectedParseAndSetComparisonTime(this.ptr, comparison, time);
        return result;
    }
    RunEditorRefMut(long ptr) {
        super(ptr);
    }
}