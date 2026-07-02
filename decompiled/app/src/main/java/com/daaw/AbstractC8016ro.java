package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC8016ro {
    public static Object a(InterfaceC8295so interfaceC8295so, C4205eC0 c4205eC0) {
        InterfaceC7569qB0 interfaceC7569qB0G = interfaceC8295so.g(c4205eC0);
        if (interfaceC7569qB0G == null) {
            return null;
        }
        return interfaceC7569qB0G.get();
    }

    public static Object b(InterfaceC8295so interfaceC8295so, Class cls) {
        return interfaceC8295so.c(C4205eC0.b(cls));
    }

    public static InterfaceC7784qy c(InterfaceC8295so interfaceC8295so, Class cls) {
        return interfaceC8295so.h(C4205eC0.b(cls));
    }

    public static InterfaceC7569qB0 d(InterfaceC8295so interfaceC8295so, Class cls) {
        return interfaceC8295so.g(C4205eC0.b(cls));
    }

    public static Set e(InterfaceC8295so interfaceC8295so, C4205eC0 c4205eC0) {
        return (Set) interfaceC8295so.b(c4205eC0).get();
    }

    public static Set f(InterfaceC8295so interfaceC8295so, Class cls) {
        return interfaceC8295so.e(C4205eC0.b(cls));
    }
}
