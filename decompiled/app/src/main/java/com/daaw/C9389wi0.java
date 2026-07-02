package com.daaw;

import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: renamed from: com.daaw.wi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9389wi0 {
    public final InterfaceC9110vi0 a;
    public final Object b;
    public final QM0[] c;
    public final boolean[] d;
    public long e;
    public boolean f;
    public boolean g;
    public C9668xi0 h;
    public C9389wi0 i;
    public TrackGroupArray j;
    public C4173e51 k;
    public final WH0[] l;
    public final AbstractC3895d51 m;
    public final InterfaceC1792Oi0 n;
    public C4173e51 o;

    public C9389wi0(WH0[] wh0Arr, long j, AbstractC3895d51 abstractC3895d51, O3 o3, InterfaceC1792Oi0 interfaceC1792Oi0, Object obj, C9668xi0 c9668xi0) {
        this.l = wh0Arr;
        this.e = j - c9668xi0.b;
        this.m = abstractC3895d51;
        this.n = interfaceC1792Oi0;
        this.b = AbstractC7115ob.e(obj);
        this.h = c9668xi0;
        this.c = new QM0[wh0Arr.length];
        this.d = new boolean[wh0Arr.length];
        InterfaceC9110vi0 interfaceC9110vi0G = interfaceC1792Oi0.g(c9668xi0.a, o3);
        long j2 = c9668xi0.c;
        this.a = j2 != Long.MIN_VALUE ? new C4928gm(interfaceC9110vi0G, true, 0L, j2) : interfaceC9110vi0G;
    }

    public long a(long j, boolean z) {
        return b(j, z, new boolean[this.l.length]);
    }

    public long b(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            C4173e51 c4173e51 = this.k;
            boolean z2 = true;
            if (i >= c4173e51.a) {
                break;
            }
            boolean[] zArr2 = this.d;
            if (z || !c4173e51.b(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        f(this.c);
        r(this.k);
        C3338b51 c3338b51 = this.k.c;
        long jI = this.a.i(c3338b51.b(), this.d, this.c, zArr, j);
        c(this.c);
        this.g = false;
        int i2 = 0;
        while (true) {
            QM0[] qm0Arr = this.c;
            if (i2 >= qm0Arr.length) {
                return jI;
            }
            if (qm0Arr[i2] != null) {
                AbstractC7115ob.f(this.k.c(i2));
                if (this.l[i2].h() != 5) {
                    this.g = true;
                }
            } else {
                AbstractC7115ob.f(c3338b51.a(i2) == null);
            }
            i2++;
        }
    }

    public final void c(QM0[] qm0Arr) {
        int i = 0;
        while (true) {
            WH0[] wh0Arr = this.l;
            if (i >= wh0Arr.length) {
                return;
            }
            if (wh0Arr[i].h() == 5 && this.k.c(i)) {
                qm0Arr[i] = new C8145sG();
            }
            i++;
        }
    }

    public void d(long j) {
        this.a.d(p(j));
    }

    public final void e(C4173e51 c4173e51) {
        for (int i = 0; i < c4173e51.a; i++) {
            boolean zC = c4173e51.c(i);
            com.google.android.exoplayer2.trackselection.c cVarA = c4173e51.c.a(i);
            if (zC && cVarA != null) {
                cVarA.e();
            }
        }
    }

    public final void f(QM0[] qm0Arr) {
        int i = 0;
        while (true) {
            WH0[] wh0Arr = this.l;
            if (i >= wh0Arr.length) {
                return;
            }
            if (wh0Arr[i].h() == 5) {
                qm0Arr[i] = null;
            }
            i++;
        }
    }

    public final void g(C4173e51 c4173e51) {
        for (int i = 0; i < c4173e51.a; i++) {
            boolean zC = c4173e51.c(i);
            com.google.android.exoplayer2.trackselection.c cVarA = c4173e51.c.a(i);
            if (zC && cVarA != null) {
                cVarA.f();
            }
        }
    }

    public long h(boolean z) {
        if (!this.f) {
            return this.h.b;
        }
        long jF = this.a.f();
        return (jF == Long.MIN_VALUE && z) ? this.h.e : jF;
    }

    public long i() {
        if (this.f) {
            return this.a.c();
        }
        return 0L;
    }

    public long j() {
        return this.e;
    }

    public void k(float f) {
        this.f = true;
        this.j = this.a.r();
        o(f);
        long jA = a(this.h.b, false);
        long j = this.e;
        C9668xi0 c9668xi0 = this.h;
        this.e = j + (c9668xi0.b - jA);
        this.h = c9668xi0.b(jA);
    }

    public boolean l() {
        if (this.f) {
            return !this.g || this.a.f() == Long.MIN_VALUE;
        }
        return false;
    }

    public void m(long j) {
        if (this.f) {
            this.a.g(p(j));
        }
    }

    public void n() {
        r(null);
        try {
            if (this.h.c != Long.MIN_VALUE) {
                this.n.a(((C4928gm) this.a).B);
            } else {
                this.n.a(this.a);
            }
        } catch (RuntimeException unused) {
        }
    }

    public boolean o(float f) {
        C4173e51 c4173e51C = this.m.c(this.l, this.j);
        if (c4173e51C.a(this.o)) {
            return false;
        }
        this.k = c4173e51C;
        for (com.google.android.exoplayer2.trackselection.c cVar : c4173e51C.c.b()) {
            if (cVar != null) {
                cVar.m(f);
            }
        }
        return true;
    }

    public long p(long j) {
        return j - j();
    }

    public long q(long j) {
        return j + j();
    }

    public final void r(C4173e51 c4173e51) {
        C4173e51 c4173e512 = this.o;
        if (c4173e512 != null) {
            e(c4173e512);
        }
        this.o = c4173e51;
        if (c4173e51 != null) {
            g(c4173e51);
        }
    }
}
