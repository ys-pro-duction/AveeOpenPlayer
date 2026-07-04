package com.daaw;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: renamed from: com.daaw.fn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4656fn1 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, RCHTTPStatusCodes.BAD_REQUEST, RCHTTPStatusCodes.BAD_REQUEST, 2048};

    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.C4367en1 a(com.daaw.GD2 r11) {
        /*
            r0 = 16
            int r1 = r11.d(r0)
            int r0 = r11.d(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.d(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.d(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L38
            r1 = 0
        L2c:
            int r5 = r11.d(r0)
            int r1 = r1 + r5
            boolean r5 = r11.n()
            if (r5 != 0) goto L3a
            int r1 = r1 + r4
        L38:
            r5 = r1
            goto L3e
        L3a:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L2c
        L3e:
            r1 = 10
            int r1 = r11.d(r1)
            boolean r6 = r11.n()
            if (r6 == 0) goto L53
            int r6 = r11.d(r4)
            if (r6 <= 0) goto L53
            r11.l(r0)
        L53:
            boolean r6 = r11.n()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            r10 = 1
            if (r10 == r6) goto L63
            r7 = 44100(0xac44, float:6.1797E-41)
        L63:
            r6 = 48000(0xbb80, float:6.7262E-41)
            int r11 = r11.d(r3)
            if (r7 != r9) goto L76
            r9 = 13
            if (r11 != r9) goto L76
            int[] r11 = com.daaw.AbstractC4656fn1.a
            r2 = r11[r9]
        L74:
            r9 = r2
            goto La3
        L76:
            if (r7 != r6) goto La2
            r6 = 14
            if (r11 >= r6) goto La2
            int[] r2 = com.daaw.AbstractC4656fn1.a
            r2 = r2[r11]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L9d
            r9 = 11
            if (r1 == r0) goto L98
            if (r1 == r4) goto L9d
            if (r1 == r3) goto L8f
            goto L74
        L8f:
            if (r11 == r4) goto L95
            if (r11 == r6) goto L95
            if (r11 != r9) goto L74
        L95:
            int r2 = r2 + 1
            goto L74
        L98:
            if (r11 == r6) goto L95
            if (r11 != r9) goto L74
            goto L95
        L9d:
            if (r11 == r4) goto L95
            if (r11 != r6) goto L74
            goto L95
        La2:
            r9 = 0
        La3:
            com.daaw.en1 r4 = new com.daaw.en1
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC4656fn1.a(com.daaw.GD2):com.daaw.en1");
    }

    public static void b(int i, C5900kE2 c5900kE2) {
        c5900kE2.d(7);
        byte[] bArrI = c5900kE2.i();
        bArrI[0] = -84;
        bArrI[1] = 64;
        bArrI[2] = -1;
        bArrI[3] = -1;
        bArrI[4] = (byte) ((i >> 16) & 255);
        bArrI[5] = (byte) ((i >> 8) & 255);
        bArrI[6] = (byte) (i & 255);
    }
}
