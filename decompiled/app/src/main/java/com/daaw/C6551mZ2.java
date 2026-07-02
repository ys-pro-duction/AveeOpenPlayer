package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.mZ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6551mZ2 implements LT2 {
    public final XT2 a;
    public final KZ2 b;
    public final KZ2 c;

    public /* synthetic */ C6551mZ2(XT2 xt2, AbstractC6272lZ2 abstractC6272lZ2) {
        KZ2 kz2A;
        this.a = xt2;
        if (xt2.f()) {
            LZ2 lz2B = C9060vX2.a().b();
            QZ2 qz2A = AbstractC8216sX2.a(xt2);
            this.b = lz2B.a(qz2A, "mac", "compute");
            kz2A = lz2B.a(qz2A, "mac", "verify");
        } else {
            kz2A = AbstractC8216sX2.a;
            this.b = kz2A;
        }
        this.c = kz2A;
    }

    @Override // com.daaw.LT2
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        for (PT2 pt2 : this.a.e(Arrays.copyOf(bArr, 5))) {
            try {
                ((LT2) pt2.d()).a(bArr, bArr2);
                pt2.a();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        for (PT2 pt22 : this.a.e(AbstractC8200sT2.a)) {
            try {
                ((LT2) pt22.d()).a(bArr, bArr2);
                pt22.a();
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
