package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
public final class GV2 {
    public Integer a = null;
    public HV2 b = HV2.d;

    public /* synthetic */ GV2(BV2 bv2) {
    }

    public final GV2 a(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final GV2 b(HV2 hv2) {
        this.b = hv2;
        return this;
    }

    public final JV2 c() throws GeneralSecurityException {
        Integer num = this.a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.b != null) {
            return new JV2(num.intValue(), this.b, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
