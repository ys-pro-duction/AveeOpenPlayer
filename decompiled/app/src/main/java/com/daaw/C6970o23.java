package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: com.daaw.o23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6970o23 extends ThreadLocal {
    public static final Cipher a() {
        try {
            return (Cipher) G23.b.a("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
