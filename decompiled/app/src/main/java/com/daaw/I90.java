package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class I90 {
    public static final InterfaceC1413Kr0 a(E90 e90) {
        G10.g(e90, "<this>");
        InterfaceC1413Kr0 interfaceC1413Kr0K0 = e90.k0();
        if (interfaceC1413Kr0K0 != null) {
            return interfaceC1413Kr0K0;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }
}
