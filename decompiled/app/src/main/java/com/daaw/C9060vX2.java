package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.vX2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9060vX2 {
    public static final C9060vX2 b = new C9060vX2();
    public static final C8774uX2 c = new C8774uX2(null);
    public final AtomicReference a = new AtomicReference();

    public static C9060vX2 a() {
        return b;
    }

    public final LZ2 b() {
        LZ2 lz2 = (LZ2) this.a.get();
        return lz2 == null ? c : lz2;
    }
}
