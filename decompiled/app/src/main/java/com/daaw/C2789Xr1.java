package com.daaw;

/* JADX INFO: renamed from: com.daaw.Xr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2789Xr1 implements InterfaceC6365ls1 {
    public final GD2 a;
    public final C5900kE2 b;
    public final String c;
    public String d;
    public InterfaceC8576to1 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public C2485Ut1 j;
    public int k;
    public long l;

    public C2789Xr1(String str) {
        GD2 gd2 = new GD2(new byte[16], 16);
        this.a = gd2;
        this.b = new C5900kE2(gd2.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void a(C5900kE2 c5900kE2) {
        AbstractC6048km2.b(this.e);
        while (c5900kE2.j() > 0) {
            int i = this.f;
            if (i == 0) {
                while (c5900kE2.j() > 0) {
                    if (this.h) {
                        int iU = c5900kE2.u();
                        this.h = iU == 172;
                        if (iU != 64) {
                            if (iU == 65) {
                                iU = 65;
                            }
                        }
                        this.f = 1;
                        C5900kE2 c5900kE22 = this.b;
                        c5900kE22.i()[0] = -84;
                        c5900kE22.i()[1] = iU == 65 ? (byte) 65 : (byte) 64;
                        this.g = 2;
                    } else {
                        this.h = c5900kE2.u() == 172;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(c5900kE2.j(), this.k - this.g);
                this.e.b(c5900kE2, iMin);
                int i2 = this.g + iMin;
                this.g = i2;
                int i3 = this.k;
                if (i2 == i3) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.e.c(j, 1, i3, 0, null);
                        this.l += this.i;
                    }
                    this.f = 0;
                }
            } else {
                byte[] bArrI = this.b.i();
                int iMin2 = Math.min(c5900kE2.j(), 16 - this.g);
                c5900kE2.c(bArrI, this.g, iMin2);
                int i4 = this.g + iMin2;
                this.g = i4;
                if (i4 == 16) {
                    this.a.j(0);
                    C4367en1 c4367en1A = AbstractC4656fn1.a(this.a);
                    C2485Ut1 c2485Ut1 = this.j;
                    if (c2485Ut1 == null || c2485Ut1.y != 2 || c4367en1A.a != c2485Ut1.z || !"audio/ac4".equals(c2485Ut1.l)) {
                        C1106Hs1 c1106Hs1 = new C1106Hs1();
                        c1106Hs1.j(this.d);
                        c1106Hs1.u("audio/ac4");
                        c1106Hs1.k0(2);
                        c1106Hs1.v(c4367en1A.a);
                        c1106Hs1.m(this.c);
                        C2485Ut1 c2485Ut1D = c1106Hs1.D();
                        this.j = c2485Ut1D;
                        this.e.e(c2485Ut1D);
                    }
                    this.k = c4367en1A.b;
                    this.i = (((long) c4367en1A.c) * 1000000) / ((long) this.j.z);
                    this.b.g(0);
                    this.e.b(this.b, 16);
                    this.f = 2;
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void d(InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        c4118dt1.c();
        this.d = c4118dt1.b();
        this.e = interfaceC1398Kn1.o(c4118dt1.a(), 1);
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void zze() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void b(boolean z) {
    }
}
