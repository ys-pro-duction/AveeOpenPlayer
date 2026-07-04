package com.daaw;

/* JADX INFO: renamed from: com.daaw.ws1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9440ws1 implements InterfaceC6365ls1 {
    public final C2273Ss1 a;
    public String b;
    public InterfaceC8576to1 c;
    public C9161vs1 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final C0369As1 g = new C0369As1(32, 128);
    public final C0369As1 h = new C0369As1(33, 128);
    public final C0369As1 i = new C0369As1(34, 128);
    public final C0369As1 j = new C0369As1(39, 128);
    public final C0369As1 k = new C0369As1(40, 128);
    public long m = -9223372036854775807L;
    public final C5900kE2 n = new C5900kE2();

    public C9440ws1(C2273Ss1 c2273Ss1) {
        this.a = c2273Ss1;
    }

    private final void e(byte[] bArr, int i, int i2) {
        this.d.c(bArr, i, i2);
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
    @Override // com.daaw.InterfaceC6365ls1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.daaw.C5900kE2 r30) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9440ws1.a(com.daaw.kE2):void");
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void b(boolean z) {
        AbstractC6048km2.b(this.c);
        int i = AbstractC9004vJ2.a;
        if (z) {
            this.d.a(this.l);
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void d(InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        c4118dt1.c();
        this.b = c4118dt1.b();
        InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(c4118dt1.a(), 2);
        this.c = interfaceC8576to1O;
        this.d = new C9161vs1(interfaceC8576to1O);
        this.a.b(interfaceC1398Kn1, c4118dt1);
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void zze() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        AbstractC4556fR2.f(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        C9161vs1 c9161vs1 = this.d;
        if (c9161vs1 != null) {
            c9161vs1.d();
        }
    }
}
