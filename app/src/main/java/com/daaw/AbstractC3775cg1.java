package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.cg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3775cg1 {

    /* JADX INFO: renamed from: com.daaw.cg1$a */
    public static final class a {
        public final int a;
        public final int b;
        public final long[] c;
        public final int d;
        public final boolean e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = jArr;
            this.d = i3;
            this.e = z;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cg1$b */
    public static final class b {
        public final String a;
        public final String[] b;
        public final int c;

        public b(String str, String[] strArr, int i) {
            this.a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cg1$c */
    public static final class c {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public c(boolean z, int i, int i2, int i3) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cg1$d */
    public static final class d {
        public final long a;
        public final int b;
        public final long c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.a = j;
            this.b = i;
            this.c = j2;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = i6;
            this.i = z;
            this.j = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static long b(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    public static a c(C3218ag1 c3218ag1) throws C3000Zs0 {
        if (c3218ag1.d(24) != 5653314) {
            throw new C3000Zs0("expected code book to start with [0x56, 0x43, 0x42] at " + c3218ag1.b());
        }
        int iD = c3218ag1.d(16);
        int iD2 = c3218ag1.d(24);
        long[] jArr = new long[iD2];
        boolean zC = c3218ag1.c();
        long jB = 0;
        if (zC) {
            int iD3 = c3218ag1.d(5) + 1;
            int i = 0;
            while (i < iD2) {
                int iD4 = c3218ag1.d(a(iD2 - i));
                for (int i2 = 0; i2 < iD4 && i < iD2; i2++) {
                    jArr[i] = iD3;
                    i++;
                }
                iD3++;
            }
        } else {
            boolean zC2 = c3218ag1.c();
            for (int i3 = 0; i3 < iD2; i3++) {
                if (!zC2) {
                    jArr[i3] = c3218ag1.d(5) + 1;
                } else if (c3218ag1.c()) {
                    jArr[i3] = c3218ag1.d(5) + 1;
                } else {
                    jArr[i3] = 0;
                }
            }
        }
        int iD5 = c3218ag1.d(4);
        if (iD5 > 2) {
            throw new C3000Zs0("lookup type greater than 2 not decodable: " + iD5);
        }
        if (iD5 == 1 || iD5 == 2) {
            c3218ag1.e(32);
            c3218ag1.e(32);
            int iD6 = c3218ag1.d(4) + 1;
            c3218ag1.e(1);
            if (iD5 != 1) {
                jB = ((long) iD2) * ((long) iD);
            } else if (iD != 0) {
                jB = b(iD2, iD);
            }
            c3218ag1.e((int) (jB * ((long) iD6)));
        }
        return new a(iD, iD2, jArr, iD5, zC);
    }

    public static void d(C3218ag1 c3218ag1) throws C3000Zs0 {
        int iD = c3218ag1.d(6) + 1;
        for (int i = 0; i < iD; i++) {
            int iD2 = c3218ag1.d(16);
            if (iD2 == 0) {
                c3218ag1.e(8);
                c3218ag1.e(16);
                c3218ag1.e(16);
                c3218ag1.e(6);
                c3218ag1.e(8);
                int iD3 = c3218ag1.d(4) + 1;
                for (int i2 = 0; i2 < iD3; i2++) {
                    c3218ag1.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw new C3000Zs0("floor type greater than 1 not decodable: " + iD2);
                }
                int iD4 = c3218ag1.d(5);
                int[] iArr = new int[iD4];
                int i3 = -1;
                for (int i4 = 0; i4 < iD4; i4++) {
                    int iD5 = c3218ag1.d(4);
                    iArr[i4] = iD5;
                    if (iD5 > i3) {
                        i3 = iD5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = c3218ag1.d(3) + 1;
                    int iD6 = c3218ag1.d(2);
                    if (iD6 > 0) {
                        c3218ag1.e(8);
                    }
                    for (int i7 = 0; i7 < (1 << iD6); i7++) {
                        c3218ag1.e(8);
                    }
                }
                c3218ag1.e(2);
                int iD7 = c3218ag1.d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < iD4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        c3218ag1.e(iD7);
                        i9++;
                    }
                }
            }
        }
    }

    public static void e(int i, C3218ag1 c3218ag1) throws C3000Zs0 {
        int iD = c3218ag1.d(6) + 1;
        for (int i2 = 0; i2 < iD; i2++) {
            if (c3218ag1.d(16) == 0) {
                int iD2 = c3218ag1.c() ? c3218ag1.d(4) + 1 : 1;
                if (c3218ag1.c()) {
                    int iD3 = c3218ag1.d(8) + 1;
                    for (int i3 = 0; i3 < iD3; i3++) {
                        int i4 = i - 1;
                        c3218ag1.e(a(i4));
                        c3218ag1.e(a(i4));
                    }
                }
                if (c3218ag1.d(2) != 0) {
                    throw new C3000Zs0("to reserved bits must be zero after mapping coupling steps");
                }
                if (iD2 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        c3218ag1.e(4);
                    }
                }
                for (int i6 = 0; i6 < iD2; i6++) {
                    c3218ag1.e(8);
                    c3218ag1.e(8);
                    c3218ag1.e(8);
                }
            }
        }
    }

    public static c[] f(C3218ag1 c3218ag1) {
        int iD = c3218ag1.d(6) + 1;
        c[] cVarArr = new c[iD];
        for (int i = 0; i < iD; i++) {
            cVarArr[i] = new c(c3218ag1.c(), c3218ag1.d(16), c3218ag1.d(16), c3218ag1.d(8));
        }
        return cVarArr;
    }

    public static void g(C3218ag1 c3218ag1) throws C3000Zs0 {
        int iD = c3218ag1.d(6) + 1;
        for (int i = 0; i < iD; i++) {
            if (c3218ag1.d(16) > 2) {
                throw new C3000Zs0("residueType greater than 2 is not decodable");
            }
            c3218ag1.e(24);
            c3218ag1.e(24);
            c3218ag1.e(24);
            int iD2 = c3218ag1.d(6) + 1;
            c3218ag1.e(8);
            int[] iArr = new int[iD2];
            for (int i2 = 0; i2 < iD2; i2++) {
                iArr[i2] = ((c3218ag1.c() ? c3218ag1.d(5) : 0) * 8) + c3218ag1.d(3);
            }
            for (int i3 = 0; i3 < iD2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        c3218ag1.e(8);
                    }
                }
            }
        }
    }

    public static b h(C2584Vs0 c2584Vs0) throws C3000Zs0 {
        k(3, c2584Vs0, false);
        String strU = c2584Vs0.u((int) c2584Vs0.n());
        int length = strU.length();
        long jN = c2584Vs0.n();
        String[] strArr = new String[(int) jN];
        int length2 = length + 15;
        for (int i = 0; i < jN; i++) {
            String strU2 = c2584Vs0.u((int) c2584Vs0.n());
            strArr[i] = strU2;
            length2 = length2 + 4 + strU2.length();
        }
        if ((c2584Vs0.x() & 1) != 0) {
            return new b(strU, strArr, length2 + 1);
        }
        throw new C3000Zs0("framing bit expected to be set");
    }

    public static d i(C2584Vs0 c2584Vs0) throws C3000Zs0 {
        k(1, c2584Vs0, false);
        long jN = c2584Vs0.n();
        int iX = c2584Vs0.x();
        long jN2 = c2584Vs0.n();
        int iL = c2584Vs0.l();
        int iL2 = c2584Vs0.l();
        int iL3 = c2584Vs0.l();
        int iX2 = c2584Vs0.x();
        return new d(jN, iX, jN2, iL, iL2, iL3, (int) Math.pow(2.0d, iX2 & 15), (int) Math.pow(2.0d, (iX2 & 240) >> 4), (c2584Vs0.x() & 1) > 0, Arrays.copyOf(c2584Vs0.a, c2584Vs0.d()));
    }

    public static c[] j(C2584Vs0 c2584Vs0, int i) throws C3000Zs0 {
        k(5, c2584Vs0, false);
        int iX = c2584Vs0.x() + 1;
        C3218ag1 c3218ag1 = new C3218ag1(c2584Vs0.a);
        c3218ag1.e(c2584Vs0.c() * 8);
        for (int i2 = 0; i2 < iX; i2++) {
            c(c3218ag1);
        }
        int iD = c3218ag1.d(6) + 1;
        for (int i3 = 0; i3 < iD; i3++) {
            if (c3218ag1.d(16) != 0) {
                throw new C3000Zs0("placeholder of time domain transforms not zeroed out");
            }
        }
        d(c3218ag1);
        g(c3218ag1);
        e(i, c3218ag1);
        c[] cVarArrF = f(c3218ag1);
        if (c3218ag1.c()) {
            return cVarArrF;
        }
        throw new C3000Zs0("framing bit after modes not set as expected");
    }

    public static boolean k(int i, C2584Vs0 c2584Vs0, boolean z) throws C3000Zs0 {
        if (c2584Vs0.a() < 7) {
            if (z) {
                return false;
            }
            throw new C3000Zs0("too short header: " + c2584Vs0.a());
        }
        if (c2584Vs0.x() != i) {
            if (z) {
                return false;
            }
            throw new C3000Zs0("expected header type " + Integer.toHexString(i));
        }
        if (c2584Vs0.x() == 118 && c2584Vs0.x() == 111 && c2584Vs0.x() == 114 && c2584Vs0.x() == 98 && c2584Vs0.x() == 105 && c2584Vs0.x() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new C3000Zs0("expected characters 'vorbis'");
    }
}
