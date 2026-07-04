package com.daaw;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Uc3 {
    public static C3519bk3 a(Context context, Cd3 cd3, boolean z) {
        Tj3 tj3L = Tj3.l(context);
        if (tj3L == null) {
            AbstractC3305ay2.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new C3519bk3(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            cd3.g(tj3L);
        }
        return new C3519bk3(tj3L.g());
    }
}
