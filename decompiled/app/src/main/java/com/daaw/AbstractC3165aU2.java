package com.daaw;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.aU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3165aU2 {
    public static final Logger a = Logger.getLogger(AbstractC3165aU2.class.getName());
    public static final AtomicReference b = new AtomicReference(new C9881yT2());
    public static final ConcurrentMap c = new ConcurrentHashMap();
    public static final ConcurrentMap d = new ConcurrentHashMap();
    public static final ConcurrentMap e = new ConcurrentHashMap();
    public static final ConcurrentMap f = new ConcurrentHashMap();

    public static synchronized C6965o13 a(C9482x13 c9482x13) {
        InterfaceC9044vT2 interfaceC9044vT2B;
        interfaceC9044vT2B = ((C9881yT2) b.get()).b(c9482x13.R());
        if (!((Boolean) d.get(c9482x13.R())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(c9482x13.R())));
        }
        return interfaceC9044vT2B.b(c9482x13.Q());
    }

    public static Class b(Class cls) {
        try {
            return C9339wX2.a().b(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object c(C6965o13 c6965o13, Class cls) {
        return d(c6965o13.R(), c6965o13.Q(), cls);
    }

    public static Object d(String str, AbstractC9213w33 abstractC9213w33, Class cls) {
        return ((C9881yT2) b.get()).a(str, cls).a(abstractC9213w33);
    }

    public static synchronized Map e() {
        return DesugarCollections.unmodifiableMap(f);
    }

    public static synchronized void f(AbstractC5697jX2 abstractC5697jX2, boolean z) {
        try {
            AtomicReference atomicReference = b;
            C9881yT2 c9881yT2 = new C9881yT2((C9881yT2) atomicReference.get());
            c9881yT2.c(abstractC5697jX2);
            Map mapC = abstractC5697jX2.a().c();
            String strD = abstractC5697jX2.d();
            h(strD, mapC, true);
            if (!((C9881yT2) atomicReference.get()).d(strD)) {
                c.put(strD, new ZT2(abstractC5697jX2));
                for (Map.Entry entry : abstractC5697jX2.a().c().entrySet()) {
                    f.put((String) entry.getKey(), (MT2) entry.getValue());
                }
            }
            d.put(strD, Boolean.TRUE);
            b.set(c9881yT2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void g(YT2 yt2) {
        C9339wX2.a().f(yt2);
    }

    public static synchronized void h(String str, Map map, boolean z) {
        try {
            ConcurrentMap concurrentMap = d;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((C9881yT2) b.get()).d(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
