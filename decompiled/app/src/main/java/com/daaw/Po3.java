package com.daaw;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Po3 {
    public static void a(C9422wo3 c9422wo3, C3519bk3 c3519bk3) {
        LogSessionId logSessionIdA = c3519bk3.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c9422wo3.b.setString("log-session-id", logSessionIdA.getStringId());
    }
}
