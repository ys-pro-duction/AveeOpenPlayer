package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.hU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5126hU2 implements InterfaceC5681jT2 {
    public final XT2 a;
    public final KZ2 b;
    public final KZ2 c;

    public /* synthetic */ C5126hU2(XT2 xt2, AbstractC4847gU2 abstractC4847gU2) {
        KZ2 kz2A;
        this.a = xt2;
        if (xt2.f()) {
            LZ2 lz2B = C9060vX2.a().b();
            QZ2 qz2A = AbstractC8216sX2.a(xt2);
            this.b = lz2B.a(qz2A, "aead", "encrypt");
            kz2A = lz2B.a(qz2A, "aead", "decrypt");
        } else {
            kz2A = AbstractC8216sX2.a;
            this.b = kz2A;
        }
        this.c = kz2A;
    }

    @Override // com.daaw.InterfaceC5681jT2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (PT2 pt2 : this.a.e(bArrCopyOf)) {
                try {
                    byte[] bArrA = ((InterfaceC5681jT2) pt2.e()).a(bArrCopyOfRange, bArr2);
                    pt2.a();
                    int length2 = bArrCopyOfRange.length;
                    return bArrA;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (PT2 pt22 : this.a.e(AbstractC8200sT2.a)) {
            try {
                byte[] bArrA2 = ((InterfaceC5681jT2) pt22.e()).a(bArr, bArr2);
                pt22.a();
                return bArrA2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
