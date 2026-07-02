package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: com.daaw.lV2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6256lV2 {
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;
    public C6535mV2 d = C6535mV2.d;

    public /* synthetic */ C6256lV2(AbstractC5968kV2 abstractC5968kV2) {
    }

    public final C6256lV2 a(int i) {
        this.b = 12;
        return this;
    }

    public final C6256lV2 b(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final C6256lV2 c(int i) {
        this.c = 16;
        return this;
    }

    public final C6256lV2 d(C6535mV2 c6535mV2) {
        this.d = c6535mV2;
        return this;
    }

    public final C7093oV2 e() throws GeneralSecurityException {
        Integer num = this.a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.b.getClass();
        this.c.getClass();
        return new C7093oV2(iIntValue, 12, 16, this.d, null);
    }
}
