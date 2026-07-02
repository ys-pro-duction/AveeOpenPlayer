package com.daaw;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class D8 {
    public static final D8 a = new D8();

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        G10.g(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        G10.g(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        G10.g(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        G10.g(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
