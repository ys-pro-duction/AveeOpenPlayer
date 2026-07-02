package com.daaw;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.r23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7806r23 implements InterfaceC5681jT2 {
    public final FW2 a;
    public final byte[] b;

    public C7806r23(byte[] bArr) throws GeneralSecurityException {
        Y23 y23B = Y23.b(new byte[0]);
        if (!TW2.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = new FW2(bArr, true);
        this.b = y23B.c();
    }

    @Override // com.daaw.InterfaceC5681jT2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (length == 0) {
            return this.a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
        }
        Charset charset = AbstractC6547mY2.a;
        if (bArr.length >= length) {
            for (int i = 0; i < bArr3.length; i++) {
                if (bArr[i] == bArr3[i]) {
                }
            }
            byte[] bArr4 = this.b;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr.length);
            return this.a.a(Arrays.copyOf(bArrCopyOfRange, 12), bArrCopyOfRange, bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
