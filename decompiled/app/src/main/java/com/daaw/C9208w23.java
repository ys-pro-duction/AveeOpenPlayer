package com.daaw;

import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.w23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9208w23 implements F23 {
    public final O23 a;

    @Override // com.daaw.F23
    public final Object zza(String str) {
        Iterator it = G23.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.a.a(str, null);
    }
}
