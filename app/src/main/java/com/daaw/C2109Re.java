package com.daaw;

import com.daaw.C4106dr;
import com.daaw.C5510ir;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2109Re {
    public final ArrayList a = new ArrayList();
    public a b = new a();
    public C5791jr c;

    /* JADX INFO: renamed from: com.daaw.Re$a */
    public static class a {
        public C5510ir.b a;
        public C5510ir.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
    }

    /* JADX INFO: renamed from: com.daaw.Re$b */
    public interface b {
        void a();

        void b(C5510ir c5510ir, a aVar);
    }

    public C2109Re(C5791jr c5791jr) {
        this.c = c5791jr;
    }

    public final boolean a(b bVar, C5510ir c5510ir, boolean z) {
        this.b.a = c5510ir.y();
        this.b.b = c5510ir.M();
        this.b.c = c5510ir.P();
        this.b.d = c5510ir.v();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = z;
        C5510ir.b bVar2 = aVar.a;
        C5510ir.b bVar3 = C5510ir.b.MATCH_CONSTRAINT;
        boolean z2 = bVar2 == bVar3;
        boolean z3 = aVar.b == bVar3;
        boolean z4 = z2 && c5510ir.Q > 0.0f;
        boolean z5 = z3 && c5510ir.Q > 0.0f;
        if (z4 && c5510ir.n[0] == 4) {
            aVar.a = C5510ir.b.FIXED;
        }
        if (z5 && c5510ir.n[1] == 4) {
            aVar.b = C5510ir.b.FIXED;
        }
        bVar.b(c5510ir, aVar);
        c5510ir.E0(this.b.e);
        c5510ir.h0(this.b.f);
        c5510ir.g0(this.b.h);
        c5510ir.b0(this.b.g);
        a aVar2 = this.b;
        aVar2.j = false;
        return aVar2.i;
    }

    public final void b(C5791jr c5791jr) {
        int size = c5791jr.w0.size();
        b bVarU0 = c5791jr.U0();
        for (int i = 0; i < size; i++) {
            C5510ir c5510ir = (C5510ir) c5791jr.w0.get(i);
            if (!(c5510ir instanceof C7644qU) && (!c5510ir.e.e.j || !c5510ir.f.e.j)) {
                C5510ir.b bVarS = c5510ir.s(0);
                C5510ir.b bVarS2 = c5510ir.s(1);
                C5510ir.b bVar = C5510ir.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || c5510ir.l == 1 || bVarS2 != bVar || c5510ir.m == 1) {
                    a(bVarU0, c5510ir, false);
                }
            }
        }
        bVarU0.a();
    }

    public final void c(C5791jr c5791jr, String str, int i, int i2) {
        int iE = c5791jr.E();
        int iD = c5791jr.D();
        c5791jr.u0(0);
        c5791jr.t0(0);
        c5791jr.E0(i);
        c5791jr.h0(i2);
        c5791jr.u0(iE);
        c5791jr.t0(iD);
        this.c.K0();
    }

    public long d(C5791jr c5791jr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zR0;
        int i10;
        long j;
        boolean z;
        boolean z2;
        int i11;
        b bVar;
        boolean z3;
        int i12;
        boolean z4;
        boolean z5;
        boolean zT0;
        int i13;
        b bVarU0 = c5791jr.U0();
        int size = c5791jr.w0.size();
        int iP = c5791jr.P();
        int iV = c5791jr.v();
        boolean zB = AbstractC2784Xq0.b(i, 128);
        boolean z6 = zB || AbstractC2784Xq0.b(i, 64);
        if (z6) {
            for (int i14 = 0; i14 < size; i14++) {
                C5510ir c5510ir = (C5510ir) c5791jr.w0.get(i14);
                C5510ir.b bVarY = c5510ir.y();
                C5510ir.b bVar2 = C5510ir.b.MATCH_CONSTRAINT;
                boolean z7 = (bVarY == bVar2) && (c5510ir.M() == bVar2) && c5510ir.t() > 0.0f;
                if ((c5510ir.V() && z7) || ((c5510ir.X() && z7) || (c5510ir instanceof AbstractC6858nf1) || c5510ir.V() || c5510ir.X())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6) {
            int i15 = C4311ec0.q;
        }
        if (z6 && ((i4 == 1073741824 && i6 == 1073741824) || zB)) {
            int iMin = Math.min(c5791jr.C(), i5);
            int iMin2 = Math.min(c5791jr.B(), i7);
            if (i4 == 1073741824 && c5791jr.P() != iMin) {
                c5791jr.E0(iMin);
                c5791jr.X0();
            }
            if (i6 == 1073741824 && c5791jr.v() != iMin2) {
                c5791jr.h0(iMin2);
                c5791jr.X0();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zR0 = c5791jr.R0(zB);
                i10 = 2;
            } else {
                boolean zS0 = c5791jr.S0(zB);
                if (i4 == 1073741824) {
                    zT0 = zS0 & c5791jr.T0(zB, 0);
                    i13 = 1;
                } else {
                    zT0 = zS0;
                    i13 = 0;
                }
                if (i6 == 1073741824) {
                    boolean zT02 = c5791jr.T0(zB, 1) & zT0;
                    i10 = i13 + 1;
                    zR0 = zT02;
                } else {
                    i10 = i13;
                    zR0 = zT0;
                }
            }
            if (zR0) {
                c5791jr.I0(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zR0 = false;
            i10 = 0;
        }
        long j2 = 0;
        if (zR0 && i10 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(c5791jr);
        }
        int iV0 = c5791jr.V0();
        int size2 = this.a.size();
        if (size > 0) {
            c(c5791jr, "First pass", iP, iV);
        }
        if (size2 > 0) {
            C5510ir.b bVarY2 = c5791jr.y();
            C5510ir.b bVar3 = C5510ir.b.WRAP_CONTENT;
            boolean z8 = bVarY2 == bVar3;
            boolean z9 = c5791jr.M() == bVar3;
            int iMax = Math.max(c5791jr.P(), this.c.E());
            int iMax2 = Math.max(c5791jr.v(), this.c.D());
            int i16 = 0;
            boolean zV0 = false;
            while (i16 < size2) {
                long j3 = j2;
                C5510ir c5510ir2 = (C5510ir) this.a.get(i16);
                if (c5510ir2 instanceof AbstractC6858nf1) {
                    int iP2 = c5510ir2.P();
                    int iV2 = c5510ir2.v();
                    boolean zA = zV0 | a(bVarU0, c5510ir2, true);
                    z4 = z9;
                    int iP3 = c5510ir2.P();
                    int iV3 = c5510ir2.v();
                    if (iP3 != iP2) {
                        c5510ir2.E0(iP3);
                        if (z8 && c5510ir2.I() > iMax) {
                            iMax = Math.max(iMax, c5510ir2.I() + c5510ir2.m(C4106dr.b.RIGHT).c());
                        }
                        z5 = true;
                    } else {
                        z5 = zA;
                    }
                    if (iV3 != iV2) {
                        c5510ir2.h0(iV3);
                        if (z4 && c5510ir2.p() > iMax2) {
                            iMax2 = Math.max(iMax2, c5510ir2.p() + c5510ir2.m(C4106dr.b.BOTTOM).c());
                        }
                        z5 = true;
                    }
                    zV0 = z5 | ((AbstractC6858nf1) c5510ir2).V0();
                } else {
                    z4 = z9;
                }
                i16++;
                j2 = j3;
                z9 = z4;
            }
            j = j2;
            boolean z10 = z9;
            int i17 = 0;
            while (i17 < 2) {
                int i18 = 0;
                while (i18 < size2) {
                    C5510ir c5510ir3 = (C5510ir) this.a.get(i18);
                    if (((c5510ir3 instanceof MV) && !(c5510ir3 instanceof AbstractC6858nf1)) || (c5510ir3 instanceof C7644qU) || c5510ir3.O() == 8 || ((c5510ir3.e.e.j && c5510ir3.f.e.j) || (c5510ir3 instanceof AbstractC6858nf1))) {
                        i11 = i17;
                        bVar = bVarU0;
                    } else {
                        int iP4 = c5510ir3.P();
                        int iV4 = c5510ir3.v();
                        int iN = c5510ir3.n();
                        i11 = i17;
                        boolean zA2 = zV0 | a(bVarU0, c5510ir3, true);
                        int iP5 = c5510ir3.P();
                        bVar = bVarU0;
                        int iV5 = c5510ir3.v();
                        if (iP5 != iP4) {
                            c5510ir3.E0(iP5);
                            if (z8 && c5510ir3.I() > iMax) {
                                iMax = Math.max(iMax, c5510ir3.I() + c5510ir3.m(C4106dr.b.RIGHT).c());
                            }
                            z3 = true;
                        } else {
                            z3 = zA2;
                        }
                        if (iV5 != iV4) {
                            c5510ir3.h0(iV5);
                            if (z10 && c5510ir3.p() > iMax2) {
                                iMax2 = Math.max(iMax2, c5510ir3.p() + c5510ir3.m(C4106dr.b.BOTTOM).c());
                            }
                            z3 = true;
                        }
                        if (!c5510ir3.S() || iN == c5510ir3.n()) {
                            zV0 = z3;
                        } else {
                            i12 = 1;
                            zV0 = true;
                            i18 += i12;
                            bVarU0 = bVar;
                            i17 = i11;
                        }
                    }
                    i12 = 1;
                    i18 += i12;
                    bVarU0 = bVar;
                    i17 = i11;
                }
                int i19 = i17;
                b bVar4 = bVarU0;
                if (zV0) {
                    c(c5791jr, "intermediate pass", iP, iV);
                    zV0 = false;
                }
                i17 = i19 + 1;
                bVarU0 = bVar4;
            }
            if (zV0) {
                c(c5791jr, "2nd pass", iP, iV);
                if (c5791jr.P() < iMax) {
                    c5791jr.E0(iMax);
                    z = true;
                } else {
                    z = false;
                }
                if (c5791jr.v() < iMax2) {
                    c5791jr.h0(iMax2);
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    c(c5791jr, "3rd pass", iP, iV);
                }
            }
        } else {
            j = 0;
        }
        c5791jr.g1(iV0);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(com.daaw.C5791jr r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.a
            r0.clear()
            java.util.ArrayList r0 = r7.w0
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L3a
            java.util.ArrayList r2 = r7.w0
            java.lang.Object r2 = r2.get(r1)
            com.daaw.ir r2 = (com.daaw.C5510ir) r2
            com.daaw.ir$b r3 = r2.y()
            com.daaw.ir$b r4 = com.daaw.C5510ir.b.MATCH_CONSTRAINT
            if (r3 == r4) goto L32
            com.daaw.ir$b r3 = r2.y()
            com.daaw.ir$b r5 = com.daaw.C5510ir.b.MATCH_PARENT
            if (r3 == r5) goto L32
            com.daaw.ir$b r3 = r2.M()
            if (r3 == r4) goto L32
            com.daaw.ir$b r3 = r2.M()
            if (r3 != r5) goto L37
        L32:
            java.util.ArrayList r3 = r6.a
            r3.add(r2)
        L37:
            int r1 = r1 + 1
            goto Lc
        L3a:
            r7.X0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2109Re.e(com.daaw.jr):void");
    }
}
