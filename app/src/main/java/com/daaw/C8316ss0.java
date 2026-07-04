package com.daaw;

import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.daaw.ss0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8316ss0 {
    public static final C8316ss0 a = new C8316ss0();

    public static final void a(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        G10.g(paint, "paint");
        G10.g(charSequence, "text");
        G10.g(rect, "rect");
        paint.getTextBounds(charSequence, i, i2, rect);
    }
}
