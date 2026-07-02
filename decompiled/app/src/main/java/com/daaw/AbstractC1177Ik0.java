package com.daaw;

import com.daaw.InterfaceC1073Hk0;

/* JADX INFO: renamed from: com.daaw.Ik0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1177Ik0 {
    public static boolean a(InterfaceC1073Hk0.b bVar, NQ nq) {
        G10.g(nq, "predicate");
        return ((Boolean) nq.invoke(bVar)).booleanValue();
    }

    public static Object b(InterfaceC1073Hk0.b bVar, Object obj, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "operation");
        return interfaceC3429bR.invoke(obj, bVar);
    }

    public static Object c(InterfaceC1073Hk0.b bVar, Object obj, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "operation");
        return interfaceC3429bR.invoke(bVar, obj);
    }
}
