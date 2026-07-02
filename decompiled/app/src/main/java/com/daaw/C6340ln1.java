package com.daaw;

/* JADX INFO: renamed from: com.daaw.ln1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6340ln1 {
    public static final C6340ln1 d = new C6340ln1(-3, -9223372036854775807L, -1);
    public final int a;
    public final long b;
    public final long c;

    public C6340ln1(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public static C6340ln1 d(long j, long j2) {
        return new C6340ln1(-1, j, j2);
    }

    public static C6340ln1 e(long j) {
        return new C6340ln1(0, -9223372036854775807L, j);
    }

    public static C6340ln1 f(long j, long j2) {
        return new C6340ln1(-2, j, j2);
    }
}
