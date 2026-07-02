package com.daaw;

/* JADX INFO: renamed from: com.daaw.j33, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5568j33 {
    public static int a(byte[] bArr, int i, C5291i33 c5291i33) throws C8939v43 {
        int iH = h(bArr, i, c5291i33);
        int i2 = c5291i33.a;
        if (i2 < 0) {
            throw C8939v43.f();
        }
        if (i2 > bArr.length - iH) {
            throw C8939v43.j();
        }
        if (i2 == 0) {
            c5291i33.c = AbstractC9213w33.C;
            return iH;
        }
        c5291i33.c = AbstractC9213w33.T(bArr, iH, i2);
        return iH + i2;
    }

    public static int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int c(InterfaceC7821r53 interfaceC7821r53, byte[] bArr, int i, int i2, int i3, C5291i33 c5291i33) throws C8939v43 {
        Object objZze = interfaceC7821r53.zze();
        int iL = l(objZze, interfaceC7821r53, bArr, i, i2, i3, c5291i33);
        interfaceC7821r53.b(objZze);
        c5291i33.c = objZze;
        return iL;
    }

    public static int d(InterfaceC7821r53 interfaceC7821r53, byte[] bArr, int i, int i2, C5291i33 c5291i33) throws C8939v43 {
        Object objZze = interfaceC7821r53.zze();
        int iM = m(objZze, interfaceC7821r53, bArr, i, i2, c5291i33);
        interfaceC7821r53.b(objZze);
        c5291i33.c = objZze;
        return iM;
    }

    public static int e(InterfaceC7821r53 interfaceC7821r53, int i, byte[] bArr, int i2, int i3, InterfaceC8095s43 interfaceC8095s43, C5291i33 c5291i33) throws C8939v43 {
        int iD = d(interfaceC7821r53, bArr, i2, i3, c5291i33);
        interfaceC8095s43.add(c5291i33.c);
        while (iD < i3) {
            int iH = h(bArr, iD, c5291i33);
            if (i != c5291i33.a) {
                break;
            }
            iD = d(interfaceC7821r53, bArr, iH, i3, c5291i33);
            interfaceC8095s43.add(c5291i33.c);
        }
        return iD;
    }

    public static int f(byte[] bArr, int i, InterfaceC8095s43 interfaceC8095s43, C5291i33 c5291i33) throws C8939v43 {
        C5855k43 c5855k43 = (C5855k43) interfaceC8095s43;
        int iH = h(bArr, i, c5291i33);
        int i2 = c5291i33.a + iH;
        while (iH < i2) {
            iH = h(bArr, iH, c5291i33);
            c5855k43.g(c5291i33.a);
        }
        if (iH == i2) {
            return iH;
        }
        throw C8939v43.j();
    }

    public static int g(int i, byte[] bArr, int i2, int i3, C9502x53 c9502x53, C5291i33 c5291i33) throws C8939v43 {
        if ((i >>> 3) == 0) {
            throw C8939v43.c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iK = k(bArr, i2, c5291i33);
            c9502x53.j(i, Long.valueOf(c5291i33.b));
            return iK;
        }
        if (i4 == 1) {
            c9502x53.j(i, Long.valueOf(n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iH = h(bArr, i2, c5291i33);
            int i5 = c5291i33.a;
            if (i5 < 0) {
                throw C8939v43.f();
            }
            if (i5 > bArr.length - iH) {
                throw C8939v43.j();
            }
            if (i5 == 0) {
                c9502x53.j(i, AbstractC9213w33.C);
            } else {
                c9502x53.j(i, AbstractC9213w33.T(bArr, iH, i5));
            }
            return iH + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw C8939v43.c();
            }
            c9502x53.j(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        C9502x53 c9502x53F = C9502x53.f();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iH2 = h(bArr, i2, c5291i33);
            i7 = c5291i33.a;
            if (i7 == i6) {
                i2 = iH2;
                break;
            }
            i2 = g(i7, bArr, iH2, i3, c9502x53F, c5291i33);
        }
        if (i2 > i3 || i7 != i6) {
            throw C8939v43.g();
        }
        c9502x53.j(i, c9502x53F);
        return i2;
    }

    public static int h(byte[] bArr, int i, C5291i33 c5291i33) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return i(b, bArr, i2, c5291i33);
        }
        c5291i33.a = b;
        return i2;
    }

    public static int i(int i, byte[] bArr, int i2, C5291i33 c5291i33) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c5291i33.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c5291i33.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c5291i33.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c5291i33.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c5291i33.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int j(int i, byte[] bArr, int i2, int i3, InterfaceC8095s43 interfaceC8095s43, C5291i33 c5291i33) {
        C5855k43 c5855k43 = (C5855k43) interfaceC8095s43;
        int iH = h(bArr, i2, c5291i33);
        c5855k43.g(c5291i33.a);
        while (iH < i3) {
            int iH2 = h(bArr, iH, c5291i33);
            if (i != c5291i33.a) {
                break;
            }
            iH = h(bArr, iH2, c5291i33);
            c5855k43.g(c5291i33.a);
        }
        return iH;
    }

    public static int k(byte[] bArr, int i, C5291i33 c5291i33) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c5291i33.b = j;
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
        c5291i33.b = j2;
        return i3;
    }

    public static int l(Object obj, InterfaceC7821r53 interfaceC7821r53, byte[] bArr, int i, int i2, int i3, C5291i33 c5291i33) throws C8939v43 {
        int iC = ((X43) interfaceC7821r53).C(obj, bArr, i, i2, i3, c5291i33);
        c5291i33.c = obj;
        return iC;
    }

    public static int m(Object obj, InterfaceC7821r53 interfaceC7821r53, byte[] bArr, int i, int i2, C5291i33 c5291i33) throws C8939v43 {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = i(i4, bArr, i3, c5291i33);
            i4 = c5291i33.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw C8939v43.j();
        }
        int i6 = i5 + i4;
        interfaceC7821r53.h(obj, bArr, i5, i6, c5291i33);
        c5291i33.c = obj;
        return i6;
    }

    public static long n(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
