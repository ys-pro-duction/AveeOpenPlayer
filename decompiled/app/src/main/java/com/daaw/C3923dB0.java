package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.daaw.dB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3923dB0 {
    public static final C3923dB0 c = new C3923dB0();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final EN0 a = new C7977rg0();

    public static C3923dB0 a() {
        return c;
    }

    public DN0 b(Class cls, DN0 dn0) {
        AbstractC3317b10.b(cls, "messageType");
        AbstractC3317b10.b(dn0, "schema");
        return (DN0) this.b.putIfAbsent(cls, dn0);
    }

    public DN0 c(Class cls) {
        DN0 dn0B;
        AbstractC3317b10.b(cls, "messageType");
        DN0 dn0A = (DN0) this.b.get(cls);
        return (dn0A != null || (dn0B = b(cls, (dn0A = this.a.a(cls)))) == null) ? dn0A : dn0B;
    }

    public DN0 d(Object obj) {
        return c(obj.getClass());
    }
}
