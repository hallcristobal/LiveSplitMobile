#ifndef _LIVESPLIT_CORE_H_
#define _LIVESPLIT_CORE_H_

#ifdef __cplusplus
#define restrict __restrict
namespace LiveSplit {
    extern "C" {
#endif

#include <stdint.h>
#include <stddef.h>

    struct Attempt_s;
    typedef struct Attempt_s *restrict Attempt;
    typedef struct Attempt_s *restrict AttemptRefMut;
    typedef struct Attempt_s const* AttemptRef;

    struct HotkeySystem_s;
    typedef struct HotkeySystem_s *restrict HotkeySystem;
    typedef struct HotkeySystem_s *restrict HotkeySystemRefMut;
    typedef struct HotkeySystem_s const* HotkeySystemRef;

    struct PossibleTimeSaveComponent_s;
    typedef struct PossibleTimeSaveComponent_s *restrict PossibleTimeSaveComponent;
    typedef struct PossibleTimeSaveComponent_s *restrict PossibleTimeSaveComponentRefMut;
    typedef struct PossibleTimeSaveComponent_s const* PossibleTimeSaveComponentRef;

    struct PossibleTimeSaveComponentState_s;
    typedef struct PossibleTimeSaveComponentState_s *restrict PossibleTimeSaveComponentState;
    typedef struct PossibleTimeSaveComponentState_s *restrict PossibleTimeSaveComponentStateRefMut;
    typedef struct PossibleTimeSaveComponentState_s const* PossibleTimeSaveComponentStateRef;

    struct PreviousSegmentComponent_s;
    typedef struct PreviousSegmentComponent_s *restrict PreviousSegmentComponent;
    typedef struct PreviousSegmentComponent_s *restrict PreviousSegmentComponentRefMut;
    typedef struct PreviousSegmentComponent_s const* PreviousSegmentComponentRef;

    struct PreviousSegmentComponentState_s;
    typedef struct PreviousSegmentComponentState_s *restrict PreviousSegmentComponentState;
    typedef struct PreviousSegmentComponentState_s *restrict PreviousSegmentComponentStateRefMut;
    typedef struct PreviousSegmentComponentState_s const* PreviousSegmentComponentStateRef;

    struct Run_s;
    typedef struct Run_s *restrict Run;
    typedef struct Run_s *restrict RunRefMut;
    typedef struct Run_s const* RunRef;

    struct RunEditor_s;
    typedef struct RunEditor_s *restrict RunEditor;
    typedef struct RunEditor_s *restrict RunEditorRefMut;
    typedef struct RunEditor_s const* RunEditorRef;

    struct RunMetadata_s;
    typedef struct RunMetadata_s *restrict RunMetadata;
    typedef struct RunMetadata_s *restrict RunMetadataRefMut;
    typedef struct RunMetadata_s const* RunMetadataRef;

    struct Segment_s;
    typedef struct Segment_s *restrict Segment;
    typedef struct Segment_s *restrict SegmentRefMut;
    typedef struct Segment_s const* SegmentRef;

    struct SegmentHistory_s;
    typedef struct SegmentHistory_s *restrict SegmentHistory;
    typedef struct SegmentHistory_s *restrict SegmentHistoryRefMut;
    typedef struct SegmentHistory_s const* SegmentHistoryRef;

    struct SegmentHistoryElement_s;
    typedef struct SegmentHistoryElement_s *restrict SegmentHistoryElement;
    typedef struct SegmentHistoryElement_s *restrict SegmentHistoryElementRefMut;
    typedef struct SegmentHistoryElement_s const* SegmentHistoryElementRef;

    struct SegmentHistoryIter_s;
    typedef struct SegmentHistoryIter_s *restrict SegmentHistoryIter;
    typedef struct SegmentHistoryIter_s *restrict SegmentHistoryIterRefMut;
    typedef struct SegmentHistoryIter_s const* SegmentHistoryIterRef;

    struct SharedTimer_s;
    typedef struct SharedTimer_s *restrict SharedTimer;
    typedef struct SharedTimer_s *restrict SharedTimerRefMut;
    typedef struct SharedTimer_s const* SharedTimerRef;

    struct SplitsComponent_s;
    typedef struct SplitsComponent_s *restrict SplitsComponent;
    typedef struct SplitsComponent_s *restrict SplitsComponentRefMut;
    typedef struct SplitsComponent_s const* SplitsComponentRef;

    struct SplitsComponentState_s;
    typedef struct SplitsComponentState_s *restrict SplitsComponentState;
    typedef struct SplitsComponentState_s *restrict SplitsComponentStateRefMut;
    typedef struct SplitsComponentState_s const* SplitsComponentStateRef;

    struct SumOfBestComponent_s;
    typedef struct SumOfBestComponent_s *restrict SumOfBestComponent;
    typedef struct SumOfBestComponent_s *restrict SumOfBestComponentRefMut;
    typedef struct SumOfBestComponent_s const* SumOfBestComponentRef;

    struct SumOfBestComponentState_s;
    typedef struct SumOfBestComponentState_s *restrict SumOfBestComponentState;
    typedef struct SumOfBestComponentState_s *restrict SumOfBestComponentStateRefMut;
    typedef struct SumOfBestComponentState_s const* SumOfBestComponentStateRef;

    struct Time_s;
    typedef struct Time_s *restrict Time;
    typedef struct Time_s *restrict TimeRefMut;
    typedef struct Time_s const* TimeRef;

    struct TimeSpan_s;
    typedef struct TimeSpan_s *restrict TimeSpan;
    typedef struct TimeSpan_s *restrict TimeSpanRefMut;
    typedef struct TimeSpan_s const* TimeSpanRef;

    struct Timer_s;
    typedef struct Timer_s *restrict Timer;
    typedef struct Timer_s *restrict TimerRefMut;
    typedef struct Timer_s const* TimerRef;

    struct TimerComponent_s;
    typedef struct TimerComponent_s *restrict TimerComponent;
    typedef struct TimerComponent_s *restrict TimerComponentRefMut;
    typedef struct TimerComponent_s const* TimerComponentRef;

    struct TimerComponentState_s;
    typedef struct TimerComponentState_s *restrict TimerComponentState;
    typedef struct TimerComponentState_s *restrict TimerComponentStateRefMut;
    typedef struct TimerComponentState_s const* TimerComponentStateRef;

    struct TimerReadLock_s;
    typedef struct TimerReadLock_s *restrict TimerReadLock;
    typedef struct TimerReadLock_s *restrict TimerReadLockRefMut;
    typedef struct TimerReadLock_s const* TimerReadLockRef;

    struct TimerWriteLock_s;
    typedef struct TimerWriteLock_s *restrict TimerWriteLock;
    typedef struct TimerWriteLock_s *restrict TimerWriteLockRefMut;
    typedef struct TimerWriteLock_s const* TimerWriteLockRef;

    struct TitleComponent_s;
    typedef struct TitleComponent_s *restrict TitleComponent;
    typedef struct TitleComponent_s *restrict TitleComponentRefMut;
    typedef struct TitleComponent_s const* TitleComponentRef;

    struct TitleComponentState_s;
    typedef struct TitleComponentState_s *restrict TitleComponentState;
    typedef struct TitleComponentState_s *restrict TitleComponentStateRefMut;
    typedef struct TitleComponentState_s const* TitleComponentStateRef;


    extern int32_t Attempt_index(AttemptRef self);
    extern TimeRef Attempt_time(AttemptRef self);

    extern HotkeySystem HotkeySystem_new(SharedTimer shared_timer);
    extern void HotkeySystem_drop(HotkeySystem self);

    extern PossibleTimeSaveComponent PossibleTimeSaveComponent_new(void);
    extern void PossibleTimeSaveComponent_drop(PossibleTimeSaveComponent self);
    extern char const* PossibleTimeSaveComponent_state_as_json(PossibleTimeSaveComponentRef self, TimerRef timer);
    extern PossibleTimeSaveComponentState PossibleTimeSaveComponent_state(PossibleTimeSaveComponentRef self, TimerRef timer);

    extern void PossibleTimeSaveComponentState_drop(PossibleTimeSaveComponentState self);
    extern char const* PossibleTimeSaveComponentState_text(PossibleTimeSaveComponentStateRef self);
    extern char const* PossibleTimeSaveComponentState_time(PossibleTimeSaveComponentStateRef self);

    extern PreviousSegmentComponent PreviousSegmentComponent_new(void);
    extern void PreviousSegmentComponent_drop(PreviousSegmentComponent self);
    extern char const* PreviousSegmentComponent_state_as_json(PreviousSegmentComponentRef self, TimerRef timer);
    extern PreviousSegmentComponentState PreviousSegmentComponent_state(PreviousSegmentComponentRef self, TimerRef timer);

    extern void PreviousSegmentComponentState_drop(PreviousSegmentComponentState self);
    extern char const* PreviousSegmentComponentState_text(PreviousSegmentComponentStateRef self);
    extern char const* PreviousSegmentComponentState_time(PreviousSegmentComponentStateRef self);

    extern Run Run_new(void);
    extern Run Run_parse(void const* data, size_t length);
    extern void Run_drop(Run self);
    extern char const* Run_game_name(RunRef self);
    extern char const* Run_game_icon(RunRef self);
    extern char const* Run_category_name(RunRef self);
    extern char const* Run_extended_file_name(RunRef self, uint8_t use_extended_category_name);
    extern char const* Run_extended_name(RunRef self, uint8_t use_extended_category_name);
    extern char const* Run_extended_category_name(RunRef self, uint8_t show_region, uint8_t show_platform, uint8_t show_variables);
    extern uint32_t Run_attempt_count(RunRef self);
    extern RunMetadataRef Run_metadata(RunRef self);
    extern TimeSpanRef Run_offset(RunRef self);
    extern size_t Run_len(RunRef self);
    extern SegmentRef Run_segment(RunRef self, size_t index);
    extern size_t Run_attempt_history_len(RunRef self);
    extern AttemptRef Run_attempt_history_index(RunRef self, size_t index);
    extern char const* Run_save_as_lss(RunRef self);
    extern void Run_push_segment(RunRefMut self, Segment segment);
    extern void Run_set_game_name(RunRefMut self, char const* game);
    extern void Run_set_category_name(RunRefMut self, char const* category);

    extern RunEditor RunEditor_new(Run run);
    extern Run RunEditor_close(RunEditor self);
    extern char const* RunEditor_state_as_json(RunEditorRefMut self);
    extern void RunEditor_select_timing_method(RunEditorRefMut self, uint8_t method);
    extern void RunEditor_unselect(RunEditorRefMut self, size_t index);
    extern void RunEditor_select_additionally(RunEditorRefMut self, size_t index);
    extern void RunEditor_select_only(RunEditorRefMut self, size_t index);
    extern void RunEditor_set_game_name(RunEditorRefMut self, char const* game);
    extern void RunEditor_set_category_name(RunEditorRefMut self, char const* category);
    extern uint8_t RunEditor_parse_and_set_offset(RunEditorRefMut self, char const* offset);
    extern uint8_t RunEditor_parse_and_set_attempt_count(RunEditorRefMut self, char const* attempts);
    extern void RunEditor_set_game_icon(RunEditorRefMut self, void const* data, size_t length);
    extern void RunEditor_insert_segment_above(RunEditorRefMut self);
    extern void RunEditor_insert_segment_below(RunEditorRefMut self);
    extern void RunEditor_remove_segments(RunEditorRefMut self);
    extern void RunEditor_move_segments_up(RunEditorRefMut self);
    extern void RunEditor_move_segments_down(RunEditorRefMut self);
    extern void RunEditor_selected_set_icon(RunEditorRefMut self, void const* data, size_t length);
    extern void RunEditor_selected_set_name(RunEditorRefMut self, char const* name);
    extern uint8_t RunEditor_selected_parse_and_set_split_time(RunEditorRefMut self, char const* time);
    extern uint8_t RunEditor_selected_parse_and_set_segment_time(RunEditorRefMut self, char const* time);
    extern uint8_t RunEditor_selected_parse_and_set_best_segment_time(RunEditorRefMut self, char const* time);
    extern uint8_t RunEditor_selected_parse_and_set_comparison_time(RunEditorRefMut self, char const* comparison, char const* time);

    extern char const* RunMetadata_run_id(RunMetadataRef self);
    extern char const* RunMetadata_platform_name(RunMetadataRef self);
    extern uint8_t RunMetadata_uses_emulator(RunMetadataRef self);
    extern char const* RunMetadata_region_name(RunMetadataRef self);

    extern Segment Segment_new(char const* name);
    extern void Segment_drop(Segment self);
    extern char const* Segment_name(SegmentRef self);
    extern char const* Segment_icon(SegmentRef self);
    extern TimeRef Segment_comparison(SegmentRef self, char const* comparison);
    extern TimeRef Segment_personal_best_split_time(SegmentRef self);
    extern TimeRef Segment_best_segment_time(SegmentRef self);
    extern SegmentHistoryRef Segment_segment_history(SegmentRef self);

    extern SegmentHistoryIter SegmentHistory_iter(SegmentHistoryRef self);

    extern int32_t SegmentHistoryElement_index(SegmentHistoryElementRef self);
    extern TimeRef SegmentHistoryElement_time(SegmentHistoryElementRef self);

    extern void SegmentHistoryIter_drop(SegmentHistoryIter self);
    extern SegmentHistoryElementRef SegmentHistoryIter_next(SegmentHistoryIterRefMut self);

    extern void SharedTimer_drop(SharedTimer self);
    extern SharedTimer SharedTimer_share(SharedTimerRef self);
    extern TimerReadLock SharedTimer_read(SharedTimerRef self);
    extern TimerWriteLock SharedTimer_write(SharedTimerRef self);

    extern SplitsComponent SplitsComponent_new(void);
    extern void SplitsComponent_drop(SplitsComponent self);
    extern char const* SplitsComponent_state_as_json(SplitsComponentRefMut self, TimerRef timer);
    extern SplitsComponentState SplitsComponent_state(SplitsComponentRefMut self, TimerRef timer);
    extern void SplitsComponent_scroll_up(SplitsComponentRefMut self);
    extern void SplitsComponent_scroll_down(SplitsComponentRefMut self);

    extern void SplitsComponentState_drop(SplitsComponentState self);
    extern uint8_t SplitsComponentState_final_separator_shown(SplitsComponentStateRef self);
    extern size_t SplitsComponentState_len(SplitsComponentStateRef self);
    extern char const* SplitsComponentState_icon_change(SplitsComponentStateRef self, size_t index);
    extern char const* SplitsComponentState_name(SplitsComponentStateRef self, size_t index);
    extern char const* SplitsComponentState_delta(SplitsComponentStateRef self, size_t index);
    extern char const* SplitsComponentState_time(SplitsComponentStateRef self, size_t index);
    extern char const* SplitsComponentState_color(SplitsComponentStateRef self, size_t index);
    extern uint8_t SplitsComponentState_is_current_split(SplitsComponentStateRef self, size_t index);

    extern SumOfBestComponent SumOfBestComponent_new(void);
    extern void SumOfBestComponent_drop(SumOfBestComponent self);
    extern char const* SumOfBestComponent_state_as_json(SumOfBestComponentRef self, TimerRef timer);
    extern SumOfBestComponentState SumOfBestComponent_state(SumOfBestComponentRef self, TimerRef timer);

    extern void SumOfBestComponentState_drop(SumOfBestComponentState self);
    extern char const* SumOfBestComponentState_text(SumOfBestComponentStateRef self);
    extern char const* SumOfBestComponentState_time(SumOfBestComponentStateRef self);

    extern void Time_drop(Time self);
    extern Time Time_clone(TimeRef self);
    extern TimeSpanRef Time_real_time(TimeRef self);
    extern TimeSpanRef Time_game_time(TimeRef self);
    extern TimeSpanRef Time_index(TimeRef self, uint8_t timing_method);

    extern TimeSpan TimeSpan_from_seconds(double seconds);
    extern void TimeSpan_drop(TimeSpan self);
    extern TimeSpan TimeSpan_clone(TimeSpanRef self);
    extern double TimeSpan_total_seconds(TimeSpanRef self);

    extern Timer Timer_new(Run run);
    extern SharedTimer Timer_into_shared(Timer self);
    extern void Timer_drop(Timer self);
    extern uint8_t Timer_current_timing_method(TimerRef self);
    extern char const* Timer_current_comparison(TimerRef self);
    extern uint8_t Timer_is_game_time_initialized(TimerRef self);
    extern uint8_t Timer_is_game_time_paused(TimerRef self);
    extern TimeSpanRef Timer_loading_times(TimerRef self);
    extern uint8_t Timer_current_phase(TimerRef self);
    extern RunRef Timer_get_run(TimerRef self);
    extern Run Timer_clone_run(TimerRef self);
    extern void Timer_print_debug(TimerRef self);
    extern void Timer_split(TimerRefMut self);
    extern void Timer_skip_split(TimerRefMut self);
    extern void Timer_undo_split(TimerRefMut self);
    extern void Timer_reset(TimerRefMut self, uint8_t update_splits);
    extern void Timer_pause(TimerRefMut self);
    extern void Timer_set_current_timing_method(TimerRefMut self, uint8_t method);
    extern void Timer_switch_to_next_comparison(TimerRefMut self);
    extern void Timer_switch_to_previous_comparison(TimerRefMut self);
    extern void Timer_initialize_game_time(TimerRefMut self);
    extern void Timer_uninitialize_game_time(TimerRefMut self);
    extern void Timer_pause_game_time(TimerRefMut self);
    extern void Timer_unpause_game_time(TimerRefMut self);
    extern void Timer_set_game_time(TimerRefMut self, TimeSpanRef time);
    extern void Timer_set_loading_times(TimerRefMut self, TimeSpanRef time);

    extern TimerComponent TimerComponent_new(void);
    extern void TimerComponent_drop(TimerComponent self);
    extern char const* TimerComponent_state_as_json(TimerComponentRef self, TimerRef timer);
    extern TimerComponentState TimerComponent_state(TimerComponentRef self, TimerRef timer);

    extern void TimerComponentState_drop(TimerComponentState self);
    extern char const* TimerComponentState_time(TimerComponentStateRef self);
    extern char const* TimerComponentState_fraction(TimerComponentStateRef self);
    extern char const* TimerComponentState_color(TimerComponentStateRef self);

    extern void TimerReadLock_drop(TimerReadLock self);
    extern TimerRef TimerReadLock_timer(TimerReadLockRef self);

    extern void TimerWriteLock_drop(TimerWriteLock self);
    extern TimerRefMut TimerWriteLock_timer(TimerWriteLockRefMut self);

    extern TitleComponent TitleComponent_new(void);
    extern void TitleComponent_drop(TitleComponent self);
    extern char const* TitleComponent_state_as_json(TitleComponentRefMut self, TimerRef timer);
    extern TitleComponentState TitleComponent_state(TitleComponentRefMut self, TimerRef timer);

    extern void TitleComponentState_drop(TitleComponentState self);
    extern char const* TitleComponentState_icon_change(TitleComponentStateRef self);
    extern char const* TitleComponentState_game(TitleComponentStateRef self);
    extern char const* TitleComponentState_category(TitleComponentStateRef self);
    extern uint32_t TitleComponentState_attempts(TitleComponentStateRef self);

#ifdef __cplusplus
    }
}
#endif

#endif
