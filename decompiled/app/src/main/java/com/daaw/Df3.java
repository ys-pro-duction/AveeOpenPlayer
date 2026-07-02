package com.daaw;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Df3 {
    public static final Vp3 t = new Vp3(new Object(), -1);
    public final AbstractC8657u52 a;
    public final Vp3 b;
    public final long c;
    public final long d;
    public final int e;
    public final Sa3 f;
    public final boolean g;
    public final C6362lr3 h;
    public final Ds3 i;
    public final List j;
    public final Vp3 k;
    public final boolean l;
    public final int m;
    public final C7375pW1 n;
    public final boolean o;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public Df3(AbstractC8657u52 abstractC8657u52, Vp3 vp3, long j, long j2, int i, Sa3 sa3, boolean z, C6362lr3 c6362lr3, Ds3 ds3, List list, Vp3 vp32, boolean z2, int i2, C7375pW1 c7375pW1, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = abstractC8657u52;
        this.b = vp3;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = sa3;
        this.g = z;
        this.h = c6362lr3;
        this.i = ds3;
        this.j = list;
        this.k = vp32;
        this.l = z2;
        this.m = i2;
        this.n = c7375pW1;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.o = z3;
    }

    public static Df3 i(Ds3 ds3) {
        AbstractC8657u52 abstractC8657u52 = AbstractC8657u52.a;
        Vp3 vp3 = t;
        return new Df3(abstractC8657u52, vp3, -9223372036854775807L, 0L, 1, null, false, C6362lr3.d, ds3, OP2.J(), vp3, false, 0, C7375pW1.d, 0L, 0L, 0L, 0L, false);
    }

    public static Vp3 j() {
        return t;
    }

    public final long a() {
        long j;
        long j2;
        if (!k()) {
            return this.r;
        }
        do {
            j = this.s;
            j2 = this.r;
        } while (j != this.s);
        return AbstractC9004vJ2.C(AbstractC9004vJ2.E(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.n.a)));
    }

    public final Df3 b() {
        return new Df3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, a(), SystemClock.elapsedRealtime(), this.o);
    }

    public final Df3 c(Vp3 vp3) {
        return new Df3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, vp3, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final Df3 d(Vp3 vp3, long j, long j2, long j3, long j4, C6362lr3 c6362lr3, Ds3 ds3, List list) {
        Vp3 vp32 = this.k;
        boolean z = this.l;
        int i = this.m;
        C7375pW1 c7375pW1 = this.n;
        long j5 = this.p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.o;
        return new Df3(this.a, vp3, j2, j3, this.e, this.f, this.g, c6362lr3, ds3, list, vp32, z, i, c7375pW1, j5, j4, j, jElapsedRealtime, z2);
    }

    public final Df3 e(boolean z, int i) {
        return new Df3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final Df3 f(Sa3 sa3) {
        return new Df3(this.a, this.b, this.c, this.d, this.e, sa3, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final Df3 g(int i) {
        return new Df3(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final Df3 h(AbstractC8657u52 abstractC8657u52) {
        return new Df3(abstractC8657u52, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final boolean k() {
        return this.e == 3 && this.l && this.m == 0;
    }
}
