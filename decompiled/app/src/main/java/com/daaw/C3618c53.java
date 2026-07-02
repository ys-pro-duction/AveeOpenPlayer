package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.daaw.c53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3618c53 {
    public static final C3618c53 c = new C3618c53();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final InterfaceC8100s53 a = new N43();

    public static C3618c53 a() {
        return c;
    }

    public final InterfaceC7821r53 b(Class cls) {
        AbstractC8374t43.c(cls, "messageType");
        InterfaceC7821r53 interfaceC7821r53 = (InterfaceC7821r53) this.b.get(cls);
        if (interfaceC7821r53 != null) {
            return interfaceC7821r53;
        }
        InterfaceC7821r53 interfaceC7821r53A = this.a.a(cls);
        AbstractC8374t43.c(cls, "messageType");
        InterfaceC7821r53 interfaceC7821r532 = (InterfaceC7821r53) this.b.putIfAbsent(cls, interfaceC7821r53A);
        return interfaceC7821r532 == null ? interfaceC7821r53A : interfaceC7821r532;
    }
}
