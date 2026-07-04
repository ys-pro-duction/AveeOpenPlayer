package com.daaw;

/* JADX INFO: renamed from: com.daaw.dr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4108dr1 {
    public final InterfaceC8576to1 a;
    public C7755qr1 d;
    public C2993Zq1 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final C7476pr1 b = new C7476pr1();
    public final C5900kE2 c = new C5900kE2();
    public final C5900kE2 j = new C5900kE2(1);
    public final C5900kE2 k = new C5900kE2();

    public C4108dr1(InterfaceC8576to1 interfaceC8576to1, C7755qr1 c7755qr1, C2993Zq1 c2993Zq1) {
        this.a = interfaceC8576to1;
        this.d = c7755qr1;
        this.e = c2993Zq1;
        h(c7755qr1, c2993Zq1);
    }

    public final int a() {
        int i = !this.l ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return f() != null ? i | 1073741824 : i;
    }

    public final int b() {
        return !this.l ? this.d.d[this.f] : this.b.h[this.f];
    }

    public final int c(int i, int i2) {
        C5900kE2 c5900kE2;
        C7197or1 c7197or1F = f();
        if (c7197or1F == null) {
            return 0;
        }
        int i3 = c7197or1F.d;
        if (i3 != 0) {
            c5900kE2 = this.b.n;
        } else {
            byte[] bArr = c7197or1F.e;
            int i4 = AbstractC9004vJ2.a;
            C5900kE2 c5900kE22 = this.k;
            int length = bArr.length;
            c5900kE22.e(bArr, length);
            c5900kE2 = this.k;
            i3 = length;
        }
        boolean zB = this.b.b(this.f);
        boolean z = zB || i2 != 0;
        C5900kE2 c5900kE23 = this.j;
        c5900kE23.i()[0] = (byte) ((true != z ? 0 : 128) | i3);
        c5900kE23.g(0);
        this.a.a(this.j, 1, 1);
        this.a.a(c5900kE2, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zB) {
            this.c.d(8);
            C5900kE2 c5900kE24 = this.c;
            byte[] bArrI = c5900kE24.i();
            bArrI[0] = 0;
            bArrI[1] = 1;
            bArrI[2] = 0;
            bArrI[3] = (byte) i2;
            bArrI[4] = (byte) ((i >> 24) & 255);
            bArrI[5] = (byte) ((i >> 16) & 255);
            bArrI[6] = (byte) ((i >> 8) & 255);
            bArrI[7] = (byte) (i & 255);
            this.a.a(c5900kE24, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        C5900kE2 c5900kE25 = this.b.n;
        int iY = c5900kE25.y();
        c5900kE25.h(-2);
        int i6 = (iY * 6) + 2;
        if (i2 != 0) {
            this.c.d(i6);
            byte[] bArrI2 = this.c.i();
            c5900kE25.c(bArrI2, 0, i6);
            int i7 = (((bArrI2[2] & 255) << 8) | (bArrI2[3] & 255)) + i2;
            bArrI2[2] = (byte) ((i7 >> 8) & 255);
            bArrI2[3] = (byte) (i7 & 255);
            c5900kE25 = this.c;
        }
        this.a.a(c5900kE25, i6, 1);
        return i5 + i6;
    }

    public final long d() {
        return !this.l ? this.d.c[this.f] : this.b.f[this.h];
    }

    public final long e() {
        if (!this.l) {
            return this.d.f[this.f];
        }
        C7476pr1 c7476pr1 = this.b;
        return c7476pr1.i[this.f];
    }

    public final C7197or1 f() {
        if (!this.l) {
            return null;
        }
        C7476pr1 c7476pr1 = this.b;
        C2993Zq1 c2993Zq1 = c7476pr1.a;
        int i = AbstractC9004vJ2.a;
        int i2 = c2993Zq1.a;
        C7197or1 c7197or1A = c7476pr1.m;
        if (c7197or1A == null) {
            c7197or1A = this.d.a.a(i2);
        }
        if (c7197or1A == null || !c7197or1A.a) {
            return null;
        }
        return c7197or1A;
    }

    public final void h(C7755qr1 c7755qr1, C2993Zq1 c2993Zq1) {
        this.d = c7755qr1;
        this.e = c2993Zq1;
        this.a.e(c7755qr1.a.f);
        i();
    }

    public final void i() {
        C7476pr1 c7476pr1 = this.b;
        c7476pr1.d = 0;
        c7476pr1.p = 0L;
        c7476pr1.q = false;
        c7476pr1.k = false;
        c7476pr1.o = false;
        c7476pr1.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }

    public final boolean k() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }
}
