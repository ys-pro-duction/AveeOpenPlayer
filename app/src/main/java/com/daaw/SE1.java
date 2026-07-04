package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SE1 {
    public static int a(byte[] bArr, int i, C6745nE1 c6745nE1) {
        int iH = h(bArr, i, c6745nE1);
        int i2 = c6745nE1.a;
        if (i2 < 0) {
            throw U92.d();
        }
        if (i2 > bArr.length - iH) {
            throw U92.g();
        }
        if (i2 == 0) {
            c6745nE1.c = BM1.C;
            return iH;
        }
        c6745nE1.c = BM1.I(bArr, iH, i2);
        return iH + i2;
    }

    public static int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int c(InterfaceC7500pw2 interfaceC7500pw2, byte[] bArr, int i, int i2, int i3, C6745nE1 c6745nE1) {
        Object objZze = interfaceC7500pw2.zze();
        int iL = l(objZze, interfaceC7500pw2, bArr, i, i2, i3, c6745nE1);
        interfaceC7500pw2.b(objZze);
        c6745nE1.c = objZze;
        return iL;
    }

    public static int d(InterfaceC7500pw2 interfaceC7500pw2, byte[] bArr, int i, int i2, C6745nE1 c6745nE1) {
        Object objZze = interfaceC7500pw2.zze();
        int iM = m(objZze, interfaceC7500pw2, bArr, i, i2, c6745nE1);
        interfaceC7500pw2.b(objZze);
        c6745nE1.c = objZze;
        return iM;
    }

    public static int e(InterfaceC7500pw2 interfaceC7500pw2, int i, byte[] bArr, int i2, int i3, M72 m72, C6745nE1 c6745nE1) {
        int iD = d(interfaceC7500pw2, bArr, i2, i3, c6745nE1);
        m72.add(c6745nE1.c);
        while (iD < i3) {
            int iH = h(bArr, iD, c6745nE1);
            if (i != c6745nE1.a) {
                break;
            }
            iD = d(interfaceC7500pw2, bArr, iH, i3, c6745nE1);
            m72.add(c6745nE1.c);
        }
        return iD;
    }

    public static int f(byte[] bArr, int i, M72 m72, C6745nE1 c6745nE1) {
        C5854k42 c5854k42 = (C5854k42) m72;
        int iH = h(bArr, i, c6745nE1);
        int i2 = c6745nE1.a + iH;
        while (iH < i2) {
            iH = h(bArr, iH, c6745nE1);
            c5854k42.q(c6745nE1.a);
        }
        if (iH == i2) {
            return iH;
        }
        throw U92.g();
    }

    public static int g(int i, byte[] bArr, int i2, int i3, C3113aH2 c3113aH2, C6745nE1 c6745nE1) {
        if ((i >>> 3) == 0) {
            throw U92.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iK = k(bArr, i2, c6745nE1);
            c3113aH2.j(i, Long.valueOf(c6745nE1.b));
            return iK;
        }
        if (i4 == 1) {
            c3113aH2.j(i, Long.valueOf(n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iH = h(bArr, i2, c6745nE1);
            int i5 = c6745nE1.a;
            if (i5 < 0) {
                throw U92.d();
            }
            if (i5 > bArr.length - iH) {
                throw U92.g();
            }
            if (i5 == 0) {
                c3113aH2.j(i, BM1.C);
            } else {
                c3113aH2.j(i, BM1.I(bArr, iH, i5));
            }
            return iH + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw U92.b();
            }
            c3113aH2.j(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        C3113aH2 c3113aH2F = C3113aH2.f();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iH2 = h(bArr, i2, c6745nE1);
            i7 = c6745nE1.a;
            if (i7 == i6) {
                i2 = iH2;
                break;
            }
            i2 = g(i7, bArr, iH2, i3, c3113aH2F, c6745nE1);
        }
        if (i2 > i3 || i7 != i6) {
            throw U92.e();
        }
        c3113aH2.j(i, c3113aH2F);
        return i2;
    }

    public static int h(byte[] bArr, int i, C6745nE1 c6745nE1) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return i(b, bArr, i2, c6745nE1);
        }
        c6745nE1.a = b;
        return i2;
    }

    public static int i(int i, byte[] bArr, int i2, C6745nE1 c6745nE1) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c6745nE1.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c6745nE1.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c6745nE1.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c6745nE1.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c6745nE1.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int j(int i, byte[] bArr, int i2, int i3, M72 m72, C6745nE1 c6745nE1) {
        C5854k42 c5854k42 = (C5854k42) m72;
        int iH = h(bArr, i2, c6745nE1);
        c5854k42.q(c6745nE1.a);
        while (iH < i3) {
            int iH2 = h(bArr, iH, c6745nE1);
            if (i != c6745nE1.a) {
                break;
            }
            iH = h(bArr, iH2, c6745nE1);
            c5854k42.q(c6745nE1.a);
        }
        return iH;
    }

    public static int k(byte[] bArr, int i, C6745nE1 c6745nE1) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c6745nE1.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c6745nE1.b = j2;
        return i3;
    }

    public static int l(Object obj, InterfaceC7500pw2 interfaceC7500pw2, byte[] bArr, int i, int i2, int i3, C6745nE1 c6745nE1) {
        int iW = ((C4109dr2) interfaceC7500pw2).w(obj, bArr, i, i2, i3, c6745nE1);
        c6745nE1.c = obj;
        return iW;
    }

    public static int m(Object obj, InterfaceC7500pw2 interfaceC7500pw2, byte[] bArr, int i, int i2, C6745nE1 c6745nE1) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = i(i4, bArr, i3, c6745nE1);
            i4 = c6745nE1.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw U92.g();
        }
        int i6 = i5 + i4;
        interfaceC7500pw2.f(obj, bArr, i5, i6, c6745nE1);
        c6745nE1.c = obj;
        return i6;
    }

    public static long n(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
