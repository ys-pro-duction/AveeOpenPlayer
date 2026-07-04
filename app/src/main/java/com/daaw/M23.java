package com.daaw;

import java.security.MessageDigest;
import java.security.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class M23 implements O23 {
    @Override // com.daaw.O23
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
