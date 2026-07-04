package com.daaw;

import com.daaw.C4106dr;
import com.daaw.C5510ir;

/* JADX INFO: renamed from: com.daaw.qU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7644qU extends C5510ir {
    public float w0 = -1.0f;
    public int x0 = -1;
    public int y0 = -1;
    public C4106dr z0 = this.C;
    public int A0 = 0;
    public int B0 = 0;

    /* JADX INFO: renamed from: com.daaw.qU$a */
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
                a[C4106dr.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[C4106dr.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[C4106dr.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[C4106dr.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[C4106dr.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[C4106dr.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C7644qU() {
        this.K.clear();
        this.K.add(this.z0);
        int length = this.J.length;
        for (int i = 0; i < length; i++) {
            this.J[i] = this.z0;
        }
    }

    @Override // com.daaw.C5510ir
    public void J0(C4311ec0 c4311ec0) {
        if (G() == null) {
            return;
        }
        int iX = c4311ec0.x(this.z0);
        if (this.A0 == 1) {
            F0(iX);
            G0(0);
            h0(G().v());
            E0(0);
            return;
        }
        F0(0);
        G0(iX);
        E0(G().P());
        h0(0);
    }

    public int K0() {
        return this.A0;
    }

    public int L0() {
        return this.x0;
    }

    public int M0() {
        return this.y0;
    }

    public float N0() {
        return this.w0;
    }

    public void O0(int i) {
        if (i > -1) {
            this.w0 = -1.0f;
            this.x0 = i;
            this.y0 = -1;
        }
    }

    public void P0(int i) {
        if (i > -1) {
            this.w0 = -1.0f;
            this.x0 = -1;
            this.y0 = i;
        }
    }

    public void Q0(float f) {
        if (f > -1.0f) {
            this.w0 = f;
            this.x0 = -1;
            this.y0 = -1;
        }
    }

    public void R0(int i) {
        if (this.A0 == i) {
            return;
        }
        this.A0 = i;
        this.K.clear();
        if (this.A0 == 1) {
            this.z0 = this.B;
        } else {
            this.z0 = this.C;
        }
        this.K.add(this.z0);
        int length = this.J.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.J[i2] = this.z0;
        }
    }

    @Override // com.daaw.C5510ir
    public void f(C4311ec0 c4311ec0) {
        C5791jr c5791jr = (C5791jr) G();
        if (c5791jr == null) {
            return;
        }
        C4106dr c4106drM = c5791jr.m(C4106dr.b.LEFT);
        C4106dr c4106drM2 = c5791jr.m(C4106dr.b.RIGHT);
        C5510ir c5510ir = this.N;
        boolean z = c5510ir != null && c5510ir.M[0] == C5510ir.b.WRAP_CONTENT;
        if (this.A0 == 0) {
            c4106drM = c5791jr.m(C4106dr.b.TOP);
            c4106drM2 = c5791jr.m(C4106dr.b.BOTTOM);
            C5510ir c5510ir2 = this.N;
            z = c5510ir2 != null && c5510ir2.M[1] == C5510ir.b.WRAP_CONTENT;
        }
        if (this.x0 != -1) {
            IU0 iu0Q = c4311ec0.q(this.z0);
            c4311ec0.e(iu0Q, c4311ec0.q(c4106drM), this.x0, 8);
            if (z) {
                c4311ec0.h(c4311ec0.q(c4106drM2), iu0Q, 0, 5);
                return;
            }
            return;
        }
        if (this.y0 == -1) {
            if (this.w0 != -1.0f) {
                c4311ec0.d(C4311ec0.s(c4311ec0, c4311ec0.q(this.z0), c4311ec0.q(c4106drM2), this.w0));
                return;
            }
            return;
        }
        IU0 iu0Q2 = c4311ec0.q(this.z0);
        IU0 iu0Q3 = c4311ec0.q(c4106drM2);
        c4311ec0.e(iu0Q2, iu0Q3, -this.y0, 8);
        if (z) {
            c4311ec0.h(iu0Q2, c4311ec0.q(c4106drM), 0, 5);
            c4311ec0.h(iu0Q3, iu0Q2, 0, 5);
        }
    }

    @Override // com.daaw.C5510ir
    public boolean g() {
        return true;
    }

    @Override // com.daaw.C5510ir
    public C4106dr m(C4106dr.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.A0 == 1) {
                    return this.z0;
                }
                break;
            case 3:
            case 4:
                if (this.A0 == 0) {
                    return this.z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
