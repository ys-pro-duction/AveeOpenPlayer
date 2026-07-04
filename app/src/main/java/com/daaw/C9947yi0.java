package com.daaw;

import android.util.Pair;
import com.daaw.InterfaceC1792Oi0;
import com.daaw.L31;

/* JADX INFO: renamed from: com.daaw.yi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9947yi0 {
    public final L31.b a = new L31.b();
    public final L31.c b = new L31.c();
    public long c;
    public L31 d;
    public int e;
    public boolean f;
    public C9389wi0 g;
    public C9389wi0 h;
    public C9389wi0 i;
    public int j;
    public Object k;
    public long l;

    public void A(L31 l31) {
        this.d = l31;
    }

    public boolean B() {
        C9389wi0 c9389wi0 = this.i;
        if (c9389wi0 != null) {
            return !c9389wi0.h.g && c9389wi0.l() && this.i.h.e != -9223372036854775807L && this.j < 100;
        }
        return true;
    }

    public final boolean C() {
        C9389wi0 c9389wi0;
        C9389wi0 c9389wi0H = h();
        if (c9389wi0H == null) {
            return true;
        }
        while (true) {
            int iD = this.d.d(c9389wi0H.h.a.a, this.a, this.b, this.e, this.f);
            while (true) {
                c9389wi0 = c9389wi0H.i;
                if (c9389wi0 == null || c9389wi0H.h.f) {
                    break;
                }
                c9389wi0H = c9389wi0;
            }
            if (iD == -1 || c9389wi0 == null || c9389wi0.h.a.a != iD) {
                break;
            }
            c9389wi0H = c9389wi0;
        }
        boolean zW = w(c9389wi0H);
        C9668xi0 c9668xi0 = c9389wi0H.h;
        c9389wi0H.h = q(c9668xi0, c9668xi0.a);
        return (zW && r()) ? false : true;
    }

    public boolean D(InterfaceC1792Oi0.a aVar, long j) {
        int i = aVar.a;
        C9389wi0 c9389wi0 = null;
        int iD = i;
        for (C9389wi0 c9389wi0H = h(); c9389wi0H != null; c9389wi0H = c9389wi0H.i) {
            if (c9389wi0 == null) {
                c9389wi0H.h = p(c9389wi0H.h, iD);
            } else {
                if (iD == -1 || !c9389wi0H.b.equals(this.d.g(iD, this.a, true).b)) {
                    return true ^ w(c9389wi0);
                }
                C9668xi0 c9668xi0G = g(c9389wi0, j);
                if (c9668xi0G == null) {
                    return true ^ w(c9389wi0);
                }
                c9389wi0H.h = p(c9389wi0H.h, iD);
                if (!c(c9389wi0H, c9668xi0G)) {
                    return true ^ w(c9389wi0);
                }
            }
            if (c9389wi0H.h.f) {
                iD = this.d.d(iD, this.a, this.b, this.e, this.f);
            }
            c9389wi0 = c9389wi0H;
        }
        return true;
    }

    public boolean E(int i) {
        this.e = i;
        return C();
    }

    public boolean F(boolean z) {
        this.f = z;
        return C();
    }

    public C9389wi0 a() {
        C9389wi0 c9389wi0 = this.g;
        if (c9389wi0 != null) {
            if (c9389wi0 == this.h) {
                this.h = c9389wi0.i;
            }
            c9389wi0.n();
            this.g = this.g.i;
            int i = this.j - 1;
            this.j = i;
            if (i == 0) {
                this.i = null;
            }
        } else {
            C9389wi0 c9389wi02 = this.i;
            this.g = c9389wi02;
            this.h = c9389wi02;
        }
        return this.g;
    }

    public C9389wi0 b() {
        C9389wi0 c9389wi0 = this.h;
        AbstractC7115ob.f((c9389wi0 == null || c9389wi0.i == null) ? false : true);
        C9389wi0 c9389wi02 = this.h.i;
        this.h = c9389wi02;
        return c9389wi02;
    }

    public final boolean c(C9389wi0 c9389wi0, C9668xi0 c9668xi0) {
        C9668xi0 c9668xi02 = c9389wi0.h;
        return c9668xi02.b == c9668xi0.b && c9668xi02.c == c9668xi0.c && c9668xi02.a.equals(c9668xi0.a);
    }

    public void d(boolean z) {
        C9389wi0 c9389wi0H = h();
        if (c9389wi0H != null) {
            this.k = z ? c9389wi0H.b : null;
            this.l = c9389wi0H.h.a.d;
            c9389wi0H.n();
            w(c9389wi0H);
        } else if (!z) {
            this.k = null;
        }
        this.g = null;
        this.i = null;
        this.h = null;
        this.j = 0;
    }

    public InterfaceC9110vi0 e(WH0[] wh0Arr, AbstractC3895d51 abstractC3895d51, O3 o3, InterfaceC1792Oi0 interfaceC1792Oi0, Object obj, C9668xi0 c9668xi0) {
        C9668xi0 c9668xi02;
        long j;
        C9389wi0 c9389wi0 = this.i;
        if (c9389wi0 == null) {
            c9668xi02 = c9668xi0;
            j = c9668xi02.b;
        } else {
            c9668xi02 = c9668xi0;
            j = c9389wi0.j() + this.i.h.e;
        }
        C9389wi0 c9389wi02 = new C9389wi0(wh0Arr, j, abstractC3895d51, o3, interfaceC1792Oi0, obj, c9668xi02);
        if (this.i != null) {
            AbstractC7115ob.f(r());
            this.i.i = c9389wi02;
        }
        this.k = null;
        this.i = c9389wi02;
        this.j++;
        return c9389wi02.a;
    }

    public final C9668xi0 f(C9178vw0 c9178vw0) {
        return j(c9178vw0.c, c9178vw0.e, c9178vw0.d);
    }

    public final C9668xi0 g(C9389wi0 c9389wi0, long j) {
        long j2;
        C9668xi0 c9668xi0 = c9389wi0.h;
        if (c9668xi0.f) {
            int iD = this.d.d(c9668xi0.a.a, this.a, this.b, this.e, this.f);
            if (iD == -1) {
                return null;
            }
            int i = this.d.g(iD, this.a, true).c;
            Object obj = this.a.b;
            long j3 = c9668xi0.a.d;
            long jLongValue = 0;
            if (this.d.k(i, this.b).f == iD) {
                Pair pairJ = this.d.j(this.b, this.a, i, -9223372036854775807L, Math.max(0L, (c9389wi0.j() + c9668xi0.e) - j));
                if (pairJ == null) {
                    return null;
                }
                iD = ((Integer) pairJ.first).intValue();
                jLongValue = ((Long) pairJ.second).longValue();
                C9389wi0 c9389wi02 = c9389wi0.i;
                if (c9389wi02 == null || !c9389wi02.b.equals(obj)) {
                    j2 = this.c;
                    this.c = 1 + j2;
                } else {
                    j2 = c9389wi0.i.h.a.d;
                }
                j3 = j2;
            }
            long j4 = jLongValue;
            return j(y(iD, j4, j3), j4, j4);
        }
        InterfaceC1792Oi0.a aVar = c9668xi0.a;
        this.d.f(aVar.a, this.a);
        if (aVar.b()) {
            int i2 = aVar.b;
            int iA = this.a.a(i2);
            if (iA == -1) {
                return null;
            }
            int iK = this.a.k(i2, aVar.c);
            if (iK >= iA) {
                return l(aVar.a, c9668xi0.d, aVar.d);
            }
            if (this.a.n(i2, iK)) {
                return k(aVar.a, i2, iK, c9668xi0.d, aVar.d);
            }
            return null;
        }
        long j5 = c9668xi0.c;
        if (j5 != Long.MIN_VALUE) {
            int iE = this.a.e(j5);
            if (iE == -1) {
                return l(aVar.a, c9668xi0.c, aVar.d);
            }
            int iJ = this.a.j(iE);
            if (this.a.n(iE, iJ)) {
                return k(aVar.a, iE, iJ, c9668xi0.c, aVar.d);
            }
            return null;
        }
        int iC = this.a.c();
        if (iC == 0) {
            return null;
        }
        int i3 = iC - 1;
        if (this.a.f(i3) != Long.MIN_VALUE || this.a.m(i3)) {
            return null;
        }
        int iJ2 = this.a.j(i3);
        if (!this.a.n(i3, iJ2)) {
            return null;
        }
        return k(aVar.a, i3, iJ2, this.a.i(), aVar.d);
    }

    public C9389wi0 h() {
        return r() ? this.g : this.i;
    }

    public C9389wi0 i() {
        return this.i;
    }

    public final C9668xi0 j(InterfaceC1792Oi0.a aVar, long j, long j2) {
        this.d.f(aVar.a, this.a);
        if (!aVar.b()) {
            return l(aVar.a, j2, aVar.d);
        }
        if (this.a.n(aVar.b, aVar.c)) {
            return k(aVar.a, aVar.b, aVar.c, j, aVar.d);
        }
        return null;
    }

    public final C9668xi0 k(int i, int i2, int i3, long j, long j2) {
        InterfaceC1792Oi0.a aVar = new InterfaceC1792Oi0.a(i, i2, i3, j2);
        boolean zS = s(aVar, Long.MIN_VALUE);
        boolean zT = t(aVar, zS);
        return new C9668xi0(aVar, i3 == this.a.j(i2) ? this.a.g() : 0L, Long.MIN_VALUE, j, this.d.f(aVar.a, this.a).b(aVar.b, aVar.c), zS, zT);
    }

    public final C9668xi0 l(int i, long j, long j2) {
        InterfaceC1792Oi0.a aVar = new InterfaceC1792Oi0.a(i, j2);
        this.d.f(aVar.a, this.a);
        int iD = this.a.d(j);
        long jF = iD == -1 ? Long.MIN_VALUE : this.a.f(iD);
        boolean zS = s(aVar, jF);
        return new C9668xi0(aVar, j, jF, -9223372036854775807L, jF == Long.MIN_VALUE ? this.a.i() : jF, zS, t(aVar, zS));
    }

    public C9668xi0 m(long j, C9178vw0 c9178vw0) {
        C9389wi0 c9389wi0 = this.i;
        return c9389wi0 == null ? f(c9178vw0) : g(c9389wi0, j);
    }

    public C9389wi0 n() {
        return this.g;
    }

    public C9389wi0 o() {
        return this.h;
    }

    public C9668xi0 p(C9668xi0 c9668xi0, int i) {
        return q(c9668xi0, c9668xi0.a.a(i));
    }

    public final C9668xi0 q(C9668xi0 c9668xi0, InterfaceC1792Oi0.a aVar) {
        long j;
        long jI;
        long j2 = c9668xi0.b;
        long j3 = c9668xi0.c;
        boolean zS = s(aVar, j3);
        boolean zT = t(aVar, zS);
        this.d.f(aVar.a, this.a);
        if (aVar.b()) {
            jI = this.a.b(aVar.b, aVar.c);
        } else {
            if (j3 != Long.MIN_VALUE) {
                j = j3;
                return new C9668xi0(aVar, j2, j3, c9668xi0.d, j, zS, zT);
            }
            jI = this.a.i();
        }
        j = jI;
        return new C9668xi0(aVar, j2, j3, c9668xi0.d, j, zS, zT);
    }

    public boolean r() {
        return this.g != null;
    }

    public final boolean s(InterfaceC1792Oi0.a aVar, long j) {
        int iC = this.d.f(aVar.a, this.a).c();
        if (iC == 0) {
            return true;
        }
        int i = iC - 1;
        boolean zB = aVar.b();
        if (this.a.f(i) != Long.MIN_VALUE) {
            return !zB && j == Long.MIN_VALUE;
        }
        int iA = this.a.a(i);
        if (iA == -1) {
            return false;
        }
        return (zB && aVar.b == i && aVar.c == iA + (-1)) || (!zB && this.a.j(i) == iA);
    }

    public final boolean t(InterfaceC1792Oi0.a aVar, boolean z) {
        return !this.d.k(this.d.f(aVar.a, this.a).c, this.b).e && this.d.p(aVar.a, this.a, this.b, this.e, this.f) && z;
    }

    public boolean u(InterfaceC9110vi0 interfaceC9110vi0) {
        C9389wi0 c9389wi0 = this.i;
        return c9389wi0 != null && c9389wi0.a == interfaceC9110vi0;
    }

    public void v(long j) {
        C9389wi0 c9389wi0 = this.i;
        if (c9389wi0 != null) {
            c9389wi0.m(j);
        }
    }

    public boolean w(C9389wi0 c9389wi0) {
        boolean z = false;
        AbstractC7115ob.f(c9389wi0 != null);
        this.i = c9389wi0;
        while (true) {
            c9389wi0 = c9389wi0.i;
            if (c9389wi0 == null) {
                this.i.i = null;
                return z;
            }
            if (c9389wi0 == this.h) {
                this.h = this.g;
                z = true;
            }
            c9389wi0.n();
            this.j--;
        }
    }

    public InterfaceC1792Oi0.a x(int i, long j) {
        return y(i, j, z(i));
    }

    public final InterfaceC1792Oi0.a y(int i, long j, long j2) {
        this.d.f(i, this.a);
        int iE = this.a.e(j);
        return iE == -1 ? new InterfaceC1792Oi0.a(i, j2) : new InterfaceC1792Oi0.a(i, iE, this.a.j(iE), j2);
    }

    public final long z(int i) {
        int iB;
        Object obj = this.d.g(i, this.a, true).b;
        int i2 = this.a.c;
        Object obj2 = this.k;
        if (obj2 != null && (iB = this.d.b(obj2)) != -1 && this.d.f(iB, this.a).c == i2) {
            return this.l;
        }
        for (C9389wi0 c9389wi0H = h(); c9389wi0H != null; c9389wi0H = c9389wi0H.i) {
            if (c9389wi0H.b.equals(obj)) {
                return c9389wi0H.h.a.d;
            }
        }
        for (C9389wi0 c9389wi0H2 = h(); c9389wi0H2 != null; c9389wi0H2 = c9389wi0H2.i) {
            int iB2 = this.d.b(c9389wi0H2.b);
            if (iB2 != -1 && this.d.f(iB2, this.a).c == i2) {
                return c9389wi0H2.h.a.d;
            }
        }
        long j = this.c;
        this.c = 1 + j;
        return j;
    }
}
