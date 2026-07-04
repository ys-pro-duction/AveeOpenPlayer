package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
public final class EW2 extends ThreadLocal {
    public static final Cipher a() {
        try {
            return (Cipher) G23.b.a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
