package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.Qn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2043Qn1 {
    public static int a(C5900kE2 c5900kE2, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c5900kE2.u() + 1;
            case 7:
                return c5900kE2.y() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return PSKKeyManager.MAX_KEY_LENGTH_BYTES << (i - 8);
            default:
                return -1;
        }
    }

    public static long b(InterfaceC1190In1 interfaceC1190In1, C2461Un1 c2461Un1) throws QT1, EOFException, InterruptedIOException {
        interfaceC1190In1.zzj();
        C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
        c9694xn1.l(1, false);
        byte[] bArr = new byte[1];
        c9694xn1.h(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        c9694xn1.l(2, false);
        int i2 = 1 != i ? 6 : 7;
        C5900kE2 c5900kE2 = new C5900kE2(i2);
        c5900kE2.f(AbstractC1502Ln1.a(interfaceC1190In1, c5900kE2.i(), 0, i2));
        interfaceC1190In1.zzj();
        C1917Pn1 c1917Pn1 = new C1917Pn1();
        if (d(c5900kE2, c2461Un1, z, c1917Pn1)) {
            return c1917Pn1.a;
        }
        throw QT1.a(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(com.daaw.C5900kE2 r23, com.daaw.C2461Un1 r24, int r25, com.daaw.C1917Pn1 r26) {
        /*
            r0 = r23
            r1 = r24
            int r2 = r0.l()
            long r3 = r0.C()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r25
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L19
            return r9
        L19:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r10
            long r3 = r3 & r7
            r19 = 15
            r21 = r7
            long r7 = r15 & r19
            int r8 = (int) r7
            r7 = 7
            r15 = -1
            if (r8 > r7) goto L43
            int r7 = r1.g
            int r7 = r7 + r15
            if (r8 != r7) goto Laf
            goto L4c
        L43:
            r7 = 10
            if (r8 > r7) goto Laf
            int r7 = r1.g
            r8 = 2
            if (r7 != r8) goto Laf
        L4c:
            r7 = 7
            long r7 = r17 & r7
            int r8 = (int) r7
            if (r8 != 0) goto L54
            goto L58
        L54:
            int r7 = r1.i
            if (r8 != r7) goto Laf
        L58:
            int r7 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r7 == 0) goto Laf
            r3 = r26
            boolean r3 = d(r0, r1, r5, r3)
            if (r3 == 0) goto Laf
            long r3 = r11 & r19
            int r4 = (int) r3
            int r3 = a(r0, r4)
            if (r3 == r15) goto Laf
            int r4 = r1.b
            if (r3 > r4) goto Laf
            long r3 = r13 & r19
            int r5 = r1.e
            int r4 = (int) r3
            if (r4 != 0) goto L79
            goto L9b
        L79:
            r3 = 11
            if (r4 > r3) goto L82
            int r1 = r1.f
            if (r4 == r1) goto L9b
            goto Laf
        L82:
            if (r4 != r6) goto L8d
            int r1 = r0.u()
            int r1 = r1 * 1000
            if (r1 != r5) goto Laf
            goto L9b
        L8d:
            r1 = 14
            if (r4 > r1) goto Laf
            int r3 = r0.y()
            if (r4 != r1) goto L99
            int r3 = r3 * 10
        L99:
            if (r3 != r5) goto Laf
        L9b:
            int r1 = r0.u()
            int r3 = r0.l()
            byte[] r0 = r0.i()
            int r3 = r3 + r15
            int r0 = com.daaw.AbstractC9004vJ2.q(r0, r2, r3, r9)
            if (r1 != r0) goto Laf
            return r10
        Laf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2043Qn1.c(com.daaw.kE2, com.daaw.Un1, int, com.daaw.Pn1):boolean");
    }

    public static boolean d(C5900kE2 c5900kE2, C2461Un1 c2461Un1, boolean z, C1917Pn1 c1917Pn1) {
        try {
            long jE = c5900kE2.E();
            if (!z) {
                jE *= (long) c2461Un1.b;
            }
            c1917Pn1.a = jE;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
