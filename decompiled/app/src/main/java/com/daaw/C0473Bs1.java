package com.daaw;

/* JADX INFO: renamed from: com.daaw.Bs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0473Bs1 implements InterfaceC2063Qs1 {
    public C2485Ut1 a;
    public C5916kI2 b;
    public InterfaceC8576to1 c;

    public C0473Bs1(String str) {
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.u(str);
        this.a = c1106Hs1.D();
    }

    @Override // com.daaw.InterfaceC2063Qs1
    public final void a(C5900kE2 c5900kE2) {
        AbstractC6048km2.b(this.b);
        int i = AbstractC9004vJ2.a;
        long jD = this.b.d();
        long jE = this.b.e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        C2485Ut1 c2485Ut1 = this.a;
        if (jE != c2485Ut1.p) {
            C1106Hs1 c1106Hs1B = c2485Ut1.b();
            c1106Hs1B.y(jE);
            C2485Ut1 c2485Ut1D = c1106Hs1B.D();
            this.a = c2485Ut1D;
            this.c.e(c2485Ut1D);
        }
        int iJ = c5900kE2.j();
        this.c.b(c5900kE2, iJ);
        this.c.c(jD, 1, iJ, 0, null);
    }

    @Override // com.daaw.InterfaceC2063Qs1
    public final void b(C5916kI2 c5916kI2, InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        this.b = c5916kI2;
        c4118dt1.c();
        InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(c4118dt1.a(), 5);
        this.c = interfaceC8576to1O;
        interfaceC8576to1O.e(this.a);
    }
}
