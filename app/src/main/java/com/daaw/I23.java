package com.daaw;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes3.dex */
public final class I23 implements O23 {
    @Override // com.daaw.O23
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
