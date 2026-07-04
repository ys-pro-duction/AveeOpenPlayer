package com.daaw;

import com.daaw.AbstractC0656Dk;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T {
    public final AbstractC0656Dk a(InterfaceC8468tR interfaceC8468tR) {
        G10.g(interfaceC8468tR, "functionDescriptor");
        for (C0864Fk c0864Fk : b()) {
            if (c0864Fk.b(interfaceC8468tR)) {
                return c0864Fk.a(interfaceC8468tR);
            }
        }
        return AbstractC0656Dk.a.b;
    }

    public abstract List b();
}
