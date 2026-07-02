package com.daaw;

/* JADX INFO: renamed from: com.daaw.il0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5481il0 {
    public static final InterfaceC5203hl0 a(InterfaceC4684ft interfaceC4684ft) {
        G10.g(interfaceC4684ft, "<this>");
        InterfaceC5203hl0 interfaceC5203hl0 = (InterfaceC5203hl0) interfaceC4684ft.a(InterfaceC5203hl0.n);
        if (interfaceC5203hl0 != null) {
            return interfaceC5203hl0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
        return a(interfaceC1416Ks.getContext()).p0(nq, interfaceC1416Ks);
    }
}
