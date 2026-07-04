package com.daaw;

import com.daaw.InterfaceC8103s61;

/* JADX INFO: renamed from: com.daaw.vO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9022vO0 implements InterfaceC8103s61 {
    public final InterfaceC8736uO0 a;
    public final C2584Vs0 b = new C2584Vs0(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public C9022vO0(InterfaceC8736uO0 interfaceC8736uO0) {
        this.a = interfaceC8736uO0;
    }

    @Override // com.daaw.InterfaceC8103s61
    public void a(C2584Vs0 c2584Vs0, boolean z) {
        int iC = z ? c2584Vs0.c() + c2584Vs0.x() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            c2584Vs0.J(iC);
            this.d = 0;
        }
        while (c2584Vs0.a() > 0) {
            int i = this.d;
            if (i < 3) {
                if (i == 0) {
                    int iX = c2584Vs0.x();
                    c2584Vs0.J(c2584Vs0.c() - 1);
                    if (iX == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(c2584Vs0.a(), 3 - this.d);
                c2584Vs0.g(this.b.a, this.d, iMin);
                int i2 = this.d + iMin;
                this.d = i2;
                if (i2 == 3) {
                    this.b.G(3);
                    this.b.K(1);
                    int iX2 = this.b.x();
                    int iX3 = this.b.x();
                    this.e = (iX2 & 128) != 0;
                    this.c = (((iX2 & 15) << 8) | iX3) + 3;
                    int iB = this.b.b();
                    int i3 = this.c;
                    if (iB < i3) {
                        C2584Vs0 c2584Vs02 = this.b;
                        byte[] bArr = c2584Vs02.a;
                        c2584Vs02.G(Math.min(4098, Math.max(i3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.b.a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(c2584Vs0.a(), this.c - this.d);
                c2584Vs0.g(this.b.a, this.d, iMin2);
                int i4 = this.d + iMin2;
                this.d = i4;
                int i5 = this.c;
                if (i4 != i5) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.G(i5);
                    } else {
                        if (AbstractC6280lb1.n(this.b.a, 0, i5, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.G(this.c - 4);
                    }
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC8103s61
    public void b() {
        this.f = true;
    }

    @Override // com.daaw.InterfaceC8103s61
    public void c(R31 r31, InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        this.a.c(r31, interfaceC9838yJ, dVar);
        this.f = true;
    }
}
