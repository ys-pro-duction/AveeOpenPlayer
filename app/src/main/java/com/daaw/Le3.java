package com.daaw;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class Le3 {
    public final H32 a = new H32();
    public final Q42 b = new Q42();
    public final InterfaceC9661xg3 c;
    public final InterfaceC1834Os2 d;
    public long e;
    public int f;
    public boolean g;
    public Ce3 h;
    public Ce3 i;
    public Ce3 j;
    public int k;
    public Object l;
    public long m;

    public Le3(InterfaceC9661xg3 interfaceC9661xg3, InterfaceC1834Os2 interfaceC1834Os2) {
        this.c = interfaceC9661xg3;
        this.d = interfaceC1834Os2;
    }

    public static Vp3 A(AbstractC8657u52 abstractC8657u52, Object obj, long j, long j2, Q42 q42, H32 h32) {
        abstractC8657u52.n(obj, h32);
        abstractC8657u52.e(h32.c, q42, 0L);
        abstractC8657u52.a(obj);
        h32.b();
        abstractC8657u52.n(obj, h32);
        int iD = h32.d(j);
        return iD == -1 ? new Vp3(obj, j2, h32.c(j)) : new Vp3(obj, iD, h32.e(iD), j2);
    }

    public static final boolean c(Vp3 vp3) {
        return !vp3.b() && vp3.e == -1;
    }

    public final void B() {
        final LP2 lp2 = new LP2();
        for (Ce3 ce3G = this.h; ce3G != null; ce3G = ce3G.g()) {
            lp2.g(ce3G.f.a);
        }
        Ce3 ce3 = this.i;
        final Vp3 vp3 = ce3 == null ? null : ce3.f.a;
        this.d.f(new Runnable() { // from class: com.daaw.Ie3
            @Override // java.lang.Runnable
            public final void run() {
                this.B.m(lp2, vp3);
            }
        });
    }

    public final boolean C(AbstractC8657u52 abstractC8657u52, Vp3 vp3, boolean z) {
        int iA = abstractC8657u52.a(vp3.a);
        return !abstractC8657u52.e(abstractC8657u52.d(iA, this.a, false).c, this.b, 0L).h && abstractC8657u52.i(iA, this.a, this.b, this.f, this.g) == -1 && z;
    }

    public final boolean a(AbstractC8657u52 abstractC8657u52, Vp3 vp3) {
        if (c(vp3)) {
            return abstractC8657u52.e(abstractC8657u52.n(vp3.a, this.a).c, this.b, 0L).o == abstractC8657u52.a(vp3.a);
        }
        return false;
    }

    public final boolean b(AbstractC8657u52 abstractC8657u52) {
        AbstractC8657u52 abstractC8657u522;
        Ce3 ce3G = this.h;
        if (ce3G == null) {
            return true;
        }
        int iA = abstractC8657u52.a(ce3G.b);
        while (true) {
            abstractC8657u522 = abstractC8657u52;
            iA = abstractC8657u522.i(iA, this.a, this.b, this.f, this.g);
            while (true) {
                ce3G.getClass();
                if (ce3G.g() == null || ce3G.f.g) {
                    break;
                }
                ce3G = ce3G.g();
            }
            Ce3 ce3G2 = ce3G.g();
            if (iA == -1 || ce3G2 == null || abstractC8657u522.a(ce3G2.b) != iA) {
                break;
            }
            ce3G = ce3G2;
            abstractC8657u52 = abstractC8657u522;
        }
        boolean zP = p(ce3G);
        ce3G.f = j(abstractC8657u522, ce3G.f);
        return !zP;
    }

    public final Ce3 d() {
        Ce3 ce3 = this.h;
        if (ce3 == null) {
            return null;
        }
        if (ce3 == this.i) {
            this.i = ce3.g();
        }
        ce3.n();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            Ce3 ce32 = this.h;
            this.l = ce32.b;
            this.m = ce32.f.a.d;
        }
        this.h = this.h.g();
        B();
        return this.h;
    }

    public final Ce3 e() {
        Ce3 ce3 = this.i;
        AbstractC6048km2.b(ce3);
        this.i = ce3.g();
        B();
        Ce3 ce32 = this.i;
        AbstractC6048km2.b(ce32);
        return ce32;
    }

    public final Ce3 f() {
        return this.j;
    }

    public final Ce3 g() {
        return this.h;
    }

    public final Ce3 h() {
        return this.i;
    }

    public final Fe3 i(long j, Df3 df3) {
        Ce3 ce3 = this.j;
        return ce3 == null ? x(df3.a, df3.b, df3.c, df3.r) : w(df3.a, ce3, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.Fe3 j(com.daaw.AbstractC8657u52 r16, com.daaw.Fe3 r17) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            com.daaw.Vp3 r3 = r2.a
            boolean r12 = c(r3)
            boolean r13 = r15.a(r1, r3)
            boolean r14 = r15.C(r1, r3, r12)
            com.daaw.Vp3 r4 = r2.a
            java.lang.Object r4 = r4.a
            com.daaw.H32 r5 = r15.a
            r1.n(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2d
            int r1 = r3.e
            if (r1 != r4) goto L2f
        L2d:
            r9 = r7
            goto L35
        L2f:
            com.daaw.H32 r9 = r15.a
            r9.i(r1)
            r9 = r5
        L35:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            com.daaw.H32 r1 = r15.a
            int r5 = r3.b
            int r6 = r3.c
            long r5 = r1.h(r5, r6)
        L45:
            r7 = r9
            r9 = r5
            goto L54
        L48:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L4f
            r7 = r5
            r9 = r7
            goto L54
        L4f:
            com.daaw.H32 r1 = r15.a
            long r5 = r1.d
            goto L45
        L54:
            boolean r1 = r3.b()
            if (r1 == 0) goto L62
            com.daaw.H32 r1 = r15.a
            int r4 = r3.b
            r1.n(r4)
            goto L6b
        L62:
            int r1 = r3.e
            if (r1 == r4) goto L6b
            com.daaw.H32 r4 = r15.a
            r4.n(r1)
        L6b:
            com.daaw.Fe3 r1 = new com.daaw.Fe3
            r5 = r3
            long r3 = r2.b
            r16 = r1
            long r0 = r2.c
            r11 = 0
            r2 = r5
            r5 = r0
            r1 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Le3.j(com.daaw.u52, com.daaw.Fe3):com.daaw.Fe3");
    }

    public final Vp3 k(AbstractC8657u52 abstractC8657u52, Object obj, long j) {
        long j2;
        int iA;
        int i = abstractC8657u52.n(obj, this.a).c;
        Object obj2 = this.l;
        if (obj2 == null || (iA = abstractC8657u52.a(obj2)) == -1 || abstractC8657u52.d(iA, this.a, false).c != i) {
            Ce3 ce3G = this.h;
            while (true) {
                if (ce3G == null) {
                    Ce3 ce3G2 = this.h;
                    while (true) {
                        if (ce3G2 != null) {
                            int iA2 = abstractC8657u52.a(ce3G2.b);
                            if (iA2 != -1 && abstractC8657u52.d(iA2, this.a, false).c == i) {
                                j2 = ce3G2.f.a.d;
                                break;
                            }
                            ce3G2 = ce3G2.g();
                        } else {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h == null) {
                                this.l = obj;
                                this.m = j2;
                            }
                        }
                    }
                } else {
                    if (ce3G.b.equals(obj)) {
                        j2 = ce3G.f.a.d;
                        break;
                    }
                    ce3G = ce3G.g();
                }
            }
        } else {
            j2 = this.m;
        }
        abstractC8657u52.n(obj, this.a);
        abstractC8657u52.e(this.a.c, this.b, 0L);
        int iA3 = abstractC8657u52.a(obj);
        Object obj3 = obj;
        while (true) {
            Q42 q42 = this.b;
            if (iA3 < q42.n) {
                return A(abstractC8657u52, obj3, j, j2, q42, this.a);
            }
            abstractC8657u52.d(iA3, this.a, true);
            this.a.b();
            H32 h32 = this.a;
            if (h32.d(h32.d) != -1) {
                obj3 = this.a.b;
                obj3.getClass();
            }
            iA3--;
        }
    }

    public final void l() {
        if (this.k == 0) {
            return;
        }
        Ce3 ce3G = this.h;
        AbstractC6048km2.b(ce3G);
        this.l = ce3G.b;
        this.m = ce3G.f.a.d;
        while (ce3G != null) {
            ce3G.n();
            ce3G = ce3G.g();
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        B();
    }

    public final /* synthetic */ void m(LP2 lp2, Vp3 vp3) {
        this.c.j(lp2.j(), vp3);
    }

    public final void n(long j) {
        Ce3 ce3 = this.j;
        if (ce3 != null) {
            ce3.m(j);
        }
    }

    public final boolean o(Tp3 tp3) {
        Ce3 ce3 = this.j;
        return ce3 != null && ce3.a == tp3;
    }

    public final boolean p(Ce3 ce3) {
        AbstractC6048km2.b(ce3);
        boolean z = false;
        if (ce3.equals(this.j)) {
            return false;
        }
        this.j = ce3;
        while (ce3.g() != null) {
            ce3 = ce3.g();
            ce3.getClass();
            if (ce3 == this.i) {
                this.i = this.h;
                z = true;
            }
            ce3.n();
            this.k--;
        }
        Ce3 ce32 = this.j;
        ce32.getClass();
        ce32.o(null);
        B();
        return z;
    }

    public final boolean q() {
        Ce3 ce3 = this.j;
        if (ce3 != null) {
            return !ce3.f.i && ce3.r() && this.j.f.e != -9223372036854775807L && this.k < 100;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(com.daaw.AbstractC8657u52 r17, long r18, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.daaw.Ce3 r2 = r0.h
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto L97
            com.daaw.Fe3 r5 = r2.f
            r6 = 0
            if (r3 != 0) goto L16
            com.daaw.Fe3 r3 = r0.j(r1, r5)
            r7 = r18
            goto L39
        L16:
            r7 = r18
            com.daaw.Fe3 r9 = r0.w(r1, r3, r7)
            if (r9 != 0) goto L26
            boolean r1 = r0.p(r3)
            if (r1 != 0) goto L25
            return r4
        L25:
            return r6
        L26:
            long r10 = r5.b
            long r12 = r9.b
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L8f
            com.daaw.Vp3 r10 = r5.a
            com.daaw.Vp3 r11 = r9.a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L8f
            r3 = r9
        L39:
            long r9 = r5.c
            com.daaw.Fe3 r9 = r3.a(r9)
            r2.f = r9
            long r9 = r5.e
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            long r13 = r3.e
            if (r5 == 0) goto L86
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L86
        L53:
            r2.q()
            long r7 = r3.e
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L67
        L62:
            long r9 = r2.e()
            long r7 = r7 + r9
        L67:
            com.daaw.Ce3 r1 = r0.i
            if (r2 != r1) goto L7b
            com.daaw.Fe3 r1 = r2.f
            boolean r1 = r1.f
            r9 = -9223372036854775808
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 == 0) goto L79
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L7b
        L79:
            r1 = 1
            goto L7c
        L7b:
            r1 = 0
        L7c:
            boolean r2 = r0.p(r2)
            if (r2 != 0) goto L85
            if (r1 != 0) goto L85
            return r4
        L85:
            return r6
        L86:
            com.daaw.Ce3 r3 = r2.g()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L8f:
            boolean r1 = r0.p(r3)
            if (r1 != 0) goto L96
            return r4
        L96:
            return r6
        L97:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Le3.r(com.daaw.u52, long, long):boolean");
    }

    public final boolean s(AbstractC8657u52 abstractC8657u52, int i) {
        this.f = i;
        return b(abstractC8657u52);
    }

    public final boolean t(AbstractC8657u52 abstractC8657u52, boolean z) {
        this.g = z;
        return b(abstractC8657u52);
    }

    public final Ce3 u(Yf3[] yf3Arr, Cs3 cs3, Ls3 ls3, Bf3 bf3, Fe3 fe3, Ds3 ds3) {
        Fe3 fe32;
        long jE;
        Ce3 ce3 = this.j;
        if (ce3 == null) {
            fe32 = fe3;
            jE = 1000000000000L;
        } else {
            fe32 = fe3;
            jE = (ce3.e() + ce3.f.e) - fe32.b;
        }
        Ce3 ce32 = new Ce3(yf3Arr, jE, cs3, ls3, bf3, fe32, ds3);
        Ce3 ce33 = this.j;
        if (ce33 != null) {
            ce33.o(ce32);
        } else {
            this.h = ce32;
            this.i = ce32;
        }
        this.l = null;
        this.j = ce32;
        this.k++;
        B();
        return ce32;
    }

    public final long v(AbstractC8657u52 abstractC8657u52, Object obj, int i) {
        abstractC8657u52.n(obj, this.a);
        this.a.i(i);
        this.a.k(i);
        return 0L;
    }

    public final Fe3 w(AbstractC8657u52 abstractC8657u52, Ce3 ce3, long j) {
        AbstractC8657u52 abstractC8657u522;
        Object obj;
        long j2;
        Fe3 fe3 = ce3.f;
        long jE = (ce3.e() + fe3.e) - j;
        if (!fe3.g) {
            Vp3 vp3 = fe3.a;
            abstractC8657u52.n(vp3.a, this.a);
            if (!vp3.b()) {
                int i = vp3.e;
                if (i != -1) {
                    this.a.m(i);
                }
                H32 h32 = this.a;
                int i2 = vp3.e;
                int iE = h32.e(i2);
                h32.n(i2);
                if (iE != this.a.a(vp3.e)) {
                    return y(abstractC8657u52, vp3.a, vp3.e, iE, fe3.e, vp3.d);
                }
                v(abstractC8657u52, vp3.a, vp3.e);
                return z(abstractC8657u52, vp3.a, 0L, fe3.e, vp3.d);
            }
            int i3 = vp3.b;
            if (this.a.a(i3) == -1) {
                return null;
            }
            int iF = this.a.f(i3, vp3.c);
            if (iF < 0) {
                return y(abstractC8657u52, vp3.a, i3, iF, fe3.c, vp3.d);
            }
            long jLongValue = fe3.c;
            if (jLongValue == -9223372036854775807L) {
                Q42 q42 = this.b;
                H32 h322 = this.a;
                Pair pairM = abstractC8657u52.m(q42, h322, h322.c, -9223372036854775807L, Math.max(0L, jE));
                abstractC8657u522 = abstractC8657u52;
                if (pairM == null) {
                    return null;
                }
                jLongValue = ((Long) pairM.second).longValue();
            } else {
                abstractC8657u522 = abstractC8657u52;
            }
            v(abstractC8657u522, vp3.a, vp3.b);
            return z(abstractC8657u52, vp3.a, Math.max(0L, jLongValue), fe3.c, vp3.d);
        }
        long j3 = 0;
        int i4 = abstractC8657u52.i(abstractC8657u52.a(fe3.a.a), this.a, this.b, this.f, this.g);
        if (i4 == -1) {
            return null;
        }
        int i5 = abstractC8657u52.d(i4, this.a, true).c;
        Object obj2 = this.a.b;
        obj2.getClass();
        long j4 = fe3.a.d;
        if (abstractC8657u52.e(i5, this.b, 0L).n == i4) {
            Pair pairM2 = abstractC8657u52.m(this.b, this.a, i5, -9223372036854775807L, Math.max(0L, jE));
            if (pairM2 == null) {
                return null;
            }
            Object obj3 = pairM2.first;
            long jLongValue2 = ((Long) pairM2.second).longValue();
            Ce3 ce3G = ce3.g();
            if (ce3G == null || !ce3G.b.equals(obj3)) {
                j4 = this.e;
                this.e = 1 + j4;
            } else {
                j4 = ce3G.f.a.d;
            }
            obj = obj3;
            j2 = jLongValue2;
            j3 = -9223372036854775807L;
        } else {
            obj = obj2;
            j2 = 0;
        }
        Vp3 vp3A = A(abstractC8657u52, obj, j2, j4, this.b, this.a);
        if (j3 != -9223372036854775807L && fe3.c != -9223372036854775807L) {
            abstractC8657u52.n(fe3.a.a, this.a).b();
            this.a.g();
        }
        return x(abstractC8657u52, vp3A, j3, j2);
    }

    public final Fe3 x(AbstractC8657u52 abstractC8657u52, Vp3 vp3, long j, long j2) {
        abstractC8657u52.n(vp3.a, this.a);
        return vp3.b() ? y(abstractC8657u52, vp3.a, vp3.b, vp3.c, j, vp3.d) : z(abstractC8657u52, vp3.a, j2, j, vp3.d);
    }

    public final Fe3 y(AbstractC8657u52 abstractC8657u52, Object obj, int i, int i2, long j, long j2) {
        Vp3 vp3 = new Vp3(obj, i, i2, j2);
        Object obj2 = vp3.a;
        long jH = abstractC8657u52.n(obj2, this.a).h(vp3.b, vp3.c);
        if (i2 == this.a.e(i)) {
            this.a.j();
        }
        this.a.n(vp3.b);
        long jMax = 0;
        if (jH != -9223372036854775807L && jH <= 0) {
            jMax = Math.max(0L, (-1) + jH);
        }
        return new Fe3(vp3, jMax, j, -9223372036854775807L, jH, false, false, false, false);
    }

    public final Fe3 z(AbstractC8657u52 abstractC8657u52, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long jMax = j;
        abstractC8657u52.n(obj, this.a);
        int iC = this.a.c(jMax);
        if (iC != -1) {
            this.a.m(iC);
        }
        if (iC == -1) {
            this.a.b();
        } else {
            this.a.n(iC);
        }
        Vp3 vp3 = new Vp3(obj, j3, iC);
        boolean zC = c(vp3);
        boolean zA = a(abstractC8657u52, vp3);
        boolean zC2 = C(abstractC8657u52, vp3, zC);
        if (iC != -1) {
            this.a.n(iC);
        }
        if (iC != -1) {
            this.a.i(iC);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j5 = 0;
            j6 = 0;
        } else {
            j5 = j4;
            j6 = this.a.d;
        }
        if (j6 != -9223372036854775807L && jMax >= j6) {
            jMax = Math.max(0L, j6 - 1);
        }
        return new Fe3(vp3, jMax, j2, j5, j6, false, zC, zA, zC2);
    }
}
