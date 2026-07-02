package com.daaw;

import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.kB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5887kB1 {
    public final InputStream a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final boolean e;

    public C5887kB1(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.a = inputStream;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = z3;
    }

    public static C5887kB1 b(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new C5887kB1(inputStream, z, z2, j, z3);
    }

    public final long a() {
        return this.d;
    }

    public final InputStream c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.c;
    }
}
