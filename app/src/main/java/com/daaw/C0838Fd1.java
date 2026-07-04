package com.daaw;

import com.daaw.AbstractC2745Xg1;
import com.daaw.C4106dr;
import com.daaw.C5510ir;
import com.daaw.C8066rz;

/* JADX INFO: renamed from: com.daaw.Fd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0838Fd1 extends AbstractC2745Xg1 {
    public C8066rz k;
    public VB l;

    /* JADX INFO: renamed from: com.daaw.Fd1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC2745Xg1.b.values().length];
            a = iArr;
            try {
                iArr[AbstractC2745Xg1.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC2745Xg1.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AbstractC2745Xg1.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C0838Fd1(C5510ir c5510ir) {
        super(c5510ir);
        C8066rz c8066rz = new C8066rz(this);
        this.k = c8066rz;
        this.l = null;
        this.h.e = C8066rz.a.TOP;
        this.i.e = C8066rz.a.BOTTOM;
        c8066rz.e = C8066rz.a.BASELINE;
        this.f = 1;
    }

    @Override // com.daaw.AbstractC2745Xg1, com.daaw.InterfaceC6393lz
    public void a(InterfaceC6393lz interfaceC6393lz) {
        float f;
        float fT;
        float fT2;
        int i;
        int i2 = a.a[this.j.ordinal()];
        if (i2 == 1) {
            p(interfaceC6393lz);
        } else if (i2 == 2) {
            o(interfaceC6393lz);
        } else if (i2 == 3) {
            C5510ir c5510ir = this.b;
            n(interfaceC6393lz, c5510ir.C, c5510ir.E, 1);
            return;
        }
        VB vb = this.e;
        if (vb.c && !vb.j && this.d == C5510ir.b.MATCH_CONSTRAINT) {
            C5510ir c5510ir2 = this.b;
            int i3 = c5510ir2.m;
            if (i3 == 2) {
                C5510ir c5510irG = c5510ir2.G();
                if (c5510irG != null) {
                    if (c5510irG.f.e.j) {
                        this.e.d((int) ((r7.g * this.b.t) + 0.5f));
                    }
                }
            } else if (i3 == 3 && c5510ir2.e.e.j) {
                int iU = c5510ir2.u();
                if (iU == -1) {
                    C5510ir c5510ir3 = this.b;
                    f = c5510ir3.e.e.g;
                    fT = c5510ir3.t();
                } else if (iU == 0) {
                    fT2 = r7.e.e.g * this.b.t();
                    i = (int) (fT2 + 0.5f);
                    this.e.d(i);
                } else if (iU != 1) {
                    i = 0;
                    this.e.d(i);
                } else {
                    C5510ir c5510ir4 = this.b;
                    f = c5510ir4.e.e.g;
                    fT = c5510ir4.t();
                }
                fT2 = f / fT;
                i = (int) (fT2 + 0.5f);
                this.e.d(i);
            }
        }
        C8066rz c8066rz = this.h;
        if (c8066rz.c) {
            C8066rz c8066rz2 = this.i;
            if (c8066rz2.c) {
                if (c8066rz.j && c8066rz2.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == C5510ir.b.MATCH_CONSTRAINT) {
                    C5510ir c5510ir5 = this.b;
                    if (c5510ir5.l == 0 && !c5510ir5.X()) {
                        C8066rz c8066rz3 = (C8066rz) this.h.l.get(0);
                        C8066rz c8066rz4 = (C8066rz) this.i.l.get(0);
                        int i4 = c8066rz3.g;
                        C8066rz c8066rz5 = this.h;
                        int i5 = i4 + c8066rz5.f;
                        int i6 = c8066rz4.g + this.i.f;
                        c8066rz5.d(i5);
                        this.i.d(i6);
                        this.e.d(i6 - i5);
                        return;
                    }
                }
                if (!this.e.j && this.d == C5510ir.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    C8066rz c8066rz6 = (C8066rz) this.h.l.get(0);
                    int i7 = (((C8066rz) this.i.l.get(0)).g + this.i.f) - (c8066rz6.g + this.h.f);
                    VB vb2 = this.e;
                    int i8 = vb2.m;
                    if (i7 < i8) {
                        vb2.d(i7);
                    } else {
                        vb2.d(i8);
                    }
                }
                if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    C8066rz c8066rz7 = (C8066rz) this.h.l.get(0);
                    C8066rz c8066rz8 = (C8066rz) this.i.l.get(0);
                    int i9 = c8066rz7.g + this.h.f;
                    int i10 = c8066rz8.g + this.i.f;
                    float fK = this.b.K();
                    if (c8066rz7 == c8066rz8) {
                        i9 = c8066rz7.g;
                        i10 = c8066rz8.g;
                        fK = 0.5f;
                    }
                    this.h.d((int) (i9 + 0.5f + (((i10 - i9) - this.e.g) * fK)));
                    this.i.d(this.h.g + this.e.g);
                }
            }
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void d() {
        C5510ir c5510irG;
        C5510ir c5510irG2;
        C5510ir c5510ir = this.b;
        if (c5510ir.a) {
            this.e.d(c5510ir.v());
        }
        if (!this.e.j) {
            this.d = this.b.M();
            if (this.b.S()) {
                this.l = new C1567Me(this);
            }
            C5510ir.b bVar = this.d;
            if (bVar != C5510ir.b.MATCH_CONSTRAINT) {
                if (bVar == C5510ir.b.MATCH_PARENT && (c5510irG2 = this.b.G()) != null && c5510irG2.M() == C5510ir.b.FIXED) {
                    int iV = (c5510irG2.v() - this.b.C.c()) - this.b.E.c();
                    b(this.h, c5510irG2.f.h, this.b.C.c());
                    b(this.i, c5510irG2.f.i, -this.b.E.c());
                    this.e.d(iV);
                    return;
                }
                if (this.d == C5510ir.b.FIXED) {
                    this.e.d(this.b.v());
                }
            }
        } else if (this.d == C5510ir.b.MATCH_PARENT && (c5510irG = this.b.G()) != null && c5510irG.M() == C5510ir.b.FIXED) {
            b(this.h, c5510irG.f.h, this.b.C.c());
            b(this.i, c5510irG.f.i, -this.b.E.c());
            return;
        }
        VB vb = this.e;
        boolean z = vb.j;
        if (z) {
            C5510ir c5510ir2 = this.b;
            if (c5510ir2.a) {
                C4106dr[] c4106drArr = c5510ir2.J;
                C4106dr c4106dr = c4106drArr[2];
                C4106dr c4106dr2 = c4106dr.d;
                if (c4106dr2 != null && c4106drArr[3].d != null) {
                    if (c5510ir2.X()) {
                        this.h.f = this.b.J[2].c();
                        this.i.f = -this.b.J[3].c();
                    } else {
                        C8066rz c8066rzH = h(this.b.J[2]);
                        if (c8066rzH != null) {
                            b(this.h, c8066rzH, this.b.J[2].c());
                        }
                        C8066rz c8066rzH2 = h(this.b.J[3]);
                        if (c8066rzH2 != null) {
                            b(this.i, c8066rzH2, -this.b.J[3].c());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if (this.b.S()) {
                        b(this.k, this.h, this.b.n());
                        return;
                    }
                    return;
                }
                if (c4106dr2 != null) {
                    C8066rz c8066rzH3 = h(c4106dr);
                    if (c8066rzH3 != null) {
                        b(this.h, c8066rzH3, this.b.J[2].c());
                        b(this.i, this.h, this.e.g);
                        if (this.b.S()) {
                            b(this.k, this.h, this.b.n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C4106dr c4106dr3 = c4106drArr[3];
                if (c4106dr3.d != null) {
                    C8066rz c8066rzH4 = h(c4106dr3);
                    if (c8066rzH4 != null) {
                        b(this.i, c8066rzH4, -this.b.J[3].c());
                        b(this.h, this.i, -this.e.g);
                    }
                    if (this.b.S()) {
                        b(this.k, this.h, this.b.n());
                        return;
                    }
                    return;
                }
                C4106dr c4106dr4 = c4106drArr[4];
                if (c4106dr4.d != null) {
                    C8066rz c8066rzH5 = h(c4106dr4);
                    if (c8066rzH5 != null) {
                        b(this.k, c8066rzH5, 0);
                        b(this.h, this.k, -this.b.n());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                }
                if ((c5510ir2 instanceof MV) || c5510ir2.G() == null || this.b.m(C4106dr.b.CENTER).d != null) {
                    return;
                }
                b(this.h, this.b.G().f.h, this.b.R());
                b(this.i, this.h, this.e.g);
                if (this.b.S()) {
                    b(this.k, this.h, this.b.n());
                    return;
                }
                return;
            }
        }
        if (z || this.d != C5510ir.b.MATCH_CONSTRAINT) {
            vb.b(this);
        } else {
            C5510ir c5510ir3 = this.b;
            int i = c5510ir3.m;
            if (i == 2) {
                C5510ir c5510irG3 = c5510ir3.G();
                if (c5510irG3 != null) {
                    VB vb2 = c5510irG3.f.e;
                    this.e.l.add(vb2);
                    vb2.k.add(this.e);
                    VB vb3 = this.e;
                    vb3.b = true;
                    vb3.k.add(this.h);
                    this.e.k.add(this.i);
                }
            } else if (i == 3 && !c5510ir3.X()) {
                C5510ir c5510ir4 = this.b;
                if (c5510ir4.l != 3) {
                    VB vb4 = c5510ir4.e.e;
                    this.e.l.add(vb4);
                    vb4.k.add(this.e);
                    VB vb5 = this.e;
                    vb5.b = true;
                    vb5.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        }
        C5510ir c5510ir5 = this.b;
        C4106dr[] c4106drArr2 = c5510ir5.J;
        C4106dr c4106dr5 = c4106drArr2[2];
        C4106dr c4106dr6 = c4106dr5.d;
        if (c4106dr6 != null && c4106drArr2[3].d != null) {
            if (c5510ir5.X()) {
                this.h.f = this.b.J[2].c();
                this.i.f = -this.b.J[3].c();
            } else {
                C8066rz c8066rzH6 = h(this.b.J[2]);
                C8066rz c8066rzH7 = h(this.b.J[3]);
                c8066rzH6.b(this);
                c8066rzH7.b(this);
                this.j = AbstractC2745Xg1.b.CENTER;
            }
            if (this.b.S()) {
                c(this.k, this.h, 1, this.l);
            }
        } else if (c4106dr6 != null) {
            C8066rz c8066rzH8 = h(c4106dr5);
            if (c8066rzH8 != null) {
                b(this.h, c8066rzH8, this.b.J[2].c());
                c(this.i, this.h, 1, this.e);
                if (this.b.S()) {
                    c(this.k, this.h, 1, this.l);
                }
                C5510ir.b bVar2 = this.d;
                C5510ir.b bVar3 = C5510ir.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.t() > 0.0f) {
                    C6815nW c6815nW = this.b.e;
                    if (c6815nW.d == bVar3) {
                        c6815nW.e.k.add(this.e);
                        this.e.l.add(this.b.e.e);
                        this.e.a = this;
                    }
                }
            }
        } else {
            C4106dr c4106dr7 = c4106drArr2[3];
            if (c4106dr7.d != null) {
                C8066rz c8066rzH9 = h(c4106dr7);
                if (c8066rzH9 != null) {
                    b(this.i, c8066rzH9, -this.b.J[3].c());
                    c(this.h, this.i, -1, this.e);
                    if (this.b.S()) {
                        c(this.k, this.h, 1, this.l);
                    }
                }
            } else {
                C4106dr c4106dr8 = c4106drArr2[4];
                if (c4106dr8.d != null) {
                    C8066rz c8066rzH10 = h(c4106dr8);
                    if (c8066rzH10 != null) {
                        b(this.k, c8066rzH10, 0);
                        c(this.h, this.k, -1, this.l);
                        c(this.i, this.h, 1, this.e);
                    }
                } else if (!(c5510ir5 instanceof MV) && c5510ir5.G() != null) {
                    b(this.h, this.b.G().f.h, this.b.R());
                    c(this.i, this.h, 1, this.e);
                    if (this.b.S()) {
                        c(this.k, this.h, 1, this.l);
                    }
                    C5510ir.b bVar4 = this.d;
                    C5510ir.b bVar5 = C5510ir.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.b.t() > 0.0f) {
                        C6815nW c6815nW2 = this.b.e;
                        if (c6815nW2.d == bVar5) {
                            c6815nW2.e.k.add(this.e);
                            this.e.l.add(this.b.e.e);
                            this.e.a = this;
                        }
                    }
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void e() {
        C8066rz c8066rz = this.h;
        if (c8066rz.j) {
            this.b.G0(c8066rz.g);
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // com.daaw.AbstractC2745Xg1
    public boolean m() {
        return this.d != C5510ir.b.MATCH_CONSTRAINT || this.b.m == 0;
    }

    public void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.r();
    }
}
