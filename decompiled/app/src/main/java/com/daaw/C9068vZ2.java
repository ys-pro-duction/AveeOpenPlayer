package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.vZ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9068vZ2 implements KY2 {
    public final C7663qY2 a;

    public C9068vZ2(C7663qY2 c7663qY2) throws GeneralSecurityException {
        if (!TW2.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.a = c7663qY2;
    }
}
