package com.daaw;

/* JADX INFO: renamed from: com.daaw.or1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7197or1 {
    public final boolean a;
    public final String b;
    public final C8297so1 c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7197or1(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            if (r11 != 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r2 = r2 ^ r3
            com.daaw.AbstractC6048km2.d(r2)
            r4.a = r5
            r4.b = r6
            r4.d = r7
            r4.e = r11
            com.daaw.so1 r5 = new com.daaw.so1
            if (r6 != 0) goto L20
            goto L77
        L20:
            int r7 = r6.hashCode()
            r11 = 3
            r2 = 2
            switch(r7) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L34;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L51
        L2a:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = 1
            goto L52
        L34:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            goto L52
        L3d:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = 3
            goto L52
        L47:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = 2
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L77
            if (r0 == r1) goto L77
            if (r0 == r2) goto L76
            if (r0 == r11) goto L76
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.append(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            com.daaw.AbstractC3305ay2.f(r7, r6)
            goto L77
        L76:
            r1 = 2
        L77:
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7197or1.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
