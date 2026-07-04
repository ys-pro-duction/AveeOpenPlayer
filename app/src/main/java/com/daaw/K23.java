package com.daaw;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class K23 implements O23 {
    @Override // com.daaw.O23
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
