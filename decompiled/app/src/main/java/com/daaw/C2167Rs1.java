package com.daaw;

/* JADX INFO: renamed from: com.daaw.Rs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2167Rs1 implements InterfaceC4397et1 {
    public final InterfaceC2063Qs1 a;
    public final C5900kE2 b = new C5900kE2(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public C2167Rs1(InterfaceC2063Qs1 interfaceC2063Qs1) {
        this.a = interfaceC2063Qs1;
    }

    @Override // com.daaw.InterfaceC4397et1
    public final void a(C5900kE2 c5900kE2, int i) {
        int i2 = i & 1;
        int iL = i2 != 0 ? c5900kE2.l() + c5900kE2.u() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            c5900kE2.g(iL);
            this.d = 0;
        }
        while (c5900kE2.j() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iU = c5900kE2.u();
                    c5900kE2.g(c5900kE2.l() - 1);
                    if (iU == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(c5900kE2.j(), 3 - this.d);
                c5900kE2.c(this.b.i(), this.d, iMin);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    this.b.g(0);
                    this.b.f(3);
                    this.b.h(1);
                    C5900kE2 c5900kE22 = this.b;
                    int iU2 = c5900kE22.u();
                    boolean z = (iU2 & 128) != 0;
                    int iU3 = c5900kE22.u();
                    this.e = z;
                    this.c = (iU3 | ((iU2 & 15) << 8)) + 3;
                    int iK = this.b.k();
                    int i5 = this.c;
                    if (iK < i5) {
                        int iK2 = this.b.k();
                        this.b.a(Math.min(4098, Math.max(i5, iK2 + iK2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c5900kE2.j(), this.c - i3);
                c5900kE2.c(this.b.i(), this.d, iMin2);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.f(i7);
                    } else {
                        if (AbstractC9004vJ2.p(this.b.i(), 0, i7, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.f(this.c - 4);
                    }
                    this.b.g(0);
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC4397et1
    public final void b(C5916kI2 c5916kI2, InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        this.a.b(c5916kI2, interfaceC1398Kn1, c4118dt1);
        this.f = true;
    }

    @Override // com.daaw.InterfaceC4397et1
    public final void zzc() {
        this.f = true;
    }
}
