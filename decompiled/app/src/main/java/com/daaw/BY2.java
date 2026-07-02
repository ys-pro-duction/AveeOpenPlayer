package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
public final class BY2 {
    public Integer a = null;
    public Integer b = null;
    public CY2 c = CY2.e;

    public /* synthetic */ BY2(AY2 ay2) {
    }

    public final BY2 a(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final BY2 b(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.b = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    public final BY2 c(CY2 cy2) {
        this.c = cy2;
        return this;
    }

    public final EY2 d() throws GeneralSecurityException {
        Integer num = this.a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.c != null) {
            return new EY2(num.intValue(), this.b.intValue(), this.c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
