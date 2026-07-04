package com.daaw;

import com.daaw.AbstractC4512fJ0;

/* JADX INFO: renamed from: com.daaw.rw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8054rw {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(InterfaceC1416Ks interfaceC1416Ks) {
        Object objA;
        if (interfaceC1416Ks instanceof C6177lC) {
            return interfaceC1416Ks.toString();
        }
        try {
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            objA = AbstractC4512fJ0.a(interfaceC1416Ks + '@' + b(interfaceC1416Ks));
        } catch (Throwable th) {
            AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
            objA = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th));
        }
        if (AbstractC4512fJ0.b(objA) != null) {
            objA = interfaceC1416Ks.getClass().getName() + '@' + b(interfaceC1416Ks);
        }
        return (String) objA;
    }
}
