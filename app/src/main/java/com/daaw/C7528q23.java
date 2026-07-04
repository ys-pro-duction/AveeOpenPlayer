package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.daaw.q23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7528q23 implements InterfaceC5681jT2 {
    public static final ThreadLocal e = new C6970o23();
    public static final ThreadLocal f = new C7249p23();
    public final byte[] a;
    public final byte[] b;
    public final SecretKeySpec c;
    public final int d;

    public C7528q23(byte[] bArr, int i) throws GeneralSecurityException {
        if (!TW2.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = i;
        W23.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.c = secretKeySpec;
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher.doFinal(new byte[16]));
        this.a = bArrB;
        this.b = b(bArrB);
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // com.daaw.InterfaceC5681jT2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = (length - this.d) - 16;
        if (i < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c);
        byte[] bArrC = c(cipher, 0, bArr, 0, this.d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrC2 = c(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrC3 = c(cipher, 2, bArr, this.d, i);
        int i2 = length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[i2 + i3] ^ bArrC2[i3]) ^ bArrC[i3]) ^ bArrC3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f.get();
        cipher2.init(1, this.c, new IvParameterSpec(bArrC));
        return cipher2.doFinal(bArr, this.d, i);
    }

    public final byte[] c(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        byte[] bArrD;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(d(bArr2, this.a));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                bArrDoFinal[i6] = (byte) (bArr[(i2 + i5) + i6] ^ bArrDoFinal[i6]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i5 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrD = d(bArrCopyOfRange, this.a);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.b, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                bArrCopyOf[i4] = (byte) (bArrCopyOf[i4] ^ bArrCopyOfRange[i4]);
                i4++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrD = bArrCopyOf;
        }
        return cipher.doFinal(d(bArrDoFinal, bArrD));
    }
}
