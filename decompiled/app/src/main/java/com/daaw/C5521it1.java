package com.daaw;

/* JADX INFO: renamed from: com.daaw.it1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5521it1 implements InterfaceC5803jt1 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final InterfaceC1398Kn1 a;
    public final InterfaceC8576to1 b;
    public final C6649mt1 c;
    public final int d;
    public final byte[] e;
    public final C5900kE2 f;
    public final int g;
    public final C2485Ut1 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public C5521it1(InterfaceC1398Kn1 interfaceC1398Kn1, InterfaceC8576to1 interfaceC8576to1, C6649mt1 c6649mt1) throws QT1 {
        this.a = interfaceC1398Kn1;
        this.b = interfaceC8576to1;
        this.c = c6649mt1;
        int iMax = Math.max(1, c6649mt1.c / 10);
        this.g = iMax;
        C5900kE2 c5900kE2 = new C5900kE2(c6649mt1.f);
        c5900kE2.s();
        int iS = c5900kE2.s();
        this.d = iS;
        int i = c6649mt1.b;
        int i2 = c6649mt1.d;
        int i3 = (((i2 - (i * 4)) * 8) / (c6649mt1.e * i)) + 1;
        if (iS != i3) {
            throw QT1.a("Expected frames per block: " + i3 + "; got: " + iS, null);
        }
        int i4 = AbstractC9004vJ2.a;
        int i5 = ((iMax + iS) - 1) / iS;
        this.e = new byte[i2 * i5];
        this.f = new C5900kE2(i5 * (iS + iS) * i);
        int i6 = ((c6649mt1.c * c6649mt1.d) * 8) / iS;
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.u("audio/raw");
        c1106Hs1.j0(i6);
        c1106Hs1.q(i6);
        c1106Hs1.n((iMax + iMax) * i);
        c1106Hs1.k0(c6649mt1.b);
        c1106Hs1.v(c6649mt1.c);
        c1106Hs1.p(2);
        this.h = c1106Hs1.D();
    }

    @Override // com.daaw.InterfaceC5803jt1
    public final void a(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    @Override // com.daaw.InterfaceC5803jt1
    public final void b(int i, long j) {
        this.a.p(new C9166vt1(this.c, this.d, i, j));
        this.b.e(this.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:4:0x0022). Please report as a decompilation issue!!! */
    @Override // com.daaw.InterfaceC5803jt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.daaw.InterfaceC1190In1 r21, long r22) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5521it1.c(com.daaw.In1, long):boolean");
    }

    public final int d(int i) {
        int i2 = this.c.b;
        return i / (i2 + i2);
    }

    public final int e(int i) {
        return (i + i) * this.c.b;
    }

    public final void f(int i) {
        long jD = this.j + AbstractC9004vJ2.D(this.l, 1000000L, this.c.c);
        int iE = e(i);
        this.b.c(jD, 1, iE, this.k - iE, null);
        this.l += (long) i;
        this.k -= iE;
    }
}
