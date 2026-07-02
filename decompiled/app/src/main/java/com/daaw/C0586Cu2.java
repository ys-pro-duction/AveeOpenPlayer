package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.daaw.Cu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0586Cu2 {
    public static final C0586Cu2 c = new C0586Cu2();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final InterfaceC2394Tw2 a = new C9959yk2();

    public static C0586Cu2 a() {
        return c;
    }

    public final InterfaceC7500pw2 b(Class cls) {
        J82.c(cls, "messageType");
        InterfaceC7500pw2 interfaceC7500pw2 = (InterfaceC7500pw2) this.b.get(cls);
        if (interfaceC7500pw2 != null) {
            return interfaceC7500pw2;
        }
        InterfaceC7500pw2 interfaceC7500pw2A = this.a.a(cls);
        J82.c(cls, "messageType");
        InterfaceC7500pw2 interfaceC7500pw22 = (InterfaceC7500pw2) this.b.putIfAbsent(cls, interfaceC7500pw2A);
        return interfaceC7500pw22 == null ? interfaceC7500pw2A : interfaceC7500pw22;
    }
}
