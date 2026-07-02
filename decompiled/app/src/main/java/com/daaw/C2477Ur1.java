package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ur1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2477Ur1 implements InterfaceC6365ls1 {
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

    public C2477Ur1(String str) {
        GD2 gd2 = new GD2(new byte[128], 128);
        this.a = gd2;
        this.b = new C5900kE2(gd2.a);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void a(C5900kE2 c5900kE2) {
        AbstractC6048km2.b(this.e);
        while (c5900kE2.j() > 0) {
            int i = this.f;
            if (i == 0) {
                while (true) {
                    if (c5900kE2.j() <= 0) {
                        break;
                    }
                    if (this.h) {
                        int iU = c5900kE2.u();
                        if (iU == 119) {
                            this.h = false;
                            this.f = 1;
                            C5900kE2 c5900kE22 = this.b;
                            c5900kE22.i()[0] = 11;
                            c5900kE22.i()[1] = 119;
                            this.g = 2;
                            break;
                        }
                        this.h = iU == 11;
                    } else {
                        this.h = c5900kE2.u() == 11;
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
                int iMin2 = Math.min(c5900kE2.j(), 128 - this.g);
                c5900kE2.c(bArrI, this.g, iMin2);
                int i4 = this.g + iMin2;
                this.g = i4;
                if (i4 == 128) {
                    this.a.j(0);
                    C3532bn1 c3532bn1E = AbstractC3810cn1.e(this.a);
                    C2485Ut1 c2485Ut1 = this.j;
                    if (c2485Ut1 == null || c3532bn1E.c != c2485Ut1.y || c3532bn1E.b != c2485Ut1.z || !AbstractC9004vJ2.e(c3532bn1E.a, c2485Ut1.l)) {
                        C1106Hs1 c1106Hs1 = new C1106Hs1();
                        c1106Hs1.j(this.d);
                        c1106Hs1.u(c3532bn1E.a);
                        c1106Hs1.k0(c3532bn1E.c);
                        c1106Hs1.v(c3532bn1E.b);
                        c1106Hs1.m(this.c);
                        c1106Hs1.q(c3532bn1E.f);
                        if ("audio/ac3".equals(c3532bn1E.a)) {
                            c1106Hs1.j0(c3532bn1E.f);
                        }
                        C2485Ut1 c2485Ut1D = c1106Hs1.D();
                        this.j = c2485Ut1D;
                        this.e.e(c2485Ut1D);
                    }
                    this.k = c3532bn1E.d;
                    this.i = (((long) c3532bn1E.e) * 1000000) / ((long) this.j.z);
                    this.b.g(0);
                    this.e.b(this.b, 128);
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
