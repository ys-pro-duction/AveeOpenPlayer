package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class O2 {
    public static final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void b(InterfaceC5781jp interfaceC5781jp, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC5781jp, "composer");
        G10.g(interfaceC3429bR, "composable");
        ((InterfaceC3429bR) V71.e(interfaceC3429bR, 2)).invoke(interfaceC5781jp, 1);
    }

    public static final Object c(InterfaceC5781jp interfaceC5781jp, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC5781jp, "composer");
        G10.g(interfaceC3429bR, "composable");
        return ((InterfaceC3429bR) V71.e(interfaceC3429bR, 2)).invoke(interfaceC5781jp, 1);
    }
}
