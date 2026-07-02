package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class UY2 extends MX2 {
    public UY2(Class cls) {
        super(cls);
    }

    @Override // com.daaw.MX2
    public final /* bridge */ /* synthetic */ Object a(U43 u43) throws GeneralSecurityException {
        C3877d13 c3877d13 = (C3877d13) u43;
        EnumC3041a13 enumC3041a13N = c3877d13.R().N();
        SecretKeySpec secretKeySpec = new SecretKeySpec(c3877d13.S().e(), "HMAC");
        int iM = c3877d13.R().M();
        EnumC3041a13 enumC3041a13 = EnumC3041a13.UNKNOWN_HASH;
        int iOrdinal = enumC3041a13N.ordinal();
        if (iOrdinal == 1) {
            return new U23(new T23("HMACSHA1", secretKeySpec), iM);
        }
        if (iOrdinal == 2) {
            return new U23(new T23("HMACSHA384", secretKeySpec), iM);
        }
        if (iOrdinal == 3) {
            return new U23(new T23("HMACSHA256", secretKeySpec), iM);
        }
        if (iOrdinal == 4) {
            return new U23(new T23("HMACSHA512", secretKeySpec), iM);
        }
        if (iOrdinal == 5) {
            return new U23(new T23("HMACSHA224", secretKeySpec), iM);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
