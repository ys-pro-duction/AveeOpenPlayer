package com.daaw;

/* JADX INFO: renamed from: com.daaw.us1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8875us1 implements InterfaceC6365ls1 {
    public final C2273Ss1 a;
    public long e;
    public String g;
    public InterfaceC8576to1 h;
    public C8596ts1 i;
    public boolean j;
    public boolean l;
    public final boolean[] f = new boolean[3];
    public final C0369As1 b = new C0369As1(7, 128);
    public final C0369As1 c = new C0369As1(8, 128);
    public final C0369As1 d = new C0369As1(6, 128);
    public long k = -9223372036854775807L;
    public final C5900kE2 m = new C5900kE2();

    public C8875us1(C2273Ss1 c2273Ss1, boolean z, boolean z2) {
        this.a = c2273Ss1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    @Override // com.daaw.InterfaceC6365ls1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.daaw.C5900kE2 r21) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8875us1.a(com.daaw.kE2):void");
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void b(boolean z) {
        AbstractC6048km2.b(this.h);
        int i = AbstractC9004vJ2.a;
        if (z) {
            this.i.a(this.e);
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
        this.l |= (i & 2) != 0;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void d(InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        c4118dt1.c();
        this.g = c4118dt1.b();
        InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(c4118dt1.a(), 2);
        this.h = interfaceC8576to1O;
        this.i = new C8596ts1(interfaceC8576to1O, false, false);
        this.a.b(interfaceC1398Kn1, c4118dt1);
    }

    public final void e(byte[] bArr, int i, int i2) {
        if (!this.j) {
            this.b.a(bArr, i, i2);
            this.c.a(bArr, i, i2);
        }
        this.d.a(bArr, i, i2);
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void zze() {
        this.e = 0L;
        this.l = false;
        this.k = -9223372036854775807L;
        AbstractC4556fR2.f(this.f);
        this.b.b();
        this.c.b();
        this.d.b();
        C8596ts1 c8596ts1 = this.i;
        if (c8596ts1 != null) {
            c8596ts1.d();
        }
    }
}
