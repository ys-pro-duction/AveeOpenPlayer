package com.daaw;

import com.daaw.InterfaceC1792Oi0;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: renamed from: com.daaw.vw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9178vw0 {
    public final L31 a;
    public final Object b;
    public final InterfaceC1792Oi0.a c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final TrackGroupArray h;
    public final C4173e51 i;
    public volatile long j;
    public volatile long k;

    public C9178vw0(L31 l31, long j, TrackGroupArray trackGroupArray, C4173e51 c4173e51) {
        this(l31, null, new InterfaceC1792Oi0.a(0), j, -9223372036854775807L, 1, false, trackGroupArray, c4173e51);
    }

    public static void a(C9178vw0 c9178vw0, C9178vw0 c9178vw02) {
        c9178vw02.j = c9178vw0.j;
        c9178vw02.k = c9178vw0.k;
    }

    public C9178vw0 b(boolean z) {
        C9178vw0 c9178vw0 = new C9178vw0(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i);
        a(this, c9178vw0);
        return c9178vw0;
    }

    public C9178vw0 c(int i) {
        C9178vw0 c9178vw0 = new C9178vw0(this.a, this.b, this.c.a(i), this.d, this.e, this.f, this.g, this.h, this.i);
        a(this, c9178vw0);
        return c9178vw0;
    }

    public C9178vw0 d(int i) {
        C9178vw0 c9178vw0 = new C9178vw0(this.a, this.b, this.c, this.d, this.e, i, this.g, this.h, this.i);
        a(this, c9178vw0);
        return c9178vw0;
    }

    public C9178vw0 e(L31 l31, Object obj) {
        C9178vw0 c9178vw0 = new C9178vw0(l31, obj, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        a(this, c9178vw0);
        return c9178vw0;
    }

    public C9178vw0 f(TrackGroupArray trackGroupArray, C4173e51 c4173e51) {
        C9178vw0 c9178vw0 = new C9178vw0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, trackGroupArray, c4173e51);
        a(this, c9178vw0);
        return c9178vw0;
    }

    public C9178vw0 g(InterfaceC1792Oi0.a aVar, long j, long j2) {
        return new C9178vw0(this.a, this.b, aVar, j, aVar.b() ? j2 : -9223372036854775807L, this.f, this.g, this.h, this.i);
    }

    public C9178vw0(L31 l31, Object obj, InterfaceC1792Oi0.a aVar, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, C4173e51 c4173e51) {
        this.a = l31;
        this.b = obj;
        this.c = aVar;
        this.d = j;
        this.e = j2;
        this.j = j;
        this.k = j;
        this.f = i;
        this.g = z;
        this.h = trackGroupArray;
        this.i = c4173e51;
    }
}
