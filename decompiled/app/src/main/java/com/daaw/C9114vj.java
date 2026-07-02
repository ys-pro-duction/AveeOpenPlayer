package com.daaw;

import android.graphics.Canvas;

/* JADX INFO: renamed from: com.daaw.vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9114vj {
    public static final C9114vj a = new C9114vj();

    public final void a(Canvas canvas, boolean z) {
        G10.g(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
