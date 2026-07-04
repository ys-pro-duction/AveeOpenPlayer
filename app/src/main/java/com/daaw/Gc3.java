package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Gc3 {
    public static int a(byte[] bArr, int i, Dc3 dc3) {
        int iJ = j(bArr, i, dc3);
        int i2 = dc3.a;
        if (i2 < 0) {
            throw Ef3.d();
        }
        if (i2 > bArr.length - iJ) {
            throw Ef3.f();
        }
        if (i2 == 0) {
            dc3.c = AbstractC9646xd3.C;
            return iJ;
        }
        dc3.c = AbstractC9646xd3.I(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int c(InterfaceC4907gh3 interfaceC4907gh3, byte[] bArr, int i, int i2, int i3, Dc3 dc3) {
        Object objZze = interfaceC4907gh3.zze();
        int iN = n(objZze, interfaceC4907gh3, bArr, i, i2, i3, dc3);
        interfaceC4907gh3.b(objZze);
        dc3.c = objZze;
        return iN;
    }

    public static int d(InterfaceC4907gh3 interfaceC4907gh3, byte[] bArr, int i, int i2, Dc3 dc3) {
        Object objZze = interfaceC4907gh3.zze();
        int iO = o(objZze, interfaceC4907gh3, bArr, i, i2, dc3);
        interfaceC4907gh3.b(objZze);
        dc3.c = objZze;
        return iO;
    }

    public static int e(InterfaceC4907gh3 interfaceC4907gh3, int i, byte[] bArr, int i2, int i3, InterfaceC9377wf3 interfaceC9377wf3, Dc3 dc3) {
        int iD = d(interfaceC4907gh3, bArr, i2, i3, dc3);
        interfaceC9377wf3.add(dc3.c);
        while (iD < i3) {
            int iJ = j(bArr, iD, dc3);
            if (i != dc3.a) {
                break;
            }
            iD = d(interfaceC4907gh3, bArr, iJ, i3, dc3);
            interfaceC9377wf3.add(dc3.c);
        }
        return iD;
    }

    public static int f(byte[] bArr, int i, InterfaceC9377wf3 interfaceC9377wf3, Dc3 dc3) {
        C4618ff3 c4618ff3 = (C4618ff3) interfaceC9377wf3;
        int iJ = j(bArr, i, dc3);
        int i2 = dc3.a + iJ;
        while (iJ < i2) {
            iJ = j(bArr, iJ, dc3);
            c4618ff3.g(dc3.a);
        }
        if (iJ == i2) {
            return iJ;
        }
        throw Ef3.f();
    }

    public static int g(byte[] bArr, int i, Dc3 dc3) throws Ef3 {
        int iJ = j(bArr, i, dc3);
        int i2 = dc3.a;
        if (i2 < 0) {
            throw Ef3.d();
        }
        if (i2 == 0) {
            dc3.c = "";
            return iJ;
        }
        dc3.c = new String(bArr, iJ, i2, AbstractC10214zf3.b);
        return iJ + i2;
    }

    public static int h(byte[] bArr, int i, Dc3 dc3) throws Ef3 {
        int iJ = j(bArr, i, dc3);
        int i2 = dc3.a;
        if (i2 < 0) {
            throw Ef3.d();
        }
        if (i2 == 0) {
            dc3.c = "";
            return iJ;
        }
        AbstractC6875ni3 abstractC6875ni3 = AbstractC8548ti3.a;
        int length = bArr.length;
        if ((((length - iJ) - i2) | iJ | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iJ), Integer.valueOf(i2)));
        }
        int i3 = iJ + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (iJ < i3) {
            byte b = bArr[iJ];
            if (!AbstractC6317li3.d(b)) {
                break;
            }
            iJ++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (iJ < i3) {
            int i6 = iJ + 1;
            byte b2 = bArr[iJ];
            if (AbstractC6317li3.d(b2)) {
                cArr[i5] = (char) b2;
                i5++;
                iJ = i6;
                while (iJ < i3) {
                    byte b3 = bArr[iJ];
                    if (AbstractC6317li3.d(b3)) {
                        iJ++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw Ef3.c();
                }
                iJ += 2;
                AbstractC6317li3.c(b2, bArr[i6], cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw Ef3.c();
                }
                int i7 = iJ + 2;
                iJ += 3;
                AbstractC6317li3.b(b2, bArr[i6], bArr[i7], cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw Ef3.c();
                }
                byte b4 = bArr[i6];
                int i8 = iJ + 3;
                byte b5 = bArr[iJ + 2];
                iJ += 4;
                AbstractC6317li3.a(b2, b4, b5, bArr[i8], cArr, i5);
                i5 += 2;
            }
        }
        dc3.c = new String(cArr, 0, i5);
        return i3;
    }

    public static int i(int i, byte[] bArr, int i2, int i3, Rh3 rh3, Dc3 dc3) throws Ef3 {
        if ((i >>> 3) == 0) {
            throw Ef3.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM = m(bArr, i2, dc3);
            rh3.j(i, Long.valueOf(dc3.b));
            return iM;
        }
        if (i4 == 1) {
            rh3.j(i, Long.valueOf(p(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iJ = j(bArr, i2, dc3);
            int i5 = dc3.a;
            if (i5 < 0) {
                throw Ef3.d();
            }
            if (i5 > bArr.length - iJ) {
                throw Ef3.f();
            }
            if (i5 == 0) {
                rh3.j(i, AbstractC9646xd3.C);
            } else {
                rh3.j(i, AbstractC9646xd3.I(bArr, iJ, i5));
            }
            return iJ + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw Ef3.b();
            }
            rh3.j(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        Rh3 rh3F = Rh3.f();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iJ2 = j(bArr, i2, dc3);
            i7 = dc3.a;
            if (i7 == i6) {
                i2 = iJ2;
                break;
            }
            i2 = i(i7, bArr, iJ2, i3, rh3F, dc3);
        }
        if (i2 > i3 || i7 != i6) {
            throw Ef3.e();
        }
        rh3.j(i, rh3F);
        return i2;
    }

    public static int j(byte[] bArr, int i, Dc3 dc3) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return k(b, bArr, i2, dc3);
        }
        dc3.a = b;
        return i2;
    }

    public static int k(int i, byte[] bArr, int i2, Dc3 dc3) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            dc3.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            dc3.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            dc3.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            dc3.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                dc3.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int l(int i, byte[] bArr, int i2, int i3, InterfaceC9377wf3 interfaceC9377wf3, Dc3 dc3) {
        C4618ff3 c4618ff3 = (C4618ff3) interfaceC9377wf3;
        int iJ = j(bArr, i2, dc3);
        c4618ff3.g(dc3.a);
        while (iJ < i3) {
            int iJ2 = j(bArr, iJ, dc3);
            if (i != dc3.a) {
                break;
            }
            iJ = j(bArr, iJ2, dc3);
            c4618ff3.g(dc3.a);
        }
        return iJ;
    }

    public static int m(byte[] bArr, int i, Dc3 dc3) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            dc3.b = j;
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
        dc3.b = j2;
        return i3;
    }

    public static int n(Object obj, InterfaceC4907gh3 interfaceC4907gh3, byte[] bArr, int i, int i2, int i3, Dc3 dc3) {
        int iD = ((Qg3) interfaceC4907gh3).D(obj, bArr, i, i2, i3, dc3);
        dc3.c = obj;
        return iD;
    }

    public static int o(Object obj, InterfaceC4907gh3 interfaceC4907gh3, byte[] bArr, int i, int i2, Dc3 dc3) {
        int iK = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iK = k(i3, bArr, iK, dc3);
            i3 = dc3.a;
        }
        int i4 = iK;
        if (i3 < 0 || i3 > i2 - i4) {
            throw Ef3.f();
        }
        int i5 = i4 + i3;
        interfaceC4907gh3.g(obj, bArr, i4, i5, dc3);
        dc3.c = obj;
        return i5;
    }

    public static long p(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
