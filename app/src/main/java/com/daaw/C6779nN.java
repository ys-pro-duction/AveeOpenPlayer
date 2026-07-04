package com.daaw;

import com.daaw.C5510ir;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.nN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6779nN extends AbstractC6858nf1 {
    public C5510ir[] i1;
    public int L0 = -1;
    public int M0 = -1;
    public int N0 = -1;
    public int O0 = -1;
    public int P0 = -1;
    public int Q0 = -1;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public float T0 = 0.5f;
    public float U0 = 0.5f;
    public float V0 = 0.5f;
    public float W0 = 0.5f;
    public int X0 = 0;
    public int Y0 = 0;
    public int Z0 = 2;
    public int a1 = 2;
    public int b1 = 0;
    public int c1 = -1;
    public int d1 = 0;
    public ArrayList e1 = new ArrayList();
    public C5510ir[] f1 = null;
    public C5510ir[] g1 = null;
    public int[] h1 = null;
    public int j1 = 0;

    /* JADX INFO: renamed from: com.daaw.nN$a */
    public class a {
        public int a;
        public C4106dr d;
        public C4106dr e;
        public C4106dr f;
        public C4106dr g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int q;
        public C5510ir b = null;
        public int c = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;

        public a(int i, C4106dr c4106dr, C4106dr c4106dr2, C4106dr c4106dr3, C4106dr c4106dr4, int i2) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = c4106dr;
            this.e = c4106dr2;
            this.f = c4106dr3;
            this.g = c4106dr4;
            this.h = C6779nN.this.P0();
            this.i = C6779nN.this.R0();
            this.j = C6779nN.this.Q0();
            this.k = C6779nN.this.O0();
            this.q = i2;
        }

        public void b(C5510ir c5510ir) {
            if (this.a == 0) {
                int iB1 = C6779nN.this.B1(c5510ir, this.q);
                if (c5510ir.y() == C5510ir.b.MATCH_CONSTRAINT) {
                    this.p++;
                    iB1 = 0;
                }
                this.l += iB1 + (c5510ir.O() != 8 ? C6779nN.this.X0 : 0);
                int iA1 = C6779nN.this.A1(c5510ir, this.q);
                if (this.b == null || this.c < iA1) {
                    this.b = c5510ir;
                    this.c = iA1;
                    this.m = iA1;
                }
            } else {
                int iB12 = C6779nN.this.B1(c5510ir, this.q);
                int iA12 = C6779nN.this.A1(c5510ir, this.q);
                if (c5510ir.M() == C5510ir.b.MATCH_CONSTRAINT) {
                    this.p++;
                    iA12 = 0;
                }
                this.m += iA12 + (c5510ir.O() != 8 ? C6779nN.this.Y0 : 0);
                if (this.b == null || this.c < iB12) {
                    this.b = c5510ir;
                    this.c = iB12;
                    this.l = iB12;
                }
            }
            this.o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public void d(boolean z, int i, boolean z2) {
            C5510ir c5510ir;
            int i2 = this.o;
            for (int i3 = 0; i3 < i2 && this.n + i3 < C6779nN.this.j1; i3++) {
                C5510ir c5510ir2 = C6779nN.this.i1[this.n + i3];
                if (c5510ir2 != null) {
                    c5510ir2.Z();
                }
            }
            if (i2 == 0 || this.b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.n + i7 >= C6779nN.this.j1) {
                    break;
                }
                if (C6779nN.this.i1[this.n + i7].O() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            C5510ir c5510ir3 = null;
            if (this.a != 0) {
                C5510ir c5510ir4 = this.b;
                c5510ir4.j0(C6779nN.this.L0);
                int i8 = this.h;
                if (i > 0) {
                    i8 += C6779nN.this.X0;
                }
                if (z) {
                    c5510ir4.D.a(this.f, i8);
                    if (z2) {
                        c5510ir4.B.a(this.d, this.j);
                    }
                    if (i > 0) {
                        this.f.b.B.a(c5510ir4.D, 0);
                    }
                } else {
                    c5510ir4.B.a(this.d, i8);
                    if (z2) {
                        c5510ir4.D.a(this.f, this.j);
                    }
                    if (i > 0) {
                        this.d.b.D.a(c5510ir4.B, 0);
                    }
                }
                int i9 = 0;
                while (i9 < i2 && this.n + i9 < C6779nN.this.j1) {
                    C5510ir c5510ir5 = C6779nN.this.i1[this.n + i9];
                    if (i9 == 0) {
                        c5510ir5.j(c5510ir5.C, this.e, this.i);
                        int i10 = C6779nN.this.M0;
                        float f = C6779nN.this.S0;
                        if (this.n == 0 && C6779nN.this.O0 != -1) {
                            i10 = C6779nN.this.O0;
                            f = C6779nN.this.U0;
                        } else if (z2 && C6779nN.this.Q0 != -1) {
                            i10 = C6779nN.this.Q0;
                            f = C6779nN.this.W0;
                        }
                        c5510ir5.y0(i10);
                        c5510ir5.x0(f);
                    }
                    if (i9 == i2 - 1) {
                        c5510ir5.j(c5510ir5.E, this.g, this.k);
                    }
                    if (c5510ir3 != null) {
                        c5510ir5.C.a(c5510ir3.E, C6779nN.this.Y0);
                        if (i9 == i4) {
                            c5510ir5.C.n(this.i);
                        }
                        c5510ir3.E.a(c5510ir5.C, 0);
                        if (i9 == i5 + 1) {
                            c5510ir3.E.n(this.k);
                        }
                    }
                    if (c5510ir5 != c5510ir4) {
                        if (z) {
                            int i11 = C6779nN.this.Z0;
                            if (i11 == 0) {
                                c5510ir5.D.a(c5510ir4.D, 0);
                            } else if (i11 == 1) {
                                c5510ir5.B.a(c5510ir4.B, 0);
                            } else if (i11 == 2) {
                                c5510ir5.B.a(c5510ir4.B, 0);
                                c5510ir5.D.a(c5510ir4.D, 0);
                            }
                        } else {
                            int i12 = C6779nN.this.Z0;
                            if (i12 == 0) {
                                c5510ir5.B.a(c5510ir4.B, 0);
                            } else if (i12 == 1) {
                                c5510ir5.D.a(c5510ir4.D, 0);
                            } else if (i12 == 2) {
                                if (z3) {
                                    c5510ir5.B.a(this.d, this.h);
                                    c5510ir5.D.a(this.f, this.j);
                                } else {
                                    c5510ir5.B.a(c5510ir4.B, 0);
                                    c5510ir5.D.a(c5510ir4.D, 0);
                                }
                            }
                        }
                    }
                    i9++;
                    c5510ir3 = c5510ir5;
                }
                return;
            }
            C5510ir c5510ir6 = this.b;
            c5510ir6.y0(C6779nN.this.M0);
            int i13 = this.i;
            if (i > 0) {
                i13 += C6779nN.this.Y0;
            }
            c5510ir6.C.a(this.e, i13);
            if (z2) {
                c5510ir6.E.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.b.E.a(c5510ir6.C, 0);
            }
            if (C6779nN.this.a1 != 3 || c5510ir6.S()) {
                c5510ir = c5510ir6;
            } else {
                for (int i14 = 0; i14 < i2; i14++) {
                    int i15 = z ? (i2 - 1) - i14 : i14;
                    if (this.n + i15 >= C6779nN.this.j1) {
                        break;
                    }
                    c5510ir = C6779nN.this.i1[this.n + i15];
                    if (c5510ir.S()) {
                        break;
                    }
                }
                c5510ir = c5510ir6;
            }
            int i16 = 0;
            while (i16 < i2) {
                int i17 = z ? (i2 - 1) - i16 : i16;
                if (this.n + i17 >= C6779nN.this.j1) {
                    return;
                }
                C5510ir c5510ir7 = C6779nN.this.i1[this.n + i17];
                if (i16 == 0) {
                    c5510ir7.j(c5510ir7.B, this.d, this.h);
                }
                if (i17 == 0) {
                    int i18 = C6779nN.this.L0;
                    float f2 = C6779nN.this.R0;
                    if (this.n == 0 && C6779nN.this.N0 != -1) {
                        i18 = C6779nN.this.N0;
                        f2 = C6779nN.this.T0;
                    } else if (z2 && C6779nN.this.P0 != -1) {
                        i18 = C6779nN.this.P0;
                        f2 = C6779nN.this.V0;
                    }
                    c5510ir7.j0(i18);
                    c5510ir7.i0(f2);
                }
                if (i16 == i2 - 1) {
                    c5510ir7.j(c5510ir7.D, this.f, this.j);
                }
                if (c5510ir3 != null) {
                    c5510ir7.B.a(c5510ir3.D, C6779nN.this.X0);
                    if (i16 == i4) {
                        c5510ir7.B.n(this.h);
                    }
                    c5510ir3.D.a(c5510ir7.B, 0);
                    if (i16 == i5 + 1) {
                        c5510ir3.D.n(this.j);
                    }
                }
                if (c5510ir7 != c5510ir6) {
                    if (C6779nN.this.a1 == 3 && c5510ir.S() && c5510ir7 != c5510ir && c5510ir7.S()) {
                        c5510ir7.F.a(c5510ir.F, 0);
                    } else {
                        int i19 = C6779nN.this.a1;
                        if (i19 == 0) {
                            c5510ir7.C.a(c5510ir6.C, 0);
                        } else if (i19 == 1) {
                            c5510ir7.E.a(c5510ir6.E, 0);
                        } else if (z3) {
                            c5510ir7.C.a(this.e, this.i);
                            c5510ir7.E.a(this.g, this.k);
                        } else {
                            c5510ir7.C.a(c5510ir6.C, 0);
                            c5510ir7.E.a(c5510ir6.E, 0);
                        }
                    }
                }
                i16++;
                c5510ir3 = c5510ir7;
            }
        }

        public int e() {
            return this.a == 1 ? this.m - C6779nN.this.Y0 : this.m;
        }

        public int f() {
            return this.a == 0 ? this.l - C6779nN.this.X0 : this.l;
        }

        public void g(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.n + i5 < C6779nN.this.j1; i5++) {
                C5510ir c5510ir = C6779nN.this.i1[this.n + i5];
                if (this.a == 0) {
                    if (c5510ir != null && c5510ir.y() == C5510ir.b.MATCH_CONSTRAINT && c5510ir.l == 0) {
                        C6779nN.this.T0(c5510ir, C5510ir.b.FIXED, i4, c5510ir.M(), c5510ir.v());
                    }
                } else if (c5510ir != null && c5510ir.M() == C5510ir.b.MATCH_CONSTRAINT && c5510ir.m == 0) {
                    int i6 = i4;
                    C6779nN.this.T0(c5510ir, c5510ir.y(), c5510ir.P(), C5510ir.b.FIXED, i6);
                    i4 = i6;
                }
            }
            h();
        }

        public final void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i = this.o;
            for (int i2 = 0; i2 < i && this.n + i2 < C6779nN.this.j1; i2++) {
                C5510ir c5510ir = C6779nN.this.i1[this.n + i2];
                if (this.a == 0) {
                    int iP = c5510ir.P();
                    int i3 = C6779nN.this.X0;
                    if (c5510ir.O() == 8) {
                        i3 = 0;
                    }
                    this.l += iP + i3;
                    int iA1 = C6779nN.this.A1(c5510ir, this.q);
                    if (this.b == null || this.c < iA1) {
                        this.b = c5510ir;
                        this.c = iA1;
                        this.m = iA1;
                    }
                } else {
                    int iB1 = C6779nN.this.B1(c5510ir, this.q);
                    int iA12 = C6779nN.this.A1(c5510ir, this.q);
                    int i4 = C6779nN.this.Y0;
                    if (c5510ir.O() == 8) {
                        i4 = 0;
                    }
                    this.m += iA12 + i4;
                    if (this.b == null || this.c < iB1) {
                        this.b = c5510ir;
                        this.c = iB1;
                        this.l = iB1;
                    }
                }
            }
        }

        public void i(int i) {
            this.n = i;
        }

        public void j(int i, C4106dr c4106dr, C4106dr c4106dr2, C4106dr c4106dr3, C4106dr c4106dr4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = c4106dr;
            this.e = c4106dr2;
            this.f = c4106dr3;
            this.g = c4106dr4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    public final int A1(C5510ir c5510ir, int i) {
        C5510ir c5510ir2;
        if (c5510ir == null) {
            return 0;
        }
        if (c5510ir.M() == C5510ir.b.MATCH_CONSTRAINT) {
            int i2 = c5510ir.m;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c5510ir.t * i);
                if (i3 != c5510ir.v()) {
                    T0(c5510ir, c5510ir.y(), c5510ir.P(), C5510ir.b.FIXED, i3);
                }
                return i3;
            }
            c5510ir2 = c5510ir;
            if (i2 == 1) {
                return c5510ir2.v();
            }
            if (i2 == 3) {
                return (int) ((c5510ir2.P() * c5510ir2.Q) + 0.5f);
            }
        } else {
            c5510ir2 = c5510ir;
        }
        return c5510ir2.v();
    }

    public final int B1(C5510ir c5510ir, int i) {
        C5510ir c5510ir2;
        if (c5510ir == null) {
            return 0;
        }
        if (c5510ir.y() == C5510ir.b.MATCH_CONSTRAINT) {
            int i2 = c5510ir.l;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c5510ir.q * i);
                if (i3 != c5510ir.P()) {
                    T0(c5510ir, C5510ir.b.FIXED, i3, c5510ir.M(), c5510ir.v());
                }
                return i3;
            }
            c5510ir2 = c5510ir;
            if (i2 == 1) {
                return c5510ir2.P();
            }
            if (i2 == 3) {
                return (int) ((c5510ir2.v() * c5510ir2.Q) + 0.5f);
            }
        } else {
            c5510ir2 = c5510ir;
        }
        return c5510ir2.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C1(com.daaw.C5510ir[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6779nN.C1(com.daaw.ir[], int, int, int, int[]):void");
    }

    public final void D1(C5510ir[] c5510irArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        C6779nN c6779nN;
        int i5;
        C4106dr c4106dr;
        int i6;
        C6779nN c6779nN2 = this;
        if (i == 0) {
            return;
        }
        c6779nN2.e1.clear();
        int i7 = i3;
        a aVar = c6779nN2.new a(i2, c6779nN2.B, c6779nN2.C, c6779nN2.D, c6779nN2.E, i7);
        c6779nN2.e1.add(aVar);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                C5510ir c5510ir = c5510irArr[i9];
                int iB1 = c6779nN2.B1(c5510ir, i7);
                if (c5510ir.y() == C5510ir.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                boolean z = (i8 == i7 || (c6779nN2.X0 + i8) + iB1 > i7) && aVar.b != null;
                if (!z && i9 > 0 && (i6 = c6779nN2.c1) > 0 && i9 % i6 == 0) {
                    z = true;
                }
                if (z) {
                    aVar = c6779nN2.new a(i2, c6779nN2.B, c6779nN2.C, c6779nN2.D, c6779nN2.E, i7);
                    aVar.i(i9);
                    c6779nN2.e1.add(aVar);
                } else {
                    if (i9 > 0) {
                        i8 += c6779nN2.X0 + iB1;
                    }
                    aVar.b(c5510ir);
                    i9++;
                    i4 = i10;
                }
                i8 = iB1;
                aVar.b(c5510ir);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                C5510ir c5510ir2 = c5510irArr[i12];
                int iA1 = c6779nN2.A1(c5510ir2, i7);
                if (c5510ir2.M() == C5510ir.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                boolean z2 = (i11 == i7 || (c6779nN2.Y0 + i11) + iA1 > i7) && aVar.b != null;
                if (!z2 && i12 > 0 && (i5 = c6779nN2.c1) > 0 && i12 % i5 == 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar = c6779nN2.new a(i2, c6779nN2.B, c6779nN2.C, c6779nN2.D, c6779nN2.E, i7);
                    c6779nN = c6779nN2;
                    aVar.i(i12);
                    c6779nN.e1.add(aVar);
                } else {
                    c6779nN = c6779nN2;
                    if (i12 > 0) {
                        i11 += c6779nN.Y0 + iA1;
                    }
                    aVar.b(c5510ir2);
                    i12++;
                    i7 = i3;
                    i4 = i13;
                    c6779nN2 = c6779nN;
                }
                i11 = iA1;
                aVar.b(c5510ir2);
                i12++;
                i7 = i3;
                i4 = i13;
                c6779nN2 = c6779nN;
            }
        }
        C6779nN c6779nN3 = c6779nN2;
        int size = c6779nN3.e1.size();
        C4106dr c4106dr2 = c6779nN3.B;
        C4106dr c4106dr3 = c6779nN3.C;
        C4106dr c4106dr4 = c6779nN3.D;
        C4106dr c4106dr5 = c6779nN3.E;
        int iP0 = c6779nN3.P0();
        int iR0 = c6779nN3.R0();
        int iQ0 = c6779nN3.Q0();
        int iO0 = c6779nN3.O0();
        C5510ir.b bVarY = c6779nN3.y();
        C5510ir.b bVar = C5510ir.b.WRAP_CONTENT;
        boolean z3 = bVarY == bVar || c6779nN3.M() == bVar;
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                a aVar2 = (a) c6779nN3.e1.get(i14);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        C4106dr c4106dr6 = c4106dr2;
        int iO02 = iO0;
        int i15 = 0;
        int iQ02 = iQ0;
        int i16 = iR0;
        int i17 = iP0;
        C4106dr c4106dr7 = c4106dr5;
        C4106dr c4106dr8 = c4106dr4;
        C4106dr c4106dr9 = c4106dr3;
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            a aVar3 = (a) c6779nN3.e1.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    c4106dr7 = ((a) c6779nN3.e1.get(i19 + 1)).b.C;
                    iO02 = 0;
                } else {
                    c4106dr7 = c6779nN3.E;
                    iO02 = c6779nN3.O0();
                }
                C4106dr c4106dr10 = aVar3.b.E;
                int i20 = i18;
                aVar3.j(i2, c4106dr6, c4106dr9, c4106dr8, c4106dr7, i17, i16, iQ02, iO02, i3);
                int iMax = Math.max(i15, aVar3.f());
                int iE = aVar3.e() + i20;
                if (i19 > 0) {
                    iE += c6779nN3.Y0;
                }
                i18 = iE;
                i15 = iMax;
                c4106dr9 = c4106dr10;
                i16 = 0;
            } else {
                int i21 = i15;
                int i22 = i18;
                if (i19 < size - 1) {
                    c4106dr = ((a) c6779nN3.e1.get(i19 + 1)).b.B;
                    iQ02 = 0;
                } else {
                    c4106dr = c6779nN3.D;
                    iQ02 = c6779nN3.Q0();
                }
                c4106dr8 = c4106dr;
                C4106dr c4106dr11 = aVar3.b.D;
                aVar3.j(i2, c4106dr6, c4106dr9, c4106dr8, c4106dr7, i17, i16, iQ02, iO02, i3);
                int iF = aVar3.f() + i21;
                int iMax2 = Math.max(i22, aVar3.e());
                if (i19 > 0) {
                    iF += c6779nN3.X0;
                }
                int i23 = iF;
                i18 = iMax2;
                i15 = i23;
                c4106dr6 = c4106dr11;
                i17 = 0;
            }
        }
        iArr[0] = i15;
        iArr[1] = i18;
    }

    public final void E1(C5510ir[] c5510irArr, int i, int i2, int i3, int[] iArr) {
        a aVar;
        if (i == 0) {
            return;
        }
        if (this.e1.size() == 0) {
            aVar = new a(i2, this.B, this.C, this.D, this.E, i3);
            this.e1.add(aVar);
        } else {
            a aVar2 = (a) this.e1.get(0);
            aVar2.c();
            aVar2.j(i2, this.B, this.C, this.D, this.E, P0(), R0(), Q0(), O0(), i3);
            aVar = aVar2;
        }
        for (int i4 = 0; i4 < i; i4++) {
            aVar.b(c5510irArr[i4]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void F1(float f) {
        this.T0 = f;
    }

    public void G1(int i) {
        this.N0 = i;
    }

    public void H1(float f) {
        this.U0 = f;
    }

    public void I1(int i) {
        this.O0 = i;
    }

    public void J1(int i) {
        this.Z0 = i;
    }

    public void K1(float f) {
        this.R0 = f;
    }

    public void L1(int i) {
        this.X0 = i;
    }

    public void M1(int i) {
        this.L0 = i;
    }

    public void N1(float f) {
        this.V0 = f;
    }

    public void O1(int i) {
        this.P0 = i;
    }

    public void P1(float f) {
        this.W0 = f;
    }

    public void Q1(int i) {
        this.Q0 = i;
    }

    public void R1(int i) {
        this.c1 = i;
    }

    @Override // com.daaw.AbstractC6858nf1
    public void S0(int i, int i2, int i3, int i4) {
        int i5;
        C5510ir[] c5510irArr;
        if (this.x0 > 0 && !U0()) {
            X0(0, 0);
            W0(false);
            return;
        }
        int iP0 = P0();
        int iQ0 = Q0();
        int iR0 = R0();
        int iO0 = O0();
        int[] iArr = new int[2];
        int i6 = (i2 - iP0) - iQ0;
        int i7 = this.d1;
        if (i7 == 1) {
            i6 = (i4 - iR0) - iO0;
        }
        int i8 = i6;
        if (i7 == 0) {
            if (this.L0 == -1) {
                this.L0 = 0;
            }
            if (this.M0 == -1) {
                this.M0 = 0;
            }
        } else {
            if (this.L0 == -1) {
                this.L0 = 0;
            }
            if (this.M0 == -1) {
                this.M0 = 0;
            }
        }
        C5510ir[] c5510irArr2 = this.w0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = this.x0;
            if (i9 >= i5) {
                break;
            }
            if (this.w0[i9].O() == 8) {
                i10++;
            }
            i9++;
        }
        if (i10 > 0) {
            C5510ir[] c5510irArr3 = new C5510ir[i5 - i10];
            int i11 = 0;
            i5 = 0;
            while (i11 < this.x0) {
                C5510ir c5510ir = this.w0[i11];
                C5510ir[] c5510irArr4 = c5510irArr3;
                if (c5510ir.O() != 8) {
                    c5510irArr4[i5] = c5510ir;
                    i5++;
                }
                i11++;
                c5510irArr3 = c5510irArr4;
            }
            c5510irArr = c5510irArr3;
        } else {
            c5510irArr = c5510irArr2;
        }
        int i12 = i5;
        this.i1 = c5510irArr;
        this.j1 = i12;
        int i13 = this.b1;
        if (i13 == 0) {
            E1(c5510irArr, i12, this.d1, i8, iArr);
        } else if (i13 == 1) {
            D1(c5510irArr, i12, this.d1, i8, iArr);
        } else if (i13 == 2) {
            C1(c5510irArr, i12, this.d1, i8, iArr);
        }
        int iMin = iArr[0] + iP0 + iQ0;
        int iMin2 = iArr[1] + iR0 + iO0;
        if (i == 1073741824) {
            iMin = i2;
        } else if (i == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i2);
        } else if (i != 0) {
            iMin = 0;
        }
        if (i3 == 1073741824) {
            iMin2 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i3 != 0) {
            iMin2 = 0;
        }
        X0(iMin, iMin2);
        E0(iMin);
        h0(iMin2);
        W0(this.x0 > 0);
    }

    public void S1(int i) {
        this.d1 = i;
    }

    public void T1(int i) {
        this.a1 = i;
    }

    public void U1(float f) {
        this.S0 = f;
    }

    public void V1(int i) {
        this.Y0 = i;
    }

    public void W1(int i) {
        this.M0 = i;
    }

    public void X1(int i) {
        this.b1 = i;
    }

    @Override // com.daaw.C5510ir
    public void f(C4311ec0 c4311ec0) {
        super.f(c4311ec0);
        boolean zA1 = G() != null ? ((C5791jr) G()).a1() : false;
        int i = this.b1;
        if (i != 0) {
            if (i == 1) {
                int size = this.e1.size();
                int i2 = 0;
                while (i2 < size) {
                    ((a) this.e1.get(i2)).d(zA1, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                z1(zA1);
            }
        } else if (this.e1.size() > 0) {
            ((a) this.e1.get(0)).d(zA1, 0, true);
        }
        W0(false);
    }

    public final void z1(boolean z) {
        C5510ir c5510ir;
        if (this.h1 == null || this.g1 == null || this.f1 == null) {
            return;
        }
        for (int i = 0; i < this.j1; i++) {
            this.i1[i].Z();
        }
        int[] iArr = this.h1;
        int i2 = iArr[0];
        int i3 = iArr[1];
        C5510ir c5510ir2 = null;
        for (int i4 = 0; i4 < i2; i4++) {
            C5510ir c5510ir3 = this.g1[z ? (i2 - i4) - 1 : i4];
            if (c5510ir3 != null && c5510ir3.O() != 8) {
                if (i4 == 0) {
                    c5510ir3.j(c5510ir3.B, this.B, P0());
                    c5510ir3.j0(this.L0);
                    c5510ir3.i0(this.R0);
                }
                if (i4 == i2 - 1) {
                    c5510ir3.j(c5510ir3.D, this.D, Q0());
                }
                if (i4 > 0) {
                    c5510ir3.j(c5510ir3.B, c5510ir2.D, this.X0);
                    c5510ir2.j(c5510ir2.D, c5510ir3.B, 0);
                }
                c5510ir2 = c5510ir3;
            }
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C5510ir c5510ir4 = this.f1[i5];
            if (c5510ir4 != null && c5510ir4.O() != 8) {
                if (i5 == 0) {
                    c5510ir4.j(c5510ir4.C, this.C, R0());
                    c5510ir4.y0(this.M0);
                    c5510ir4.x0(this.S0);
                }
                if (i5 == i3 - 1) {
                    c5510ir4.j(c5510ir4.E, this.E, O0());
                }
                if (i5 > 0) {
                    c5510ir4.j(c5510ir4.C, c5510ir2.E, this.Y0);
                    c5510ir2.j(c5510ir2.E, c5510ir4.C, 0);
                }
                c5510ir2 = c5510ir4;
            }
        }
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = (i7 * i2) + i6;
                if (this.d1 == 1) {
                    i8 = (i6 * i3) + i7;
                }
                C5510ir[] c5510irArr = this.i1;
                if (i8 < c5510irArr.length && (c5510ir = c5510irArr[i8]) != null && c5510ir.O() != 8) {
                    C5510ir c5510ir5 = this.g1[i6];
                    C5510ir c5510ir6 = this.f1[i7];
                    if (c5510ir != c5510ir5) {
                        c5510ir.j(c5510ir.B, c5510ir5.B, 0);
                        c5510ir.j(c5510ir.D, c5510ir5.D, 0);
                    }
                    if (c5510ir != c5510ir6) {
                        c5510ir.j(c5510ir.C, c5510ir6.C, 0);
                        c5510ir.j(c5510ir.E, c5510ir6.E, 0);
                    }
                }
            }
        }
    }
}
