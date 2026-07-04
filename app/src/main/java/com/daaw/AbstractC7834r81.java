package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.r81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7834r81 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final AtomicInteger b = new AtomicInteger(0);

    public static final int f(AbstractC7834r81 abstractC7834r81, String str) {
        G10.g(abstractC7834r81, "this$0");
        G10.g(str, "it");
        return abstractC7834r81.b.getAndIncrement();
    }

    public abstract int b(ConcurrentHashMap concurrentHashMap, String str, NQ nq);

    public final C3819cp0 c(J50 j50) {
        G10.g(j50, "kClass");
        return new C3819cp0(d(j50));
    }

    public final int d(J50 j50) {
        G10.g(j50, "kClass");
        String strD = j50.d();
        G10.d(strD);
        return e(strD);
    }

    public final int e(String str) {
        G10.g(str, "keyQualifiedName");
        return b(this.a, str, new C7556q81(this));
    }

    public final Collection g() {
        Collection collectionValues = this.a.values();
        G10.f(collectionValues, "<get-values>(...)");
        return collectionValues;
    }
}
