package com.daaw;

import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.hr3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5236hr3 extends AbstractC8657u52 {
    public static final Object k = new Object();
    public static final YL1 l;
    public final long f;
    public final long g;
    public final boolean h;
    public final YL1 i;
    public final C4222eG1 j;

    static {
        C2705Ww1 c2705Ww1 = new C2705Ww1();
        c2705Ww1.a("SinglePeriodTimeline");
        c2705Ww1.b(Uri.EMPTY);
        l = c2705Ww1.c();
    }

    public C5236hr3(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, YL1 yl1, C4222eG1 c4222eG1) {
        this.f = j4;
        this.g = j5;
        this.h = z;
        yl1.getClass();
        this.i = yl1;
        this.j = c4222eG1;
    }

    @Override // com.daaw.AbstractC8657u52
    public final int a(Object obj) {
        return k.equals(obj) ? 0 : -1;
    }

    @Override // com.daaw.AbstractC8657u52
    public final int b() {
        return 1;
    }

    @Override // com.daaw.AbstractC8657u52
    public final int c() {
        return 1;
    }

    @Override // com.daaw.AbstractC8657u52
    public final H32 d(int i, H32 h32, boolean z) {
        AbstractC6048km2.a(i, 0, 1);
        h32.l(null, z ? k : null, 0, this.f, 0L, B82.e, false);
        return h32;
    }

    @Override // com.daaw.AbstractC8657u52
    public final Q42 e(int i, Q42 q42, long j) {
        AbstractC6048km2.a(i, 0, 1);
        Object obj = Q42.p;
        YL1 yl1 = this.i;
        long j2 = this.g;
        q42.a(obj, yl1, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.h, false, this.j, 0L, j2, 0, 0, 0L);
        return q42;
    }

    @Override // com.daaw.AbstractC8657u52
    public final Object f(int i) {
        AbstractC6048km2.a(i, 0, 1);
        return k;
    }
}
