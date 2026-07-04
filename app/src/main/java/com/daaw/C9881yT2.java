package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.yT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9881yT2 {
    public static final Logger b = Logger.getLogger(C9881yT2.class.getName());
    public final ConcurrentMap a;

    public C9881yT2() {
        this.a = new ConcurrentHashMap();
    }

    public final InterfaceC9044vT2 a(String str, Class cls) throws GeneralSecurityException {
        C9602xT2 c9602xT2E = e(str);
        if (c9602xT2E.a.j().contains(cls)) {
            try {
                return new C9323wT2(c9602xT2E.a, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }
        String name = cls.getName();
        AbstractC5697jX2 abstractC5697jX2 = c9602xT2E.a;
        String strValueOf = String.valueOf(abstractC5697jX2.getClass());
        Set<Class> setJ = abstractC5697jX2.j();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : setJ) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb.toString());
    }

    public final InterfaceC9044vT2 b(String str) {
        return e(str).a();
    }

    public final synchronized void c(AbstractC5697jX2 abstractC5697jX2) {
        if (!TW2.a(abstractC5697jX2.f())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(abstractC5697jX2.getClass()) + " as it is not FIPS compatible.");
        }
        f(new C9602xT2(abstractC5697jX2), false);
    }

    public final boolean d(String str) {
        return this.a.containsKey(str);
    }

    public final synchronized C9602xT2 e(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (C9602xT2) this.a.get(str);
    }

    public final synchronized void f(C9602xT2 c9602xT2, boolean z) {
        try {
            String strZzc = c9602xT2.a().zzc();
            C9602xT2 c9602xT22 = (C9602xT2) this.a.get(strZzc);
            if (c9602xT22 != null && !c9602xT22.a.getClass().equals(c9602xT2.a.getClass())) {
                b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strZzc));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzc, c9602xT22.a.getClass().getName(), c9602xT2.a.getClass().getName()));
            }
            this.a.putIfAbsent(strZzc, c9602xT2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C9881yT2(C9881yT2 c9881yT2) {
        this.a = new ConcurrentHashMap(c9881yT2.a);
    }
}
