package com.daaw;

import com.google.android.gms.internal.ads.zzby;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Pr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1933Pr1 extends AbstractC1725Nr1 {
    public C1829Or1 n;
    public int o;
    public boolean p;
    public C9978yo1 q;
    public C9420wo1 r;

    @Override // com.daaw.AbstractC1725Nr1
    public final long a(C5900kE2 c5900kE2) {
        if ((c5900kE2.i()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c5900kE2.i()[0];
        C1829Or1 c1829Or1 = this.n;
        AbstractC6048km2.b(c1829Or1);
        int i = !c1829Or1.d[(b >> 1) & (255 >>> (8 - c1829Or1.e))].a ? c1829Or1.a.e : c1829Or1.a.f;
        int i2 = this.p ? (this.o + i) / 4 : 0;
        if (c5900kE2.k() < c5900kE2.m() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(c5900kE2.i(), c5900kE2.m() + 4);
            c5900kE2.e(bArrCopyOf, bArrCopyOf.length);
        } else {
            c5900kE2.f(c5900kE2.m() + 4);
        }
        long j = i2;
        byte[] bArrI = c5900kE2.i();
        bArrI[c5900kE2.m() - 4] = (byte) (j & 255);
        bArrI[c5900kE2.m() - 3] = (byte) ((j >>> 8) & 255);
        bArrI[c5900kE2.m() - 2] = (byte) ((j >>> 16) & 255);
        bArrI[c5900kE2.m() - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // com.daaw.AbstractC1725Nr1
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @Override // com.daaw.AbstractC1725Nr1
    public final boolean c(C5900kE2 c5900kE2, long j, C1414Kr1 c1414Kr1) throws QT1 {
        C1829Or1 c1829Or1;
        int i;
        int iB;
        int i2;
        int[] iArr;
        if (this.n != null) {
            c1414Kr1.a.getClass();
            return false;
        }
        C9978yo1 c9978yo1 = this.q;
        int i3 = 1;
        if (c9978yo1 == null) {
            AbstractC10257zo1.d(1, c5900kE2, false);
            int iR = c5900kE2.r();
            int iU = c5900kE2.u();
            int iR2 = c5900kE2.r();
            int iQ = c5900kE2.q();
            int i4 = iQ <= 0 ? -1 : iQ;
            int iQ2 = c5900kE2.q();
            int i5 = iQ2 <= 0 ? -1 : iQ2;
            int iQ3 = c5900kE2.q();
            int i6 = iQ3 <= 0 ? -1 : iQ3;
            int iU2 = c5900kE2.u();
            this.q = new C9978yo1(iR, iU, iR2, i4, i5, i6, (int) Math.pow(2.0d, iU2 & 15), (int) Math.pow(2.0d, (iU2 & 240) >> 4), 1 == (c5900kE2.u() & 1), Arrays.copyOf(c5900kE2.i(), c5900kE2.m()));
        } else {
            C9420wo1 c9420wo1 = this.r;
            if (c9420wo1 == null) {
                this.r = AbstractC10257zo1.c(c5900kE2, true, true);
            } else {
                byte[] bArr = new byte[c5900kE2.m()];
                System.arraycopy(c5900kE2.i(), 0, bArr, 0, c5900kE2.m());
                int i7 = c9978yo1.a;
                int i8 = 5;
                AbstractC10257zo1.d(5, c5900kE2, false);
                int iU3 = c5900kE2.u() + 1;
                C9141vo1 c9141vo1 = new C9141vo1(c5900kE2.i());
                c9141vo1.c(c5900kE2.l() * 8);
                int i9 = 0;
                while (true) {
                    int i10 = 2;
                    int i11 = 16;
                    if (i9 >= iU3) {
                        int i12 = 1;
                        int i13 = 6;
                        int iB2 = c9141vo1.b(6) + 1;
                        for (int i14 = 0; i14 < iB2; i14++) {
                            if (c9141vo1.b(16) != 0) {
                                throw QT1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iB3 = c9141vo1.b(6) + 1;
                        int i15 = 0;
                        while (true) {
                            int i16 = 3;
                            if (i15 < iB3) {
                                int iB4 = c9141vo1.b(i11);
                                if (iB4 == 0) {
                                    int i17 = 8;
                                    c9141vo1.c(8);
                                    c9141vo1.c(16);
                                    c9141vo1.c(16);
                                    c9141vo1.c(6);
                                    c9141vo1.c(8);
                                    int iB5 = c9141vo1.b(4) + 1;
                                    int i18 = 0;
                                    while (i18 < iB5) {
                                        c9141vo1.c(i17);
                                        i18++;
                                        i17 = 8;
                                    }
                                } else {
                                    if (iB4 != i12) {
                                        throw QT1.a("floor type greater than 1 not decodable: " + iB4, null);
                                    }
                                    int iB6 = c9141vo1.b(5);
                                    int[] iArr2 = new int[iB6];
                                    int i19 = -1;
                                    for (int i20 = 0; i20 < iB6; i20++) {
                                        int iB7 = c9141vo1.b(4);
                                        iArr2[i20] = iB7;
                                        if (iB7 > i19) {
                                            i19 = iB7;
                                        }
                                    }
                                    int i21 = i19 + 1;
                                    int[] iArr3 = new int[i21];
                                    int i22 = 0;
                                    while (i22 < i21) {
                                        int i23 = 1;
                                        iArr3[i22] = c9141vo1.b(i16) + 1;
                                        int iB8 = c9141vo1.b(2);
                                        if (iB8 > 0) {
                                            i2 = 8;
                                            c9141vo1.c(8);
                                        } else {
                                            i2 = 8;
                                        }
                                        int i24 = i21;
                                        int i25 = 0;
                                        while (true) {
                                            int i26 = i23 << iB8;
                                            iArr = iArr2;
                                            if (i25 < i26) {
                                                c9141vo1.c(i2);
                                                i25++;
                                                iArr2 = iArr;
                                                i2 = 8;
                                                i23 = 1;
                                            }
                                        }
                                        i22++;
                                        iArr2 = iArr;
                                        i21 = i24;
                                        i16 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    c9141vo1.c(2);
                                    int iB9 = c9141vo1.b(4);
                                    int i27 = 0;
                                    int i28 = 0;
                                    for (int i29 = 0; i29 < iB6; i29++) {
                                        i27 += iArr3[iArr4[i29]];
                                        while (i28 < i27) {
                                            c9141vo1.c(iB9);
                                            i28++;
                                        }
                                    }
                                }
                                i15++;
                                i13 = 6;
                                i11 = 16;
                                i12 = 1;
                            } else {
                                int i30 = 1;
                                int iB10 = c9141vo1.b(i13) + 1;
                                int i31 = 0;
                                while (i31 < iB10) {
                                    if (c9141vo1.b(16) > 2) {
                                        throw QT1.a("residueType greater than 2 is not decodable", null);
                                    }
                                    c9141vo1.c(24);
                                    c9141vo1.c(24);
                                    c9141vo1.c(24);
                                    int iB11 = c9141vo1.b(i13) + i30;
                                    int i32 = 8;
                                    c9141vo1.c(8);
                                    int[] iArr5 = new int[iB11];
                                    for (int i33 = 0; i33 < iB11; i33++) {
                                        iArr5[i33] = ((c9141vo1.d() ? c9141vo1.b(5) : 0) * 8) + c9141vo1.b(3);
                                    }
                                    int i34 = 0;
                                    while (i34 < iB11) {
                                        int i35 = 0;
                                        while (i35 < i32) {
                                            if ((iArr5[i34] & (1 << i35)) != 0) {
                                                c9141vo1.c(i32);
                                            }
                                            i35++;
                                            i32 = 8;
                                        }
                                        i34++;
                                        i32 = 8;
                                    }
                                    i31++;
                                    i13 = 6;
                                    i30 = 1;
                                }
                                int iB12 = c9141vo1.b(i13) + 1;
                                for (int i36 = 0; i36 < iB12; i36++) {
                                    int iB13 = c9141vo1.b(16);
                                    if (iB13 != 0) {
                                        AbstractC3305ay2.c("VorbisUtil", "mapping type other than 0 not supported: " + iB13);
                                    } else {
                                        if (c9141vo1.d()) {
                                            i = 1;
                                            iB = c9141vo1.b(4) + 1;
                                        } else {
                                            i = 1;
                                            iB = 1;
                                        }
                                        if (c9141vo1.d()) {
                                            int iB14 = c9141vo1.b(8) + i;
                                            for (int i37 = 0; i37 < iB14; i37++) {
                                                int i38 = i7 - 1;
                                                c9141vo1.c(AbstractC10257zo1.a(i38));
                                                c9141vo1.c(AbstractC10257zo1.a(i38));
                                            }
                                        }
                                        if (c9141vo1.b(2) != 0) {
                                            throw QT1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iB > 1) {
                                            for (int i39 = 0; i39 < i7; i39++) {
                                                c9141vo1.c(4);
                                            }
                                        }
                                        for (int i40 = 0; i40 < iB; i40++) {
                                            c9141vo1.c(8);
                                            c9141vo1.c(8);
                                            c9141vo1.c(8);
                                        }
                                    }
                                }
                                int iB15 = c9141vo1.b(6);
                                int i41 = iB15 + 1;
                                C9699xo1[] c9699xo1Arr = new C9699xo1[i41];
                                for (int i42 = 0; i42 < i41; i42++) {
                                    c9699xo1Arr[i42] = new C9699xo1(c9141vo1.d(), c9141vo1.b(16), c9141vo1.b(16), c9141vo1.b(8));
                                }
                                if (!c9141vo1.d()) {
                                    throw QT1.a("framing bit after modes not set as expected", null);
                                }
                                c1829Or1 = new C1829Or1(c9978yo1, c9420wo1, bArr, c9699xo1Arr, AbstractC10257zo1.a(iB15));
                            }
                        }
                    } else {
                        if (c9141vo1.b(24) != 5653314) {
                            throw QT1.a("expected code book to start with [0x56, 0x43, 0x42] at " + c9141vo1.a(), null);
                        }
                        int iB16 = c9141vo1.b(16);
                        int iB17 = c9141vo1.b(24);
                        if (c9141vo1.d()) {
                            c9141vo1.c(i8);
                            for (int iB18 = 0; iB18 < iB17; iB18 += c9141vo1.b(AbstractC10257zo1.a(iB17 - iB18))) {
                            }
                        } else {
                            boolean zD = c9141vo1.d();
                            for (int i43 = 0; i43 < iB17; i43++) {
                                if (!zD) {
                                    c9141vo1.c(i8);
                                } else if (c9141vo1.d()) {
                                    c9141vo1.c(i8);
                                }
                            }
                        }
                        int iB19 = c9141vo1.b(4);
                        if (iB19 > 2) {
                            throw QT1.a("lookup type greater than 2 not decodable: " + iB19, null);
                        }
                        if (iB19 != i3) {
                            if (iB19 == 2) {
                            }
                            i9++;
                            i8 = 5;
                            i3 = 1;
                        } else {
                            i10 = iB19;
                        }
                        c9141vo1.c(32);
                        c9141vo1.c(32);
                        int iB20 = c9141vo1.b(4) + i3;
                        c9141vo1.c(i3);
                        c9141vo1.c((int) ((i10 == i3 ? iB16 != 0 ? (long) Math.floor(Math.pow(iB17, 1.0d / ((double) iB16))) : 0L : ((long) iB16) * ((long) iB17)) * ((long) iB20)));
                        i9++;
                        i8 = 5;
                        i3 = 1;
                    }
                }
            }
        }
        c1829Or1 = null;
        this.n = c1829Or1;
        if (c1829Or1 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C9978yo1 c9978yo12 = c1829Or1.a;
        arrayList.add(c9978yo12.g);
        arrayList.add(c1829Or1.c);
        zzby zzbyVarB = AbstractC10257zo1.b(OP2.I(c1829Or1.b.b));
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.u("audio/vorbis");
        c1106Hs1.j0(c9978yo12.d);
        c1106Hs1.q(c9978yo12.c);
        c1106Hs1.k0(c9978yo12.a);
        c1106Hs1.v(c9978yo12.b);
        c1106Hs1.k(arrayList);
        c1106Hs1.o(zzbyVarB);
        c1414Kr1.a = c1106Hs1.D();
        return true;
    }

    @Override // com.daaw.AbstractC1725Nr1
    public final void h(long j) {
        super.h(j);
        this.p = j != 0;
        C9978yo1 c9978yo1 = this.q;
        this.o = c9978yo1 != null ? c9978yo1.e : 0;
    }
}
