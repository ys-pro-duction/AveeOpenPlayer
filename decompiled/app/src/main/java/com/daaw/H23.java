package com.daaw;

import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
public final class H23 implements O23 {
    @Override // com.daaw.O23
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
