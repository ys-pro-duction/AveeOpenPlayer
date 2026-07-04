package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.Dw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0707Dw2 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public C0594Cw2 b;

    public final C0594Cw2 a() {
        return this.b;
    }

    public final void b(C0594Cw2 c0594Cw2) {
        this.b = c0594Cw2;
    }

    public final void c(boolean z) {
        this.a.set(true);
    }

    public final boolean d() {
        return this.a.get();
    }
}
