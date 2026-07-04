package com.daaw;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Wt3 {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            AbstractC3305ay2.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
