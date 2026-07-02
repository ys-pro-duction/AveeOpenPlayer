package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.sx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8338sx0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final List h;
    public final long i;

    public /* synthetic */ C8338sx0(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2, j3, j4, z, i, z2, list, j5);
    }

    public final boolean a() {
        return this.e;
    }

    public final List b() {
        return this.h;
    }

    public final long c() {
        return this.a;
    }

    public final boolean d() {
        return this.g;
    }

    public final long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8338sx0)) {
            return false;
        }
        C8338sx0 c8338sx0 = (C8338sx0) obj;
        return C6944nx0.d(this.a, c8338sx0.a) && this.b == c8338sx0.b && C9982yp0.i(this.c, c8338sx0.c) && C9982yp0.i(this.d, c8338sx0.d) && this.e == c8338sx0.e && AbstractC10298zx0.g(this.f, c8338sx0.f) && this.g == c8338sx0.g && G10.c(this.h, c8338sx0.h) && C9982yp0.i(this.i, c8338sx0.i);
    }

    public final long f() {
        return this.c;
    }

    public final long g() {
        return this.i;
    }

    public final int h() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iE = ((((((C6944nx0.e(this.a) * 31) + AbstractC2687Ws.a(this.b)) * 31) + C9982yp0.n(this.c)) * 31) + C9982yp0.n(this.d)) * 31;
        boolean z = this.e;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iH = (((iE + r1) * 31) + AbstractC10298zx0.h(this.f)) * 31;
        boolean z2 = this.g;
        return ((((iH + (z2 ? 1 : z2)) * 31) + this.h.hashCode()) * 31) + C9982yp0.n(this.i);
    }

    public final long i() {
        return this.b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) C6944nx0.f(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) C9982yp0.s(this.c)) + ", position=" + ((Object) C9982yp0.s(this.d)) + ", down=" + this.e + ", type=" + ((Object) AbstractC10298zx0.i(this.f)) + ", issuesEnterExit=" + this.g + ", historical=" + this.h + ", scrollDelta=" + ((Object) C9982yp0.s(this.i)) + ')';
    }

    public C8338sx0(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = i;
        this.g = z2;
        this.h = list;
        this.i = j5;
    }
}
