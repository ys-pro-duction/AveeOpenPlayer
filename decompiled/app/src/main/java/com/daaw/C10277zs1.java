package com.daaw;

/* JADX INFO: renamed from: com.daaw.zs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10277zs1 implements InterfaceC6365ls1 {
    public final C5900kE2 a;
    public final C5219ho1 b;
    public final String c;
    public InterfaceC8576to1 d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public C10277zs1(String str) {
        C5900kE2 c5900kE2 = new C5900kE2(4);
        this.a = c5900kE2;
        c5900kE2.i()[0] = -1;
        this.b = new C5219ho1();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void a(C5900kE2 c5900kE2) {
        AbstractC6048km2.b(this.d);
        while (c5900kE2.j() > 0) {
            int i = this.f;
            if (i == 0) {
                byte[] bArrI = c5900kE2.i();
                int iL = c5900kE2.l();
                int iM = c5900kE2.m();
                while (true) {
                    if (iL >= iM) {
                        c5900kE2.g(iM);
                        break;
                    }
                    int i2 = iL + 1;
                    byte b = bArrI[iL];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        c5900kE2.g(i2);
                        this.i = false;
                        this.a.i()[1] = bArrI[iL];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    iL = i2;
                }
            } else if (i != 1) {
                int iMin = Math.min(c5900kE2.j(), this.k - this.g);
                this.d.b(c5900kE2, iMin);
                int i3 = this.g + iMin;
                this.g = i3;
                int i4 = this.k;
                if (i3 >= i4) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.d.c(j, 1, i4, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                int iMin2 = Math.min(c5900kE2.j(), 4 - this.g);
                c5900kE2.c(this.a.i(), this.g, iMin2);
                int i5 = this.g + iMin2;
                this.g = i5;
                if (i5 >= 4) {
                    this.a.g(0);
                    if (this.b.a(this.a.o())) {
                        C5219ho1 c5219ho1 = this.b;
                        this.k = c5219ho1.c;
                        if (!this.h) {
                            this.j = (((long) c5219ho1.g) * 1000000) / ((long) c5219ho1.d);
                            C1106Hs1 c1106Hs1 = new C1106Hs1();
                            c1106Hs1.j(this.e);
                            c1106Hs1.u(this.b.b);
                            c1106Hs1.n(4096);
                            c1106Hs1.k0(this.b.e);
                            c1106Hs1.v(this.b.d);
                            c1106Hs1.m(this.c);
                            this.d.e(c1106Hs1.D());
                            this.h = true;
                        }
                        this.a.g(0);
                        this.d.b(this.a, 4);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
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
        this.e = c4118dt1.b();
        this.d = interfaceC1398Kn1.o(c4118dt1.a(), 1);
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void zze() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void b(boolean z) {
    }
}
