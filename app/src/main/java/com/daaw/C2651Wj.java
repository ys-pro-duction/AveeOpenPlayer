package com.daaw;

import com.daaw.C5510ir;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2651Wj {
    public C5510ir a;
    public C5510ir b;
    public C5510ir c;
    public C5510ir d;
    public C5510ir e;
    public C5510ir f;
    public C5510ir g;
    public ArrayList h;
    public int i;
    public int j;
    public float k = 0.0f;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public C2651Wj(C5510ir c5510ir, int i, boolean z) {
        this.a = c5510ir;
        this.p = i;
        this.q = z;
    }

    public static boolean c(C5510ir c5510ir, int i) {
        if (c5510ir.O() == 8 || c5510ir.M[i] != C5510ir.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i2 = c5510ir.n[i];
        return i2 == 0 || i2 == 3;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }

    public final void b() {
        int i = this.p * 2;
        C5510ir c5510ir = this.a;
        this.o = true;
        C5510ir c5510ir2 = c5510ir;
        boolean z = false;
        while (!z) {
            this.i++;
            C5510ir[] c5510irArr = c5510ir.s0;
            int i2 = this.p;
            C5510ir c5510ir3 = null;
            c5510irArr[i2] = null;
            c5510ir.r0[i2] = null;
            if (c5510ir.O() != 8) {
                this.l++;
                C5510ir.b bVarS = c5510ir.s(this.p);
                C5510ir.b bVar = C5510ir.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.m += c5510ir.A(this.p);
                }
                int iC = this.m + c5510ir.J[i].c();
                this.m = iC;
                int i3 = i + 1;
                this.m = iC + c5510ir.J[i3].c();
                int iC2 = this.n + c5510ir.J[i].c();
                this.n = iC2;
                this.n = iC2 + c5510ir.J[i3].c();
                if (this.b == null) {
                    this.b = c5510ir;
                }
                this.d = c5510ir;
                C5510ir.b[] bVarArr = c5510ir.M;
                int i4 = this.p;
                if (bVarArr[i4] == bVar) {
                    int i5 = c5510ir.n[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.j++;
                        float f = c5510ir.q0[i4];
                        if (f > 0.0f) {
                            this.k += f;
                        }
                        if (c(c5510ir, i4)) {
                            if (f < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList();
                            }
                            this.h.add(c5510ir);
                        }
                        if (this.f == null) {
                            this.f = c5510ir;
                        }
                        C5510ir c5510ir4 = this.g;
                        if (c5510ir4 != null) {
                            c5510ir4.r0[this.p] = c5510ir;
                        }
                        this.g = c5510ir;
                    }
                    if (this.p == 0) {
                        if (c5510ir.l != 0 || c5510ir.o != 0 || c5510ir.p != 0) {
                            this.o = false;
                        }
                    } else if (c5510ir.m != 0 || c5510ir.r != 0 || c5510ir.s != 0) {
                        this.o = false;
                    }
                    if (c5510ir.Q != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (c5510ir2 != c5510ir) {
                c5510ir2.s0[this.p] = c5510ir;
            }
            C4106dr c4106dr = c5510ir.J[i + 1].d;
            if (c4106dr != null) {
                C5510ir c5510ir5 = c4106dr.b;
                C4106dr c4106dr2 = c5510ir5.J[i].d;
                if (c4106dr2 != null && c4106dr2.b == c5510ir) {
                    c5510ir3 = c5510ir5;
                }
            }
            if (c5510ir3 == null) {
                c5510ir3 = c5510ir;
                z = true;
            }
            c5510ir2 = c5510ir;
            c5510ir = c5510ir3;
        }
        C5510ir c5510ir6 = this.b;
        if (c5510ir6 != null) {
            this.m -= c5510ir6.J[i].c();
        }
        C5510ir c5510ir7 = this.d;
        if (c5510ir7 != null) {
            this.m -= c5510ir7.J[i + 1].c();
        }
        this.c = c5510ir;
        if (this.p == 0 && this.q) {
            this.e = c5510ir;
        } else {
            this.e = this.a;
        }
        this.t = this.s && this.r;
    }
}
