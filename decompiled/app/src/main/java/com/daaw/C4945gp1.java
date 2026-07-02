package com.daaw;

/* JADX INFO: renamed from: com.daaw.gp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4945gp1 extends AbstractC4666fp1 {
    public final C5900kE2 b;
    public final C5900kE2 c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public C4945gp1(InterfaceC8576to1 interfaceC8576to1) {
        super(interfaceC8576to1);
        this.b = new C5900kE2(AbstractC4556fR2.a);
        this.c = new C5900kE2(4);
    }

    @Override // com.daaw.AbstractC4666fp1
    public final boolean a(C5900kE2 c5900kE2) throws C4377ep1 {
        int iU = c5900kE2.u();
        int i = iU >> 4;
        int i2 = iU & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        throw new C4377ep1("Video format not supported: " + i2);
    }

    @Override // com.daaw.AbstractC4666fp1
    public final boolean b(C5900kE2 c5900kE2, long j) throws QT1 {
        int iU = c5900kE2.u();
        long jP = c5900kE2.p();
        if (iU == 0) {
            if (!this.e) {
                C5900kE2 c5900kE22 = new C5900kE2(new byte[c5900kE2.j()]);
                c5900kE2.c(c5900kE22.i(), 0, c5900kE2.j());
                C4935gn1 c4935gn1A = C4935gn1.a(c5900kE22);
                this.d = c4935gn1A.b;
                C1106Hs1 c1106Hs1 = new C1106Hs1();
                c1106Hs1.u("video/avc");
                c1106Hs1.l0(c4935gn1A.i);
                c1106Hs1.C(c4935gn1A.c);
                c1106Hs1.h(c4935gn1A.d);
                c1106Hs1.r(c4935gn1A.h);
                c1106Hs1.k(c4935gn1A.a);
                this.a.e(c1106Hs1.D());
                this.e = true;
                return false;
            }
        } else if (iU == 1 && this.e) {
            int i = this.g == 1 ? 1 : 0;
            if (!this.f && i == 0) {
                return false;
            }
            byte[] bArrI = this.c.i();
            bArrI[0] = 0;
            bArrI[1] = 0;
            bArrI[2] = 0;
            int i2 = 4 - this.d;
            int i3 = 0;
            while (c5900kE2.j() > 0) {
                c5900kE2.c(this.c.i(), i2, this.d);
                this.c.g(0);
                C5900kE2 c5900kE23 = this.c;
                C5900kE2 c5900kE24 = this.b;
                int iX = c5900kE23.x();
                c5900kE24.g(0);
                this.a.b(this.b, 4);
                this.a.b(c5900kE2, iX);
                i3 = i3 + 4 + iX;
            }
            this.a.c(j + (jP * 1000), i, i3, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
