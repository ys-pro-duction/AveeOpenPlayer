package com.daaw;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.daaw.cF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3660cF0 {
    public static final Rect a(C3103aF0 c3103aF0) {
        G10.g(c3103aF0, "<this>");
        return new Rect((int) c3103aF0.f(), (int) c3103aF0.i(), (int) c3103aF0.g(), (int) c3103aF0.c());
    }

    public static final RectF b(C3103aF0 c3103aF0) {
        G10.g(c3103aF0, "<this>");
        return new RectF(c3103aF0.f(), c3103aF0.i(), c3103aF0.g(), c3103aF0.c());
    }

    public static final C3103aF0 c(Rect rect) {
        G10.g(rect, "<this>");
        return new C3103aF0(rect.left, rect.top, rect.right, rect.bottom);
    }
}
