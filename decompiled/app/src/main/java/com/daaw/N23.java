package com.daaw;

import java.security.Provider;
import java.security.Signature;

/* JADX INFO: loaded from: classes3.dex */
public final class N23 implements O23 {
    @Override // com.daaw.O23
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
