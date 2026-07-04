package com.daaw;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.daaw.sA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8123sA1 extends AbstractC4198eA1 {
    public MessageDigest c;
    public final int d;
    public final int e;

    public C8123sA1(int i) {
        int i2 = i >> 3;
        this.d = (i & 7) > 0 ? i2 + 1 : i2;
        this.e = i;
    }

    @Override // com.daaw.AbstractC4198eA1
    public final byte[] b(String str) {
        synchronized (this.a) {
            try {
                MessageDigest messageDigestA = a();
                this.c = messageDigestA;
                if (messageDigestA == null) {
                    return new byte[0];
                }
                messageDigestA.reset();
                this.c.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.c.digest();
                int length = bArrDigest.length;
                int i = this.d;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.e & 7) > 0) {
                    long j = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i2] & 255);
                    }
                    long j2 = j >>> (8 - (this.e & 7));
                    int i3 = this.d;
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        bArr[i3] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
