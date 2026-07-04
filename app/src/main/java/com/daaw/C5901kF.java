package com.daaw;

import com.daaw.U31;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.kF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5901kF {
    public static final U31.b b = U31.b.B;
    public final C5465ii a;

    public C5901kF(byte[] bArr) {
        if (!b.a()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.a = C5465ii.a(bArr);
    }

    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!AbstractC5342iF.s(bArr2, bArr, this.a.c())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
