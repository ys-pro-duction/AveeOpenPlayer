package com.daaw;

import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class J23 implements O23 {
    @Override // com.daaw.O23
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
