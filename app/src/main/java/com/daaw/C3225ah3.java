package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.daaw.ah3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3225ah3 {
    public static final C3225ah3 c = new C3225ah3();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final InterfaceC5464ih3 a = new C9103vg3();

    public static C3225ah3 a() {
        return c;
    }

    public final InterfaceC4907gh3 b(Class cls) {
        AbstractC10214zf3.c(cls, "messageType");
        InterfaceC4907gh3 interfaceC4907gh3 = (InterfaceC4907gh3) this.b.get(cls);
        if (interfaceC4907gh3 != null) {
            return interfaceC4907gh3;
        }
        InterfaceC4907gh3 interfaceC4907gh3A = this.a.a(cls);
        AbstractC10214zf3.c(cls, "messageType");
        AbstractC10214zf3.c(interfaceC4907gh3A, "schema");
        InterfaceC4907gh3 interfaceC4907gh32 = (InterfaceC4907gh3) this.b.putIfAbsent(cls, interfaceC4907gh3A);
        return interfaceC4907gh32 == null ? interfaceC4907gh3A : interfaceC4907gh32;
    }
}
