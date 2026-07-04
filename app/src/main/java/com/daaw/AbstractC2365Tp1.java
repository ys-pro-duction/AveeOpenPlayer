package com.daaw;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Tp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2365Tp1 {
    public static final InterfaceC2155Rp1 a = new InterfaceC2155Rp1() { // from class: com.daaw.Qp1
    };

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzby a(byte[] r11, int r12, com.daaw.InterfaceC2155Rp1 r13, com.daaw.C9704xp1 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2365Tp1.a(byte[], int, com.daaw.Rp1, com.daaw.xp1):com.google.android.gms.internal.ads.zzby");
    }

    public static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static int c(byte[] bArr, int i, int i2) {
        int iD = d(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iD;
        }
        while (true) {
            int length = bArr.length;
            if (iD >= length - 1) {
                return length;
            }
            int i3 = iD + 1;
            if ((iD - i) % 2 == 0 && bArr[i3] == 0) {
                return iD;
            }
            iD = d(bArr, i3);
        }
    }

    public static int d(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    public static int e(C5900kE2 c5900kE2, int i) {
        byte[] bArrI = c5900kE2.i();
        int iL = c5900kE2.l();
        int i2 = iL;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iL + i) {
                return i;
            }
            if ((bArrI[i2] & 255) == 255 && bArrI[i3] == 0) {
                System.arraycopy(bArrI, i2 + 2, bArrI, i3, (i - (i2 - iL)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0288 A[Catch: all -> 0x024d, TryCatch #2 {all -> 0x024d, blocks: (B:227:0x04d5, B:128:0x0220, B:148:0x0276, B:150:0x0288, B:157:0x02c8, B:154:0x02aa, B:156:0x02c2, B:169:0x0307, B:176:0x034a, B:179:0x037f, B:182:0x0390, B:183:0x0398, B:185:0x039e, B:187:0x03a5, B:188:0x03a9, B:196:0x03cb, B:200:0x03f6, B:202:0x0401, B:203:0x0438, B:204:0x0445, B:206:0x044b, B:208:0x0452, B:209:0x0456, B:213:0x046b, B:221:0x047e, B:223:0x04a8, B:224:0x04b7, B:225:0x04c2), top: B:238:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02aa A[Catch: all -> 0x024d, TryCatch #2 {all -> 0x024d, blocks: (B:227:0x04d5, B:128:0x0220, B:148:0x0276, B:150:0x0288, B:157:0x02c8, B:154:0x02aa, B:156:0x02c2, B:169:0x0307, B:176:0x034a, B:179:0x037f, B:182:0x0390, B:183:0x0398, B:185:0x039e, B:187:0x03a5, B:188:0x03a9, B:196:0x03cb, B:200:0x03f6, B:202:0x0401, B:203:0x0438, B:204:0x0445, B:206:0x044b, B:208:0x0452, B:209:0x0456, B:213:0x046b, B:221:0x047e, B:223:0x04a8, B:224:0x04b7, B:225:0x04c2), top: B:238:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0470  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzafh f(int r32, com.daaw.C5900kE2 r33, boolean r34, int r35, com.daaw.InterfaceC2155Rp1 r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2365Tp1.f(int, com.daaw.kE2, boolean, int, com.daaw.Rp1):com.google.android.gms.internal.ads.zzafh");
    }

    public static OP2 g(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return OP2.K("");
        }
        LP2 lp2 = new LP2();
        int iC = c(bArr, i2, i);
        while (i2 < iC) {
            lp2.g(new String(bArr, i2, iC - i2, j(i)));
            i2 = b(i) + iC;
            iC = c(bArr, i2, i);
        }
        OP2 op2J = lp2.j();
        return op2J.isEmpty() ? OP2.K("") : op2J;
    }

    public static String h(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static String i(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static Charset j(int i) {
        return i != 1 ? i != 2 ? i != 3 ? UN2.b : UN2.c : UN2.d : UN2.f;
    }

    public static boolean k(C5900kE2 c5900kE2, int i, int i2, boolean z) {
        int iW;
        long jW;
        int iY;
        int i3;
        int iL = c5900kE2.l();
        while (true) {
            try {
                if (c5900kE2.j() < i2) {
                    c5900kE2.g(iL);
                    return true;
                }
                if (i >= 3) {
                    iW = c5900kE2.o();
                    jW = c5900kE2.C();
                    iY = c5900kE2.y();
                } else {
                    iW = c5900kE2.w();
                    jW = c5900kE2.w();
                    iY = 0;
                }
                if (iW == 0 && jW == 0 && iY == 0) {
                    c5900kE2.g(iL);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jW) != 0) {
                        c5900kE2.g(iL);
                        return false;
                    }
                    jW = ((jW >> 24) << 21) | (((jW >> 16) & 255) << 14) | (jW & 255) | (((jW >> 8) & 255) << 7);
                }
                if (i == 4) {
                    i = iY & 1;
                    i3 = (iY & 64) == 0 ? 0 : 1;
                } else {
                    if (i == 3) {
                        i3 = (iY & 32) != 0 ? 1 : 0;
                        if ((iY & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    i = 0;
                }
                if (i != 0) {
                    i3 += 4;
                }
                if (jW < i3) {
                    c5900kE2.g(iL);
                    return false;
                }
                if (c5900kE2.j() < jW) {
                    c5900kE2.g(iL);
                    return false;
                }
                c5900kE2.h((int) jW);
            } catch (Throwable th) {
                c5900kE2.g(iL);
                throw th;
            }
        }
    }

    public static byte[] l(byte[] bArr, int i, int i2) {
        return i2 <= i ? AbstractC9004vJ2.f : Arrays.copyOfRange(bArr, i, i2);
    }
}
