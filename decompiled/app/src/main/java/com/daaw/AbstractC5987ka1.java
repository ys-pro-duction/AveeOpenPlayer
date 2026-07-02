package com.daaw;

/* JADX INFO: renamed from: com.daaw.ka1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5987ka1 {
    public static InterfaceC5781jp a(InterfaceC5781jp interfaceC5781jp) {
        G10.g(interfaceC5781jp, "composer");
        return interfaceC5781jp;
    }

    public static final void b(InterfaceC5781jp interfaceC5781jp, Object obj, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "block");
        if (interfaceC5781jp.n() || !G10.c(interfaceC5781jp.f(), obj)) {
            interfaceC5781jp.H(obj);
            interfaceC5781jp.w(obj, interfaceC3429bR);
        }
    }
}
