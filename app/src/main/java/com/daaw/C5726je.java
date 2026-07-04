package com.daaw;

import com.daaw.C5510ir;

/* JADX INFO: renamed from: com.daaw.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5726je extends OV {
    public int y0 = 0;
    public boolean z0 = true;
    public int A0 = 0;

    public boolean K0() {
        return this.z0;
    }

    public int L0() {
        return this.y0;
    }

    public int M0() {
        return this.A0;
    }

    public void N0() {
        for (int i = 0; i < this.x0; i++) {
            C5510ir c5510ir = this.w0[i];
            int i2 = this.y0;
            if (i2 == 0 || i2 == 1) {
                c5510ir.o0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                c5510ir.o0(1, true);
            }
        }
    }

    public void O0(boolean z) {
        this.z0 = z;
    }

    public void P0(int i) {
        this.y0 = i;
    }

    public void Q0(int i) {
        this.A0 = i;
    }

    @Override // com.daaw.C5510ir
    public void f(C4311ec0 c4311ec0) {
        C4106dr[] c4106drArr;
        boolean z;
        int i;
        int i2;
        int i3;
        C4106dr[] c4106drArr2 = this.J;
        c4106drArr2[0] = this.B;
        c4106drArr2[2] = this.C;
        c4106drArr2[1] = this.D;
        c4106drArr2[3] = this.E;
        int i4 = 0;
        while (true) {
            c4106drArr = this.J;
            if (i4 >= c4106drArr.length) {
                break;
            }
            C4106dr c4106dr = c4106drArr[i4];
            c4106dr.g = c4311ec0.q(c4106dr);
            i4++;
        }
        int i5 = this.y0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C4106dr c4106dr2 = c4106drArr[i5];
        for (int i6 = 0; i6 < this.x0; i6++) {
            C5510ir c5510ir = this.w0[i6];
            if ((this.z0 || c5510ir.g()) && ((((i2 = this.y0) == 0 || i2 == 1) && c5510ir.y() == C5510ir.b.MATCH_CONSTRAINT && c5510ir.B.d != null && c5510ir.D.d != null) || (((i3 = this.y0) == 2 || i3 == 3) && c5510ir.M() == C5510ir.b.MATCH_CONSTRAINT && c5510ir.C.d != null && c5510ir.E.d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = this.B.i() || this.D.i();
        boolean z3 = this.C.i() || this.E.i();
        int i7 = !(!z && (((i = this.y0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))))) ? 4 : 5;
        for (int i8 = 0; i8 < this.x0; i8++) {
            C5510ir c5510ir2 = this.w0[i8];
            if (this.z0 || c5510ir2.g()) {
                IU0 iu0Q = c4311ec0.q(c5510ir2.J[this.y0]);
                C4106dr[] c4106drArr3 = c5510ir2.J;
                int i9 = this.y0;
                C4106dr c4106dr3 = c4106drArr3[i9];
                c4106dr3.g = iu0Q;
                C4106dr c4106dr4 = c4106dr3.d;
                int i10 = (c4106dr4 == null || c4106dr4.b != this) ? 0 : c4106dr3.e;
                if (i9 == 0 || i9 == 2) {
                    c4311ec0.i(c4106dr2.g, iu0Q, this.A0 - i10, z);
                } else {
                    c4311ec0.g(c4106dr2.g, iu0Q, this.A0 + i10, z);
                }
                c4311ec0.e(c4106dr2.g, iu0Q, this.A0 + i10, i7);
            }
        }
        int i11 = this.y0;
        if (i11 == 0) {
            c4311ec0.e(this.D.g, this.B.g, 0, 8);
            c4311ec0.e(this.B.g, this.N.D.g, 0, 4);
            c4311ec0.e(this.B.g, this.N.B.g, 0, 0);
            return;
        }
        if (i11 == 1) {
            c4311ec0.e(this.B.g, this.D.g, 0, 8);
            c4311ec0.e(this.B.g, this.N.B.g, 0, 4);
            c4311ec0.e(this.B.g, this.N.D.g, 0, 0);
        } else if (i11 == 2) {
            c4311ec0.e(this.E.g, this.C.g, 0, 8);
            c4311ec0.e(this.C.g, this.N.E.g, 0, 4);
            c4311ec0.e(this.C.g, this.N.C.g, 0, 0);
        } else if (i11 == 3) {
            c4311ec0.e(this.C.g, this.E.g, 0, 8);
            c4311ec0.e(this.C.g, this.N.C.g, 0, 4);
            c4311ec0.e(this.C.g, this.N.E.g, 0, 0);
        }
    }

    @Override // com.daaw.C5510ir
    public boolean g() {
        return true;
    }

    @Override // com.daaw.C5510ir
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i = 0; i < this.x0; i++) {
            C5510ir c5510ir = this.w0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + c5510ir.r();
        }
        return str + "}";
    }
}
