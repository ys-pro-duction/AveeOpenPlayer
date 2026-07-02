package com.daaw;

/* JADX INFO: renamed from: com.daaw.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3908d8 {
    public static final InterfaceC3072a8 a(InterfaceC3072a8 interfaceC3072a8, InterfaceC3072a8 interfaceC3072a82) {
        G10.g(interfaceC3072a8, "first");
        G10.g(interfaceC3072a82, "second");
        return interfaceC3072a8.isEmpty() ? interfaceC3072a82 : interfaceC3072a82.isEmpty() ? interfaceC3072a8 : new C7464pp(interfaceC3072a8, interfaceC3072a82);
    }
}
