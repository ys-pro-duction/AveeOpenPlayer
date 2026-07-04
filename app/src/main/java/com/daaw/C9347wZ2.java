package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.wZ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9347wZ2 implements KY2 {
    public final RY2 a;

    public C9347wZ2(RY2 ry2) throws GeneralSecurityException {
        if (!TW2.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = ry2;
    }
}
