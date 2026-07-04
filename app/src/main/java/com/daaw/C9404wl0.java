package com.daaw;

import android.view.MotionEvent;

/* JADX INFO: renamed from: com.daaw.wl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9404wl0 {
    public static final C9404wl0 a = new C9404wl0();

    public final long a(MotionEvent motionEvent, int i) {
        G10.g(motionEvent, "motionEvent");
        return AbstractC0460Bp0.a(motionEvent.getRawX(i), motionEvent.getRawY(i));
    }
}
