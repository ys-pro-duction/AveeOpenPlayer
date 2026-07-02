package com.daaw;

import com.daaw.H31;

/* JADX INFO: renamed from: com.daaw.jl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5762jl0 {
    public static final C5762jl0 a = new C5762jl0();
    public static final long b = System.nanoTime();

    public final long a(long j) {
        return AbstractC6852ne0.b(c(), j, PE.C);
    }

    public long b() {
        return H31.a.a(c());
    }

    public final long c() {
        return System.nanoTime() - b;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
