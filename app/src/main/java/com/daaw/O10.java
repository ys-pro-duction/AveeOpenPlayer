package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class O10 {
    public static final C2448Uk0 a = new C2448Uk0("InvalidModuleNotifier");

    public static final void a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "<this>");
        AbstractC6314li0.a(interfaceC2968Zk0.z0(a));
        throw new N10("Accessing invalid module descriptor " + interfaceC2968Zk0);
    }
}
