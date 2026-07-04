package com.daaw;

import com.daaw.C4106dr;
import com.daaw.C5510ir;

/* JADX INFO: renamed from: com.daaw.Xg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2745Xg1 implements InterfaceC6393lz {
    public int a;
    public C5510ir b;
    public C7883rK0 c;
    public C5510ir.b d;
    public VB e = new VB(this);
    public int f = 0;
    public boolean g = false;
    public C8066rz h = new C8066rz(this);
    public C8066rz i = new C8066rz(this);
    public b j = b.NONE;

    /* JADX INFO: renamed from: com.daaw.Xg1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C4106dr.b.values().length];
            a = iArr;
            try {
                iArr[C4106dr.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C4106dr.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C4106dr.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C4106dr.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[C4106dr.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Xg1$b */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC2745Xg1(C5510ir c5510ir) {
        this.b = c5510ir;
    }

    @Override // com.daaw.InterfaceC6393lz
    public abstract void a(InterfaceC6393lz interfaceC6393lz);

    public final void b(C8066rz c8066rz, C8066rz c8066rz2, int i) {
        c8066rz.l.add(c8066rz2);
        c8066rz.f = i;
        c8066rz2.k.add(c8066rz);
    }

    public final void c(C8066rz c8066rz, C8066rz c8066rz2, int i, VB vb) {
        c8066rz.l.add(c8066rz2);
        c8066rz.l.add(this.e);
        c8066rz.h = i;
        c8066rz.i = vb;
        c8066rz2.k.add(c8066rz);
        vb.k.add(c8066rz);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            C5510ir c5510ir = this.b;
            int i3 = c5510ir.p;
            int iMax = Math.max(c5510ir.o, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C5510ir c5510ir2 = this.b;
            int i4 = c5510ir2.s;
            int iMax2 = Math.max(c5510ir2.r, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public final C8066rz h(C4106dr c4106dr) {
        C4106dr c4106dr2 = c4106dr.d;
        if (c4106dr2 == null) {
            return null;
        }
        C5510ir c5510ir = c4106dr2.b;
        int i = a.a[c4106dr2.c.ordinal()];
        if (i == 1) {
            return c5510ir.e.h;
        }
        if (i == 2) {
            return c5510ir.e.i;
        }
        if (i == 3) {
            return c5510ir.f.h;
        }
        if (i == 4) {
            return c5510ir.f.k;
        }
        if (i != 5) {
            return null;
        }
        return c5510ir.f.i;
    }

    public final C8066rz i(C4106dr c4106dr, int i) {
        C4106dr c4106dr2 = c4106dr.d;
        if (c4106dr2 == null) {
            return null;
        }
        C5510ir c5510ir = c4106dr2.b;
        AbstractC2745Xg1 abstractC2745Xg1 = i == 0 ? c5510ir.e : c5510ir.f;
        int i2 = a.a[c4106dr2.c.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC2745Xg1.i;
        }
        return abstractC2745Xg1.h;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public boolean k() {
        return this.g;
    }

    public final void l(int i, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            this.e.d(g(i2, i));
            return;
        }
        if (i3 == 1) {
            this.e.d(Math.min(g(this.e.m, i), i2));
            return;
        }
        if (i3 == 2) {
            C5510ir c5510irG = this.b.G();
            if (c5510irG != null) {
                if ((i == 0 ? c5510irG.e : c5510irG.f).e.j) {
                    C5510ir c5510ir = this.b;
                    this.e.d(g((int) ((r9.g * (i == 0 ? c5510ir.q : c5510ir.t)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 3) {
            return;
        }
        C5510ir c5510ir2 = this.b;
        AbstractC2745Xg1 abstractC2745Xg1 = c5510ir2.e;
        C5510ir.b bVar = abstractC2745Xg1.d;
        C5510ir.b bVar2 = C5510ir.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && abstractC2745Xg1.a == 3) {
            C0838Fd1 c0838Fd1 = c5510ir2.f;
            if (c0838Fd1.d == bVar2 && c0838Fd1.a == 3) {
                return;
            }
        }
        if (i == 0) {
            abstractC2745Xg1 = c5510ir2.f;
        }
        if (abstractC2745Xg1.e.j) {
            float fT = c5510ir2.t();
            this.e.d(i == 1 ? (int) ((abstractC2745Xg1.e.g / fT) + 0.5f) : (int) ((fT * abstractC2745Xg1.e.g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(InterfaceC6393lz interfaceC6393lz, C4106dr c4106dr, C4106dr c4106dr2, int i) {
        C8066rz c8066rzH = h(c4106dr);
        C8066rz c8066rzH2 = h(c4106dr2);
        if (c8066rzH.j && c8066rzH2.j) {
            int iC = c8066rzH.g + c4106dr.c();
            int iC2 = c8066rzH2.g - c4106dr2.c();
            int i2 = iC2 - iC;
            if (!this.e.j && this.d == C5510ir.b.MATCH_CONSTRAINT) {
                l(i, i2);
            }
            VB vb = this.e;
            if (vb.j) {
                if (vb.g == i2) {
                    this.h.d(iC);
                    this.i.d(iC2);
                    return;
                }
                C5510ir c5510ir = this.b;
                float fW = i == 0 ? c5510ir.w() : c5510ir.K();
                if (c8066rzH == c8066rzH2) {
                    iC = c8066rzH.g;
                    iC2 = c8066rzH2.g;
                    fW = 0.5f;
                }
                this.h.d((int) (iC + 0.5f + (((iC2 - iC) - this.e.g) * fW)));
                this.i.d(this.h.g + this.e.g);
            }
        }
    }

    public void o(InterfaceC6393lz interfaceC6393lz) {
    }

    public void p(InterfaceC6393lz interfaceC6393lz) {
    }
}
