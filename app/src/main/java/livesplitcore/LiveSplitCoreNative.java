package livesplitcore;

public class LiveSplitCoreNative {
    public static native int Attempt_index(long self);
    public static native long Attempt_time(long self);
    public static native long HotkeySystem_new(long sharedTimer);
    public static native void HotkeySystem_drop(long self);
    public static native long PossibleTimeSaveComponent_new();
    public static native void PossibleTimeSaveComponent_drop(long self);
    public static native String PossibleTimeSaveComponent_stateAsJson(long self, long timer);
    public static native long PossibleTimeSaveComponent_state(long self, long timer);
    public static native void PossibleTimeSaveComponentState_drop(long self);
    public static native String PossibleTimeSaveComponentState_text(long self);
    public static native String PossibleTimeSaveComponentState_time(long self);
    public static native long PreviousSegmentComponent_new();
    public static native void PreviousSegmentComponent_drop(long self);
    public static native String PreviousSegmentComponent_stateAsJson(long self, long timer);
    public static native long PreviousSegmentComponent_state(long self, long timer);
    public static native void PreviousSegmentComponentState_drop(long self);
    public static native String PreviousSegmentComponentState_text(long self);
    public static native String PreviousSegmentComponentState_time(long self);
    public static native long Run_new();
    public static native long Run_parse(long data, long length);
    public static native void Run_drop(long self);
    public static native String Run_gameName(long self);
    public static native String Run_gameIcon(long self);
    public static native String Run_categoryName(long self);
    public static native String Run_extendedFileName(long self, boolean useExtendedCategoryName);
    public static native String Run_extendedName(long self, boolean useExtendedCategoryName);
    public static native String Run_extendedCategoryName(long self, boolean showRegion, boolean showPlatform, boolean showVariables);
    public static native int Run_attemptCount(long self);
    public static native long Run_metadata(long self);
    public static native long Run_offset(long self);
    public static native long Run_len(long self);
    public static native long Run_segment(long self, long index);
    public static native long Run_attemptHistoryLen(long self);
    public static native long Run_attemptHistoryIndex(long self, long index);
    public static native String Run_saveAsLss(long self);
    public static native void Run_pushSegment(long self, long segment);
    public static native void Run_setGameName(long self, String game);
    public static native void Run_setCategoryName(long self, String category);
    public static native long RunEditor_new(long run);
    public static native long RunEditor_close(long self);
    public static native String RunEditor_stateAsJson(long self);
    public static native void RunEditor_selectTimingMethod(long self, byte method);
    public static native void RunEditor_unselect(long self, long index);
    public static native void RunEditor_selectAdditionally(long self, long index);
    public static native void RunEditor_selectOnly(long self, long index);
    public static native void RunEditor_setGameName(long self, String game);
    public static native void RunEditor_setCategoryName(long self, String category);
    public static native boolean RunEditor_parseAndSetOffset(long self, String offset);
    public static native boolean RunEditor_parseAndSetAttemptCount(long self, String attempts);
    public static native void RunEditor_setGameIcon(long self, long data, long length);
    public static native void RunEditor_insertSegmentAbove(long self);
    public static native void RunEditor_insertSegmentBelow(long self);
    public static native void RunEditor_removeSegments(long self);
    public static native void RunEditor_moveSegmentsUp(long self);
    public static native void RunEditor_moveSegmentsDown(long self);
    public static native void RunEditor_selectedSetIcon(long self, long data, long length);
    public static native void RunEditor_selectedSetName(long self, String name);
    public static native boolean RunEditor_selectedParseAndSetSplitTime(long self, String time);
    public static native boolean RunEditor_selectedParseAndSetSegmentTime(long self, String time);
    public static native boolean RunEditor_selectedParseAndSetBestSegmentTime(long self, String time);
    public static native boolean RunEditor_selectedParseAndSetComparisonTime(long self, String comparison, String time);
    public static native String RunMetadata_runId(long self);
    public static native String RunMetadata_platformName(long self);
    public static native boolean RunMetadata_usesEmulator(long self);
    public static native String RunMetadata_regionName(long self);
    public static native long Segment_new(String name);
    public static native void Segment_drop(long self);
    public static native String Segment_name(long self);
    public static native String Segment_icon(long self);
    public static native long Segment_comparison(long self, String comparison);
    public static native long Segment_personalBestSplitTime(long self);
    public static native long Segment_bestSegmentTime(long self);
    public static native long Segment_segmentHistory(long self);
    public static native long SegmentHistory_iter(long self);
    public static native int SegmentHistoryElement_index(long self);
    public static native long SegmentHistoryElement_time(long self);
    public static native void SegmentHistoryIter_drop(long self);
    public static native long SegmentHistoryIter_next(long self);
    public static native void SharedTimer_drop(long self);
    public static native long SharedTimer_share(long self);
    public static native long SharedTimer_read(long self);
    public static native long SharedTimer_write(long self);
    public static native long SplitsComponent_new();
    public static native void SplitsComponent_drop(long self);
    public static native String SplitsComponent_stateAsJson(long self, long timer);
    public static native long SplitsComponent_state(long self, long timer);
    public static native void SplitsComponent_scrollUp(long self);
    public static native void SplitsComponent_scrollDown(long self);
    public static native void SplitsComponentState_drop(long self);
    public static native boolean SplitsComponentState_finalSeparatorShown(long self);
    public static native long SplitsComponentState_len(long self);
    public static native String SplitsComponentState_iconChange(long self, long index);
    public static native String SplitsComponentState_name(long self, long index);
    public static native String SplitsComponentState_delta(long self, long index);
    public static native String SplitsComponentState_time(long self, long index);
    public static native String SplitsComponentState_color(long self, long index);
    public static native boolean SplitsComponentState_isCurrentSplit(long self, long index);
    public static native long SumOfBestComponent_new();
    public static native void SumOfBestComponent_drop(long self);
    public static native String SumOfBestComponent_stateAsJson(long self, long timer);
    public static native long SumOfBestComponent_state(long self, long timer);
    public static native void SumOfBestComponentState_drop(long self);
    public static native String SumOfBestComponentState_text(long self);
    public static native String SumOfBestComponentState_time(long self);
    public static native void Time_drop(long self);
    public static native long Time_clone(long self);
    public static native long Time_realTime(long self);
    public static native long Time_gameTime(long self);
    public static native long Time_index(long self, byte timingMethod);
    public static native long TimeSpan_fromSeconds(double seconds);
    public static native void TimeSpan_drop(long self);
    public static native long TimeSpan_clone(long self);
    public static native double TimeSpan_totalSeconds(long self);
    public static native long Timer_new(long run);
    public static native long Timer_intoShared(long self);
    public static native void Timer_drop(long self);
    public static native byte Timer_currentTimingMethod(long self);
    public static native String Timer_currentComparison(long self);
    public static native boolean Timer_isGameTimeInitialized(long self);
    public static native boolean Timer_isGameTimePaused(long self);
    public static native long Timer_loadingTimes(long self);
    public static native byte Timer_currentPhase(long self);
    public static native long Timer_getRun(long self);
    public static native long Timer_cloneRun(long self);
    public static native void Timer_printDebug(long self);
    public static native void Timer_split(long self);
    public static native void Timer_skipSplit(long self);
    public static native void Timer_undoSplit(long self);
    public static native void Timer_reset(long self, boolean updateSplits);
    public static native void Timer_pause(long self);
    public static native void Timer_setCurrentTimingMethod(long self, byte method);
    public static native void Timer_switchToNextComparison(long self);
    public static native void Timer_switchToPreviousComparison(long self);
    public static native void Timer_initializeGameTime(long self);
    public static native void Timer_uninitializeGameTime(long self);
    public static native void Timer_pauseGameTime(long self);
    public static native void Timer_unpauseGameTime(long self);
    public static native void Timer_setGameTime(long self, long time);
    public static native void Timer_setLoadingTimes(long self, long time);
    public static native long TimerComponent_new();
    public static native void TimerComponent_drop(long self);
    public static native String TimerComponent_stateAsJson(long self, long timer);
    public static native long TimerComponent_state(long self, long timer);
    public static native void TimerComponentState_drop(long self);
    public static native String TimerComponentState_time(long self);
    public static native String TimerComponentState_fraction(long self);
    public static native String TimerComponentState_color(long self);
    public static native void TimerReadLock_drop(long self);
    public static native long TimerReadLock_timer(long self);
    public static native void TimerWriteLock_drop(long self);
    public static native long TimerWriteLock_timer(long self);
    public static native long TitleComponent_new();
    public static native void TitleComponent_drop(long self);
    public static native String TitleComponent_stateAsJson(long self, long timer);
    public static native long TitleComponent_state(long self, long timer);
    public static native void TitleComponentState_drop(long self);
    public static native String TitleComponentState_iconChange(long self);
    public static native String TitleComponentState_game(long self);
    public static native String TitleComponentState_category(long self);
    public static native int TitleComponentState_attempts(long self);
}