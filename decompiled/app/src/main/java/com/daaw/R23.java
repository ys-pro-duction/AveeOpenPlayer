package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class R23 implements RZ2 {
    public final SecretKey a;
    public final byte[] b;
    public final byte[] c;

    public R23(byte[] bArr) throws GeneralSecurityException {
        W23.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrA = AbstractC8782uZ2.a(cipherB.doFinal(new byte[16]));
        this.b = bArrA;
        this.c = AbstractC8782uZ2.a(bArrA);
    }

    public static Cipher b() throws GeneralSecurityException {
        if (TW2.a(1)) {
            return (Cipher) G23.b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.daaw.RZ2
    public final byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArrC;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.a;
        Cipher cipherB = b();
        cipherB.init(1, secretKey);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        int i2 = iMax - 1;
        int i3 = i2 * 16;
        if (iMax * 16 == length) {
            bArrC = AbstractC8085s23.d(bArr, i3, this.b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            bArrC = AbstractC8085s23.c(bArrCopyOf, this.c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i4 = 0; i4 < i2; i4++) {
            bArrDoFinal = cipherB.doFinal(AbstractC8085s23.d(bArrDoFinal, 0, bArr, i4 * 16, 16));
        }
        return Arrays.copyOf(cipherB.doFinal(AbstractC8085s23.c(bArrC, bArrDoFinal)), i);
    }
}
