package com.daaw;

import android.graphics.Rect;

/* JADX INFO: renamed from: com.daaw.vP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9026vP0 {
    public final C8461tP0 a;
    public final Rect b;

    public C9026vP0(C8461tP0 c8461tP0, Rect rect) {
        G10.g(c8461tP0, "semanticsNode");
        G10.g(rect, "adjustedBounds");
        this.a = c8461tP0;
        this.b = rect;
    }

    public final Rect a() {
        return this.b;
    }

    public final C8461tP0 b() {
        return this.a;
    }
}
