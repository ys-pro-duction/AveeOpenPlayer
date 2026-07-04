package com.daaw;

import com.daaw.AbstractC2745Xg1;
import com.daaw.C4106dr;
import com.daaw.C5510ir;
import com.daaw.C8066rz;

/* JADX INFO: renamed from: com.daaw.nW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6815nW extends AbstractC2745Xg1 {
    public static int[] k = new int[2];

    /* JADX INFO: renamed from: com.daaw.nW$a */
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

    public C6815nW(C5510ir c5510ir) {
        super(c5510ir);
        this.h.e = C8066rz.a.LEFT;
        this.i.e = C8066rz.a.RIGHT;
        this.f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ce  */
    @Override // com.daaw.AbstractC2745Xg1, com.daaw.InterfaceC6393lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.daaw.InterfaceC6393lz r14) {
        /*
            Method dump skipped, instruction units count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6815nW.a(com.daaw.lz):void");
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void d() {
        C5510ir c5510irG;
        C5510ir c5510irG2;
        C5510ir c5510ir = this.b;
        if (c5510ir.a) {
            this.e.d(c5510ir.P());
        }
        if (this.e.j) {
            C5510ir.b bVar = this.d;
            C5510ir.b bVar2 = C5510ir.b.MATCH_PARENT;
            if (bVar == bVar2 && (((c5510irG = this.b.G()) != null && c5510irG.y() == C5510ir.b.FIXED) || c5510irG.y() == bVar2)) {
                b(this.h, c5510irG.e.h, this.b.B.c());
                b(this.i, c5510irG.e.i, -this.b.D.c());
                return;
            }
        } else {
            C5510ir.b bVarY = this.b.y();
            this.d = bVarY;
            if (bVarY != C5510ir.b.MATCH_CONSTRAINT) {
                C5510ir.b bVar3 = C5510ir.b.MATCH_PARENT;
                if (bVarY == bVar3 && (((c5510irG2 = this.b.G()) != null && c5510irG2.y() == C5510ir.b.FIXED) || c5510irG2.y() == bVar3)) {
                    int iP = (c5510irG2.P() - this.b.B.c()) - this.b.D.c();
                    b(this.h, c5510irG2.e.h, this.b.B.c());
                    b(this.i, c5510irG2.e.i, -this.b.D.c());
                    this.e.d(iP);
                    return;
                }
                if (this.d == C5510ir.b.FIXED) {
                    this.e.d(this.b.P());
                }
            }
        }
        VB vb = this.e;
        if (vb.j) {
            C5510ir c5510ir2 = this.b;
            if (c5510ir2.a) {
                C4106dr[] c4106drArr = c5510ir2.J;
                C4106dr c4106dr = c4106drArr[0];
                C4106dr c4106dr2 = c4106dr.d;
                if (c4106dr2 != null && c4106drArr[1].d != null) {
                    if (c5510ir2.V()) {
                        this.h.f = this.b.J[0].c();
                        this.i.f = -this.b.J[1].c();
                        return;
                    }
                    C8066rz c8066rzH = h(this.b.J[0]);
                    if (c8066rzH != null) {
                        b(this.h, c8066rzH, this.b.J[0].c());
                    }
                    C8066rz c8066rzH2 = h(this.b.J[1]);
                    if (c8066rzH2 != null) {
                        b(this.i, c8066rzH2, -this.b.J[1].c());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (c4106dr2 != null) {
                    C8066rz c8066rzH3 = h(c4106dr);
                    if (c8066rzH3 != null) {
                        b(this.h, c8066rzH3, this.b.J[0].c());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                }
                C4106dr c4106dr3 = c4106drArr[1];
                if (c4106dr3.d != null) {
                    C8066rz c8066rzH4 = h(c4106dr3);
                    if (c8066rzH4 != null) {
                        b(this.i, c8066rzH4, -this.b.J[1].c());
                        b(this.h, this.i, -this.e.g);
                        return;
                    }
                    return;
                }
                if ((c5510ir2 instanceof MV) || c5510ir2.G() == null || this.b.m(C4106dr.b.CENTER).d != null) {
                    return;
                }
                b(this.h, this.b.G().e.h, this.b.Q());
                b(this.i, this.h, this.e.g);
                return;
            }
        }
        if (this.d == C5510ir.b.MATCH_CONSTRAINT) {
            C5510ir c5510ir3 = this.b;
            int i = c5510ir3.l;
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
            } else if (i == 3) {
                if (c5510ir3.m == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    C0838Fd1 c0838Fd1 = c5510ir3.f;
                    c0838Fd1.h.a = this;
                    c0838Fd1.i.a = this;
                    vb.a = this;
                    if (c5510ir3.X()) {
                        this.e.l.add(this.b.f.e);
                        this.b.f.e.k.add(this.e);
                        C0838Fd1 c0838Fd12 = this.b.f;
                        c0838Fd12.e.a = this;
                        this.e.l.add(c0838Fd12.h);
                        this.e.l.add(this.b.f.i);
                        this.b.f.h.k.add(this.e);
                        this.b.f.i.k.add(this.e);
                    } else if (this.b.V()) {
                        this.b.f.e.l.add(this.e);
                        this.e.k.add(this.b.f.e);
                    } else {
                        this.b.f.e.l.add(this.e);
                    }
                } else {
                    VB vb4 = c5510ir3.f.e;
                    vb.l.add(vb4);
                    vb4.k.add(this.e);
                    this.b.f.h.k.add(this.e);
                    this.b.f.i.k.add(this.e);
                    VB vb5 = this.e;
                    vb5.b = true;
                    vb5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    this.i.l.add(this.e);
                }
            }
        }
        C5510ir c5510ir4 = this.b;
        C4106dr[] c4106drArr2 = c5510ir4.J;
        C4106dr c4106dr4 = c4106drArr2[0];
        C4106dr c4106dr5 = c4106dr4.d;
        if (c4106dr5 != null && c4106drArr2[1].d != null) {
            if (c5510ir4.V()) {
                this.h.f = this.b.J[0].c();
                this.i.f = -this.b.J[1].c();
                return;
            }
            C8066rz c8066rzH5 = h(this.b.J[0]);
            C8066rz c8066rzH6 = h(this.b.J[1]);
            c8066rzH5.b(this);
            c8066rzH6.b(this);
            this.j = AbstractC2745Xg1.b.CENTER;
            return;
        }
        if (c4106dr5 != null) {
            C8066rz c8066rzH7 = h(c4106dr4);
            if (c8066rzH7 != null) {
                b(this.h, c8066rzH7, this.b.J[0].c());
                c(this.i, this.h, 1, this.e);
                return;
            }
            return;
        }
        C4106dr c4106dr6 = c4106drArr2[1];
        if (c4106dr6.d != null) {
            C8066rz c8066rzH8 = h(c4106dr6);
            if (c8066rzH8 != null) {
                b(this.i, c8066rzH8, -this.b.J[1].c());
                c(this.h, this.i, -1, this.e);
                return;
            }
            return;
        }
        if ((c5510ir4 instanceof MV) || c5510ir4.G() == null) {
            return;
        }
        b(this.h, this.b.G().e.h, this.b.Q());
        c(this.i, this.h, 1, this.e);
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void e() {
        C8066rz c8066rz = this.h;
        if (c8066rz.j) {
            this.b.F0(c8066rz.g);
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // com.daaw.AbstractC2745Xg1
    public boolean m() {
        return this.d != C5510ir.b.MATCH_CONSTRAINT || this.b.l == 0;
    }

    public final void q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.r();
    }
}
