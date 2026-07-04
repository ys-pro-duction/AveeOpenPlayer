package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BT2 {
    public static AT2 a(String str) throws GeneralSecurityException {
        MT2 mt2 = (MT2) AbstractC3165aU2.e().get("AES128_GCM");
        if (mt2 != null) {
            return AT2.a(mt2);
        }
        throw new GeneralSecurityException("cannot find key template: AES128_GCM");
    }
}
