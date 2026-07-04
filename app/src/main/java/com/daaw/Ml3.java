package com.daaw;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ml3 {
    public static void a(AudioTrack audioTrack, C3519bk3 c3519bk3) {
        LogSessionId logSessionIdA = c3519bk3.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdA);
    }
}
