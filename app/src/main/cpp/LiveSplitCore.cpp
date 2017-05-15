#include <jni.h>
#include <string>
#include "livesplit_core.h"

using namespace LiveSplit;

extern "C" JNIEXPORT jint Java_livesplitcore_LiveSplitCoreNative_Attempt_1index(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jint)(Attempt_index((AttemptRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Attempt_1time(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Attempt_time((AttemptRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_HotkeySystem_1new(JNIEnv* jni_env, jobject, jlong shared_timer) {
    auto result = (jlong)(HotkeySystem_new((SharedTimer)shared_timer));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_HotkeySystem_1drop(JNIEnv* jni_env, jobject, jlong self) {
    HotkeySystem_drop((HotkeySystem)self);
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_PossibleTimeSaveComponent_1new(JNIEnv* jni_env, jobject) {
    auto result = (jlong)(PossibleTimeSaveComponent_new());
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_PossibleTimeSaveComponent_1drop(JNIEnv* jni_env, jobject, jlong self) {
    PossibleTimeSaveComponent_drop((PossibleTimeSaveComponent)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_PossibleTimeSaveComponent_1stateAsJson(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = jni_env->NewStringUTF(PossibleTimeSaveComponent_state_as_json((PossibleTimeSaveComponentRef)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_PossibleTimeSaveComponent_1state(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = (jlong)(PossibleTimeSaveComponent_state((PossibleTimeSaveComponentRef)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_PossibleTimeSaveComponentState_1drop(JNIEnv* jni_env, jobject, jlong self) {
    PossibleTimeSaveComponentState_drop((PossibleTimeSaveComponentState)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_PossibleTimeSaveComponentState_1text(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(PossibleTimeSaveComponentState_text((PossibleTimeSaveComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_PossibleTimeSaveComponentState_1time(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(PossibleTimeSaveComponentState_time((PossibleTimeSaveComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_PreviousSegmentComponent_1new(JNIEnv* jni_env, jobject) {
    auto result = (jlong)(PreviousSegmentComponent_new());
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_PreviousSegmentComponent_1drop(JNIEnv* jni_env, jobject, jlong self) {
    PreviousSegmentComponent_drop((PreviousSegmentComponent)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_PreviousSegmentComponent_1stateAsJson(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = jni_env->NewStringUTF(PreviousSegmentComponent_state_as_json((PreviousSegmentComponentRef)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_PreviousSegmentComponent_1state(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = (jlong)(PreviousSegmentComponent_state((PreviousSegmentComponentRef)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_PreviousSegmentComponentState_1drop(JNIEnv* jni_env, jobject, jlong self) {
    PreviousSegmentComponentState_drop((PreviousSegmentComponentState)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_PreviousSegmentComponentState_1text(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(PreviousSegmentComponentState_text((PreviousSegmentComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_PreviousSegmentComponentState_1time(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(PreviousSegmentComponentState_time((PreviousSegmentComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Run_1new(JNIEnv* jni_env, jobject) {
    auto result = (jlong)(Run_new());
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Run_1parse(JNIEnv* jni_env, jobject, jlong data, jlong length) {
    auto result = (jlong)(Run_parse((void const*)data, (size_t)length));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Run_1drop(JNIEnv* jni_env, jobject, jlong self) {
    Run_drop((Run)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_Run_1gameName(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(Run_game_name((RunRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_Run_1gameIcon(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(Run_game_icon((RunRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_Run_1categoryName(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(Run_category_name((RunRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_Run_1extendedFileName(JNIEnv* jni_env, jobject, jlong self, jboolean use_extended_category_name) {
    auto result = jni_env->NewStringUTF(Run_extended_file_name((RunRef)self, (uint8_t)use_extended_category_name));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_Run_1extendedName(JNIEnv* jni_env, jobject, jlong self, jboolean use_extended_category_name) {
    auto result = jni_env->NewStringUTF(Run_extended_name((RunRef)self, (uint8_t)use_extended_category_name));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_Run_1extendedCategoryName(JNIEnv* jni_env, jobject, jlong self, jboolean show_region, jboolean show_platform, jboolean show_variables) {
    auto result = jni_env->NewStringUTF(Run_extended_category_name((RunRef)self, (uint8_t)show_region, (uint8_t)show_platform, (uint8_t)show_variables));
    return result;
}

extern "C" JNIEXPORT jint Java_livesplitcore_LiveSplitCoreNative_Run_1attemptCount(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jint)(Run_attempt_count((RunRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Run_1metadata(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Run_metadata((RunRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Run_1offset(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Run_offset((RunRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Run_1len(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Run_len((RunRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Run_1segment(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    auto result = (jlong)(Run_segment((RunRef)self, (size_t)index));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Run_1attemptHistoryLen(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Run_attempt_history_len((RunRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Run_1attemptHistoryIndex(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    auto result = (jlong)(Run_attempt_history_index((RunRef)self, (size_t)index));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_Run_1saveAsLss(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(Run_save_as_lss((RunRef)self));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Run_1pushSegment(JNIEnv* jni_env, jobject, jlong self, jlong segment) {
    Run_push_segment((RunRefMut)self, (Segment)segment);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Run_1setGameName(JNIEnv* jni_env, jobject, jlong self, jstring game) {
    auto cstr_game = jni_env->GetStringUTFChars(game, nullptr);
    Run_set_game_name((RunRefMut)self, cstr_game);
    jni_env->ReleaseStringUTFChars(game, cstr_game);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Run_1setCategoryName(JNIEnv* jni_env, jobject, jlong self, jstring category) {
    auto cstr_category = jni_env->GetStringUTFChars(category, nullptr);
    Run_set_category_name((RunRefMut)self, cstr_category);
    jni_env->ReleaseStringUTFChars(category, cstr_category);
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_RunEditor_1new(JNIEnv* jni_env, jobject, jlong run) {
    auto result = (jlong)(RunEditor_new((Run)run));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_RunEditor_1close(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(RunEditor_close((RunEditor)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_RunEditor_1stateAsJson(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(RunEditor_state_as_json((RunEditorRefMut)self));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1selectTimingMethod(JNIEnv* jni_env, jobject, jlong self, jbyte method) {
    RunEditor_select_timing_method((RunEditorRefMut)self, (uint8_t)method);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1unselect(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    RunEditor_unselect((RunEditorRefMut)self, (size_t)index);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1selectAdditionally(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    RunEditor_select_additionally((RunEditorRefMut)self, (size_t)index);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1selectOnly(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    RunEditor_select_only((RunEditorRefMut)self, (size_t)index);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1setGameName(JNIEnv* jni_env, jobject, jlong self, jstring game) {
    auto cstr_game = jni_env->GetStringUTFChars(game, nullptr);
    RunEditor_set_game_name((RunEditorRefMut)self, cstr_game);
    jni_env->ReleaseStringUTFChars(game, cstr_game);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1setCategoryName(JNIEnv* jni_env, jobject, jlong self, jstring category) {
    auto cstr_category = jni_env->GetStringUTFChars(category, nullptr);
    RunEditor_set_category_name((RunEditorRefMut)self, cstr_category);
    jni_env->ReleaseStringUTFChars(category, cstr_category);
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_RunEditor_1parseAndSetOffset(JNIEnv* jni_env, jobject, jlong self, jstring offset) {
    auto cstr_offset = jni_env->GetStringUTFChars(offset, nullptr);
    auto result = (jboolean)(RunEditor_parse_and_set_offset((RunEditorRefMut)self, cstr_offset));
    jni_env->ReleaseStringUTFChars(offset, cstr_offset);
    return result;
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_RunEditor_1parseAndSetAttemptCount(JNIEnv* jni_env, jobject, jlong self, jstring attempts) {
    auto cstr_attempts = jni_env->GetStringUTFChars(attempts, nullptr);
    auto result = (jboolean)(RunEditor_parse_and_set_attempt_count((RunEditorRefMut)self, cstr_attempts));
    jni_env->ReleaseStringUTFChars(attempts, cstr_attempts);
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1setGameIcon(JNIEnv* jni_env, jobject, jlong self, jlong data, jlong length) {
    RunEditor_set_game_icon((RunEditorRefMut)self, (void const*)data, (size_t)length);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1insertSegmentAbove(JNIEnv* jni_env, jobject, jlong self) {
    RunEditor_insert_segment_above((RunEditorRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1insertSegmentBelow(JNIEnv* jni_env, jobject, jlong self) {
    RunEditor_insert_segment_below((RunEditorRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1removeSegments(JNIEnv* jni_env, jobject, jlong self) {
    RunEditor_remove_segments((RunEditorRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1moveSegmentsUp(JNIEnv* jni_env, jobject, jlong self) {
    RunEditor_move_segments_up((RunEditorRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1moveSegmentsDown(JNIEnv* jni_env, jobject, jlong self) {
    RunEditor_move_segments_down((RunEditorRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1selectedSetIcon(JNIEnv* jni_env, jobject, jlong self, jlong data, jlong length) {
    RunEditor_selected_set_icon((RunEditorRefMut)self, (void const*)data, (size_t)length);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_RunEditor_1selectedSetName(JNIEnv* jni_env, jobject, jlong self, jstring name) {
    auto cstr_name = jni_env->GetStringUTFChars(name, nullptr);
    RunEditor_selected_set_name((RunEditorRefMut)self, cstr_name);
    jni_env->ReleaseStringUTFChars(name, cstr_name);
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_RunEditor_1selectedParseAndSetSplitTime(JNIEnv* jni_env, jobject, jlong self, jstring time) {
    auto cstr_time = jni_env->GetStringUTFChars(time, nullptr);
    auto result = (jboolean)(RunEditor_selected_parse_and_set_split_time((RunEditorRefMut)self, cstr_time));
    jni_env->ReleaseStringUTFChars(time, cstr_time);
    return result;
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_RunEditor_1selectedParseAndSetSegmentTime(JNIEnv* jni_env, jobject, jlong self, jstring time) {
    auto cstr_time = jni_env->GetStringUTFChars(time, nullptr);
    auto result = (jboolean)(RunEditor_selected_parse_and_set_segment_time((RunEditorRefMut)self, cstr_time));
    jni_env->ReleaseStringUTFChars(time, cstr_time);
    return result;
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_RunEditor_1selectedParseAndSetBestSegmentTime(JNIEnv* jni_env, jobject, jlong self, jstring time) {
    auto cstr_time = jni_env->GetStringUTFChars(time, nullptr);
    auto result = (jboolean)(RunEditor_selected_parse_and_set_best_segment_time((RunEditorRefMut)self, cstr_time));
    jni_env->ReleaseStringUTFChars(time, cstr_time);
    return result;
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_RunEditor_1selectedParseAndSetComparisonTime(JNIEnv* jni_env, jobject, jlong self, jstring comparison, jstring time) {
    auto cstr_comparison = jni_env->GetStringUTFChars(comparison, nullptr);
    auto cstr_time = jni_env->GetStringUTFChars(time, nullptr);
    auto result = (jboolean)(RunEditor_selected_parse_and_set_comparison_time((RunEditorRefMut)self, cstr_comparison, cstr_time));
    jni_env->ReleaseStringUTFChars(comparison, cstr_comparison);
    jni_env->ReleaseStringUTFChars(time, cstr_time);
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_RunMetadata_1runId(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(RunMetadata_run_id((RunMetadataRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_RunMetadata_1platformName(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(RunMetadata_platform_name((RunMetadataRef)self));
    return result;
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_RunMetadata_1usesEmulator(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jboolean)(RunMetadata_uses_emulator((RunMetadataRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_RunMetadata_1regionName(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(RunMetadata_region_name((RunMetadataRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Segment_1new(JNIEnv* jni_env, jobject, jstring name) {
    auto cstr_name = jni_env->GetStringUTFChars(name, nullptr);
    auto result = (jlong)(Segment_new(cstr_name));
    jni_env->ReleaseStringUTFChars(name, cstr_name);
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Segment_1drop(JNIEnv* jni_env, jobject, jlong self) {
    Segment_drop((Segment)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_Segment_1name(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(Segment_name((SegmentRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_Segment_1icon(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(Segment_icon((SegmentRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Segment_1comparison(JNIEnv* jni_env, jobject, jlong self, jstring comparison) {
    auto cstr_comparison = jni_env->GetStringUTFChars(comparison, nullptr);
    auto result = (jlong)(Segment_comparison((SegmentRef)self, cstr_comparison));
    jni_env->ReleaseStringUTFChars(comparison, cstr_comparison);
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Segment_1personalBestSplitTime(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Segment_personal_best_split_time((SegmentRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Segment_1bestSegmentTime(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Segment_best_segment_time((SegmentRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Segment_1segmentHistory(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Segment_segment_history((SegmentRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SegmentHistory_1iter(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(SegmentHistory_iter((SegmentHistoryRef)self));
    return result;
}

extern "C" JNIEXPORT jint Java_livesplitcore_LiveSplitCoreNative_SegmentHistoryElement_1index(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jint)(SegmentHistoryElement_index((SegmentHistoryElementRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SegmentHistoryElement_1time(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(SegmentHistoryElement_time((SegmentHistoryElementRef)self));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_SegmentHistoryIter_1drop(JNIEnv* jni_env, jobject, jlong self) {
    SegmentHistoryIter_drop((SegmentHistoryIter)self);
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SegmentHistoryIter_1next(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(SegmentHistoryIter_next((SegmentHistoryIterRefMut)self));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_SharedTimer_1drop(JNIEnv* jni_env, jobject, jlong self) {
    SharedTimer_drop((SharedTimer)self);
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SharedTimer_1share(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(SharedTimer_share((SharedTimerRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SharedTimer_1read(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(SharedTimer_read((SharedTimerRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SharedTimer_1write(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(SharedTimer_write((SharedTimerRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SplitsComponent_1new(JNIEnv* jni_env, jobject) {
    auto result = (jlong)(SplitsComponent_new());
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_SplitsComponent_1drop(JNIEnv* jni_env, jobject, jlong self) {
    SplitsComponent_drop((SplitsComponent)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_SplitsComponent_1stateAsJson(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = jni_env->NewStringUTF(SplitsComponent_state_as_json((SplitsComponentRefMut)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SplitsComponent_1state(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = (jlong)(SplitsComponent_state((SplitsComponentRefMut)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_SplitsComponent_1scrollUp(JNIEnv* jni_env, jobject, jlong self) {
    SplitsComponent_scroll_up((SplitsComponentRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_SplitsComponent_1scrollDown(JNIEnv* jni_env, jobject, jlong self) {
    SplitsComponent_scroll_down((SplitsComponentRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_SplitsComponentState_1drop(JNIEnv* jni_env, jobject, jlong self) {
    SplitsComponentState_drop((SplitsComponentState)self);
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_SplitsComponentState_1finalSeparatorShown(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jboolean)(SplitsComponentState_final_separator_shown((SplitsComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SplitsComponentState_1len(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(SplitsComponentState_len((SplitsComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_SplitsComponentState_1iconChange(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    auto result = jni_env->NewStringUTF(SplitsComponentState_icon_change((SplitsComponentStateRef)self, (size_t)index));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_SplitsComponentState_1name(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    auto result = jni_env->NewStringUTF(SplitsComponentState_name((SplitsComponentStateRef)self, (size_t)index));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_SplitsComponentState_1delta(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    auto result = jni_env->NewStringUTF(SplitsComponentState_delta((SplitsComponentStateRef)self, (size_t)index));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_SplitsComponentState_1time(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    auto result = jni_env->NewStringUTF(SplitsComponentState_time((SplitsComponentStateRef)self, (size_t)index));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_SplitsComponentState_1color(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    auto result = jni_env->NewStringUTF(SplitsComponentState_color((SplitsComponentStateRef)self, (size_t)index));
    return result;
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_SplitsComponentState_1isCurrentSplit(JNIEnv* jni_env, jobject, jlong self, jlong index) {
    auto result = (jboolean)(SplitsComponentState_is_current_split((SplitsComponentStateRef)self, (size_t)index));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SumOfBestComponent_1new(JNIEnv* jni_env, jobject) {
    auto result = (jlong)(SumOfBestComponent_new());
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_SumOfBestComponent_1drop(JNIEnv* jni_env, jobject, jlong self) {
    SumOfBestComponent_drop((SumOfBestComponent)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_SumOfBestComponent_1stateAsJson(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = jni_env->NewStringUTF(SumOfBestComponent_state_as_json((SumOfBestComponentRef)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_SumOfBestComponent_1state(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = (jlong)(SumOfBestComponent_state((SumOfBestComponentRef)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_SumOfBestComponentState_1drop(JNIEnv* jni_env, jobject, jlong self) {
    SumOfBestComponentState_drop((SumOfBestComponentState)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_SumOfBestComponentState_1text(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(SumOfBestComponentState_text((SumOfBestComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_SumOfBestComponentState_1time(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(SumOfBestComponentState_time((SumOfBestComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Time_1drop(JNIEnv* jni_env, jobject, jlong self) {
    Time_drop((Time)self);
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Time_1clone(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Time_clone((TimeRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Time_1realTime(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Time_real_time((TimeRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Time_1gameTime(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Time_game_time((TimeRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Time_1index(JNIEnv* jni_env, jobject, jlong self, jbyte timing_method) {
    auto result = (jlong)(Time_index((TimeRef)self, (uint8_t)timing_method));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_TimeSpan_1fromSeconds(JNIEnv* jni_env, jobject, jdouble seconds) {
    auto result = (jlong)(TimeSpan_from_seconds((double)seconds));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_TimeSpan_1drop(JNIEnv* jni_env, jobject, jlong self) {
    TimeSpan_drop((TimeSpan)self);
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_TimeSpan_1clone(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(TimeSpan_clone((TimeSpanRef)self));
    return result;
}

extern "C" JNIEXPORT jdouble Java_livesplitcore_LiveSplitCoreNative_TimeSpan_1totalSeconds(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jdouble)(TimeSpan_total_seconds((TimeSpanRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Timer_1new(JNIEnv* jni_env, jobject, jlong run) {
    auto result = (jlong)(Timer_new((Run)run));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Timer_1intoShared(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Timer_into_shared((Timer)self));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1drop(JNIEnv* jni_env, jobject, jlong self) {
    Timer_drop((Timer)self);
}

extern "C" JNIEXPORT jbyte Java_livesplitcore_LiveSplitCoreNative_Timer_1currentTimingMethod(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jbyte)(Timer_current_timing_method((TimerRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_Timer_1currentComparison(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(Timer_current_comparison((TimerRef)self));
    return result;
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_Timer_1isGameTimeInitialized(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jboolean)(Timer_is_game_time_initialized((TimerRef)self));
    return result;
}

extern "C" JNIEXPORT jboolean Java_livesplitcore_LiveSplitCoreNative_Timer_1isGameTimePaused(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jboolean)(Timer_is_game_time_paused((TimerRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Timer_1loadingTimes(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Timer_loading_times((TimerRef)self));
    return result;
}

extern "C" JNIEXPORT jbyte Java_livesplitcore_LiveSplitCoreNative_Timer_1currentPhase(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jbyte)(Timer_current_phase((TimerRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Timer_1getRun(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Timer_get_run((TimerRef)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_Timer_1cloneRun(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(Timer_clone_run((TimerRef)self));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1printDebug(JNIEnv* jni_env, jobject, jlong self) {
    Timer_print_debug((TimerRef)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1split(JNIEnv* jni_env, jobject, jlong self) {
    Timer_split((TimerRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1skipSplit(JNIEnv* jni_env, jobject, jlong self) {
    Timer_skip_split((TimerRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1undoSplit(JNIEnv* jni_env, jobject, jlong self) {
    Timer_undo_split((TimerRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1reset(JNIEnv* jni_env, jobject, jlong self, jboolean update_splits) {
    Timer_reset((TimerRefMut)self, (uint8_t)update_splits);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1pause(JNIEnv* jni_env, jobject, jlong self) {
    Timer_pause((TimerRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1setCurrentTimingMethod(JNIEnv* jni_env, jobject, jlong self, jbyte method) {
    Timer_set_current_timing_method((TimerRefMut)self, (uint8_t)method);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1switchToNextComparison(JNIEnv* jni_env, jobject, jlong self) {
    Timer_switch_to_next_comparison((TimerRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1switchToPreviousComparison(JNIEnv* jni_env, jobject, jlong self) {
    Timer_switch_to_previous_comparison((TimerRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1initializeGameTime(JNIEnv* jni_env, jobject, jlong self) {
    Timer_initialize_game_time((TimerRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1uninitializeGameTime(JNIEnv* jni_env, jobject, jlong self) {
    Timer_uninitialize_game_time((TimerRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1pauseGameTime(JNIEnv* jni_env, jobject, jlong self) {
    Timer_pause_game_time((TimerRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1unpauseGameTime(JNIEnv* jni_env, jobject, jlong self) {
    Timer_unpause_game_time((TimerRefMut)self);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1setGameTime(JNIEnv* jni_env, jobject, jlong self, jlong time) {
    Timer_set_game_time((TimerRefMut)self, (TimeSpanRef)time);
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_Timer_1setLoadingTimes(JNIEnv* jni_env, jobject, jlong self, jlong time) {
    Timer_set_loading_times((TimerRefMut)self, (TimeSpanRef)time);
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_TimerComponent_1new(JNIEnv* jni_env, jobject) {
    auto result = (jlong)(TimerComponent_new());
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_TimerComponent_1drop(JNIEnv* jni_env, jobject, jlong self) {
    TimerComponent_drop((TimerComponent)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_TimerComponent_1stateAsJson(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = jni_env->NewStringUTF(TimerComponent_state_as_json((TimerComponentRef)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_TimerComponent_1state(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = (jlong)(TimerComponent_state((TimerComponentRef)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_TimerComponentState_1drop(JNIEnv* jni_env, jobject, jlong self) {
    TimerComponentState_drop((TimerComponentState)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_TimerComponentState_1time(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(TimerComponentState_time((TimerComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_TimerComponentState_1fraction(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(TimerComponentState_fraction((TimerComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_TimerComponentState_1color(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(TimerComponentState_color((TimerComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_TimerReadLock_1drop(JNIEnv* jni_env, jobject, jlong self) {
    TimerReadLock_drop((TimerReadLock)self);
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_TimerReadLock_1timer(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(TimerReadLock_timer((TimerReadLockRef)self));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_TimerWriteLock_1drop(JNIEnv* jni_env, jobject, jlong self) {
    TimerWriteLock_drop((TimerWriteLock)self);
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_TimerWriteLock_1timer(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jlong)(TimerWriteLock_timer((TimerWriteLockRefMut)self));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_TitleComponent_1new(JNIEnv* jni_env, jobject) {
    auto result = (jlong)(TitleComponent_new());
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_TitleComponent_1drop(JNIEnv* jni_env, jobject, jlong self) {
    TitleComponent_drop((TitleComponent)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_TitleComponent_1stateAsJson(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = jni_env->NewStringUTF(TitleComponent_state_as_json((TitleComponentRefMut)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT jlong Java_livesplitcore_LiveSplitCoreNative_TitleComponent_1state(JNIEnv* jni_env, jobject, jlong self, jlong timer) {
    auto result = (jlong)(TitleComponent_state((TitleComponentRefMut)self, (TimerRef)timer));
    return result;
}

extern "C" JNIEXPORT void Java_livesplitcore_LiveSplitCoreNative_TitleComponentState_1drop(JNIEnv* jni_env, jobject, jlong self) {
    TitleComponentState_drop((TitleComponentState)self);
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_TitleComponentState_1iconChange(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(TitleComponentState_icon_change((TitleComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_TitleComponentState_1game(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(TitleComponentState_game((TitleComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jstring Java_livesplitcore_LiveSplitCoreNative_TitleComponentState_1category(JNIEnv* jni_env, jobject, jlong self) {
    auto result = jni_env->NewStringUTF(TitleComponentState_category((TitleComponentStateRef)self));
    return result;
}

extern "C" JNIEXPORT jint Java_livesplitcore_LiveSplitCoreNative_TitleComponentState_1attempts(JNIEnv* jni_env, jobject, jlong self) {
    auto result = (jint)(TitleComponentState_attempts((TitleComponentStateRef)self));
    return result;
}
