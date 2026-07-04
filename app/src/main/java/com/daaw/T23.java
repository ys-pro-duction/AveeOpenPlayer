package com.daaw;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public final class T23 implements RZ2 {
    public final ThreadLocal a;
    public final String b;
    public final Key c;
    public final int d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T23(java.lang.String r6, java.security.Key r7) throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            r5.<init>()
            com.daaw.S23 r0 = new com.daaw.S23
            r0.<init>(r5)
            r5.a = r0
            r1 = 2
            boolean r2 = com.daaw.TW2.a(r1)
            if (r2 == 0) goto L90
            r5.b = r6
            r5.c = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r2 = 16
            if (r7 < r2) goto L88
            int r7 = r6.hashCode()
            r2 = 1
            r3 = 3
            r4 = 4
            switch(r7) {
                case -1823053428: goto L51;
                case 392315023: goto L47;
                case 392315118: goto L3d;
                case 392316170: goto L33;
                case 392317873: goto L29;
                default: goto L28;
            }
        L28:
            goto L5b
        L29:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 4
            goto L5c
        L33:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 3
            goto L5c
        L3d:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 2
            goto L5c
        L47:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 1
            goto L5c
        L51:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 0
            goto L5c
        L5b:
            r7 = -1
        L5c:
            if (r7 == 0) goto L80
            if (r7 == r2) goto L7d
            if (r7 == r1) goto L7a
            if (r7 == r3) goto L77
            if (r7 != r4) goto L6b
            r6 = 64
        L68:
            r5.d = r6
            goto L84
        L6b:
            java.lang.String r7 = "unknown Hmac algorithm: "
            java.lang.String r6 = r7.concat(r6)
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            r7.<init>(r6)
            throw r7
        L77:
            r6 = 48
            goto L68
        L7a:
            r6 = 32
            goto L68
        L7d:
            r6 = 28
            goto L68
        L80:
            r6 = 20
            r5.d = r6
        L84:
            r0.get()
            return
        L88:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L90:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.T23.<init>(java.lang.String, java.security.Key):void");
    }

    @Override // com.daaw.RZ2
    public final byte[] a(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.a.get()).doFinal(), i);
    }
}
