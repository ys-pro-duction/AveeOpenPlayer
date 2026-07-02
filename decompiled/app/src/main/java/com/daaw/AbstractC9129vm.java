package com.daaw;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9129vm {
    public static final byte[] a = {0, 0, 0, 1};
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static byte[] b(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = b;
            if (i4 >= iArr.length) {
                break;
            }
            if (i == iArr[i4]) {
                i5 = i4;
            }
            i4++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = c;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return a(2, i5, i6);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static int d(byte[] bArr, int i) {
        int length = bArr.length - a.length;
        while (i <= length) {
            if (g(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int e(C2480Us0 c2480Us0) {
        int iH = c2480Us0.h(5);
        return iH == 31 ? c2480Us0.h(6) + 32 : iH;
    }

    public static int f(C2480Us0 c2480Us0) {
        int iH = c2480Us0.h(4);
        if (iH == 15) {
            return c2480Us0.h(24);
        }
        AbstractC7115ob.a(iH < 13);
        return b[iH];
    }

    public static boolean g(byte[] bArr, int i) {
        if (bArr.length - i <= a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static Pair h(C2480Us0 c2480Us0, boolean z) throws C3000Zs0 {
        int iE = e(c2480Us0);
        int iF = f(c2480Us0);
        int iH = c2480Us0.h(4);
        if (iE == 5 || iE == 29) {
            iF = f(c2480Us0);
            iE = e(c2480Us0);
            if (iE == 22) {
                iH = c2480Us0.h(4);
            }
        }
        if (z) {
            if (iE != 1 && iE != 2 && iE != 3 && iE != 4 && iE != 6 && iE != 7 && iE != 17) {
                switch (iE) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new C3000Zs0("Unsupported audio object type: " + iE);
                }
            }
            j(c2480Us0, iE, iH);
            switch (iE) {
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = c2480Us0.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw new C3000Zs0("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i = c[iH];
        AbstractC7115ob.a(i != -1);
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(i));
    }

    public static Pair i(byte[] bArr) {
        return h(new C2480Us0(bArr), false);
    }

    public static void j(C2480Us0 c2480Us0, int i, int i2) {
        c2480Us0.o(1);
        if (c2480Us0.g()) {
            c2480Us0.o(14);
        }
        boolean zG = c2480Us0.g();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            c2480Us0.o(3);
        }
        if (zG) {
            if (i == 22) {
                c2480Us0.o(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                c2480Us0.o(3);
            }
            c2480Us0.o(1);
        }
    }

    public static byte[][] k(byte[] bArr) {
        if (!g(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iD = 0;
        do {
            arrayList.add(Integer.valueOf(iD));
            iD = d(bArr, iD + a.length);
        } while (iD != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i = 0;
        while (i < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            int iIntValue2 = (i < arrayList.size() + (-1) ? ((Integer) arrayList.get(i + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i] = bArr3;
            i++;
        }
        return bArr2;
    }
}
