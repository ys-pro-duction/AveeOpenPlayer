package com.daaw;

import com.daaw.InterfaceC1792Oi0;

/* JADX INFO: renamed from: com.daaw.xi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9668xi0 {
    public final InterfaceC1792Oi0.a a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;

    public C9668xi0(InterfaceC1792Oi0.a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
    }

    public C9668xi0 a(int i) {
        return new C9668xi0(this.a.a(i), this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public C9668xi0 b(long j) {
        return new C9668xi0(this.a, j, this.c, this.d, this.e, this.f, this.g);
    }
}
