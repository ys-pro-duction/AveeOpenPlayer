package com.daaw;

/* JADX INFO: renamed from: com.daaw.Zm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2977Zm1 {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static C2873Ym1 a(byte[] bArr) {
        return b(new GD2(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.C2873Ym1 b(com.daaw.GD2 r11, boolean r12) throws com.daaw.QT1 {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2977Zm1.b(com.daaw.GD2, boolean):com.daaw.Ym1");
    }

    public static int c(GD2 gd2) {
        int iD = gd2.d(5);
        return iD == 31 ? gd2.d(6) + 32 : iD;
    }

    public static int d(GD2 gd2) throws QT1 {
        int iD = gd2.d(4);
        if (iD == 15) {
            if (gd2.a() >= 24) {
                return gd2.d(24);
            }
            throw QT1.a("AAC header insufficient data", null);
        }
        if (iD < 13) {
            return a[iD];
        }
        throw QT1.a("AAC header wrong Sampling Frequency Index", null);
    }
}
