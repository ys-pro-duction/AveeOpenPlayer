package com.daaw;

/* JADX INFO: renamed from: com.daaw.kt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6091kt1 implements InterfaceC5803jt1 {
    public final InterfaceC1398Kn1 a;
    public final InterfaceC8576to1 b;
    public final C6649mt1 c;
    public final C2485Ut1 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public C6091kt1(InterfaceC1398Kn1 interfaceC1398Kn1, InterfaceC8576to1 interfaceC8576to1, C6649mt1 c6649mt1, String str, int i) throws QT1 {
        this.a = interfaceC1398Kn1;
        this.b = interfaceC8576to1;
        this.c = c6649mt1;
        int i2 = c6649mt1.b * c6649mt1.e;
        int i3 = c6649mt1.d;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw QT1.a("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = c6649mt1.c * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.e = iMax;
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.u(str);
        c1106Hs1.j0(i6);
        c1106Hs1.q(i6);
        c1106Hs1.n(iMax);
        c1106Hs1.k0(c6649mt1.b);
        c1106Hs1.v(c6649mt1.c);
        c1106Hs1.p(i);
        this.d = c1106Hs1.D();
    }

    @Override // com.daaw.InterfaceC5803jt1
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // com.daaw.InterfaceC5803jt1
    public final void b(int i, long j) {
        this.a.p(new C9166vt1(this.c, 1, i, j));
        this.b.e(this.d);
    }

    @Override // com.daaw.InterfaceC5803jt1
    public final boolean c(InterfaceC1190In1 interfaceC1190In1, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iA = AbstractC8018ro1.a(this.b, interfaceC1190In1, (int) Math.min(i2 - i, j2), true);
            if (iA == -1) {
                j2 = 0;
            } else {
                this.g += iA;
                j2 -= (long) iA;
            }
        }
        C6649mt1 c6649mt1 = this.c;
        int i3 = this.g;
        int i4 = c6649mt1.d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jD = this.f + AbstractC9004vJ2.D(this.h, 1000000L, c6649mt1.c);
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.c(jD, 1, i6, i7, null);
            this.h += (long) i5;
            this.g = i7;
        }
        return j2 <= 0;
    }
}
